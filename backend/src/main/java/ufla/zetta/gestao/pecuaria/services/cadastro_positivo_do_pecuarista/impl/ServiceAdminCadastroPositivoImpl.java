package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryAdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceAdminCadastroPositivo;

import java.util.List;

@Service
public class ServiceAdminCadastroPositivoImpl implements ServiceAdminCadastroPositivo {

    @Autowired
    RepositoryAdminCadastroPositivo repositoryAdminCadastroPositivo;

    @Autowired
    ServiceFrigorificoImpl serviceFrigorifico;

    @Override
    public ResponseEntity<AdminCadastroPositivo> cadastrarAdmin(String cpf, String codigoDeAcesso) {
        if(AdminCadastroPositivo.confereCodigoDeAcesso(codigoDeAcesso)){
            AdminCadastroPositivo adminCadastroPositivo = new AdminCadastroPositivo(cpf);

            repositoryAdminCadastroPositivo.save(adminCadastroPositivo);

            return ResponseEntity.ok().body(adminCadastroPositivo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<AdminCadastroPositivo> buscaAdmin(String cpf) {
        List<AdminCadastroPositivo> listaDeAdmins = repositoryAdminCadastroPositivo.findAll();
        for (AdminCadastroPositivo x : listaDeAdmins) {
            if (x.getCpf().equals(cpf)) {
                return ResponseEntity.ok().body(x);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<String> deletaAdmin(String cpf) {
        List<AdminCadastroPositivo> listaDeAdmins = repositoryAdminCadastroPositivo.findAll();
        for (AdminCadastroPositivo x : listaDeAdmins) {
            if (x.getCpf().equals(cpf)) {
                repositoryAdminCadastroPositivo.delete(x);
                return ResponseEntity.ok(x.getCpf() + " deletado");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public  aprovaFrigorifico(String cnpj) {
        List<Frigorifico> frigorificos = serviceFrigorifico.listaFrigorificosNaoAprovados();

        if(frigorificos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        for (Frigorifico x : frigorificos) {
            if(x.getCnpj().equals(cnpj)){
                x.setStatus(true);
                serviceFrigorifico.editaFrigorifico(x);
                return ResponseEntity.ok().body(x);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
