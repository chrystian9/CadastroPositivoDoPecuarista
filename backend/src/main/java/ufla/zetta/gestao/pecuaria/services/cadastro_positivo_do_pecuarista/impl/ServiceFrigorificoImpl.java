package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryFrigorifico;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceFrigorifico;

import java.util.ArrayList;
import java.util.List;

public class ServiceFrigorificoImpl implements ServiceFrigorifico {
    @Autowired
    RepositoryFrigorifico repositoryFrigorifico;

    @Autowired
    ServiceAdminCadastroPositivoImpl serviceAdminCadastroPositivo;
    @Override
    public ResponseEntity<Frigorifico> insereFrigorigico(String cnpj) {
        Frigorifico frigorifico = new Frigorifico(cnpj);
        repositoryFrigorifico.save(frigorifico);

        return ResponseEntity.ok().body(frigorifico);
    }

    public ResponseEntity<List<Frigorifico>> listaFrigorificos(){
        List<Frigorifico> frigorificos = repositoryFrigorifico.findAll();
        if(frigorificos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(frigorificos);
    }

    public List<Frigorifico> listaFrigorificosNaoAprovados(){
        List<Frigorifico> frigorificos = repositoryFrigorifico.findAll();
        List<Frigorifico> frigorificosNaoAprovados = new ArrayList<>();
        for (Frigorifico x : frigorificos) {
            if(!x.getStatus()){
                frigorificosNaoAprovados.add(x);
            }
        }

        return frigorificosNaoAprovados;
    }

    public ResponseEntity<String> editaFrigorifico(Frigorifico x) {
        repositoryFrigorifico.save(x);

        return ResponseEntity.ok("Atualizado com sucesso");
    }
}
