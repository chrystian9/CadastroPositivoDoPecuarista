package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryFrigorifico;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceFrigorifico;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceFrigorificoImpl implements ServiceFrigorifico {
    @Autowired
    RepositoryFrigorifico repositoryFrigorifico;

    @Autowired
    ServiceAdminCadastroPositivoImpl serviceAdminCadastroPositivo;
    @Override
    public Frigorifico insereFrigorigico(String cnpj) {
        Frigorifico frigorifico = new Frigorifico(cnpj);
        repositoryFrigorifico.save(frigorifico);

        return frigorifico;
    }

    public List<Frigorifico> listaFrigorificos(){
        List<Frigorifico> frigorificos = repositoryFrigorifico.findAll();
        if(frigorificos.isEmpty()){
            return null;
        }
        return frigorificos;
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

    public String editaFrigorifico(Frigorifico x) {
        repositoryFrigorifico.save(x);

        return "Atualizado com sucesso";
    }
}
