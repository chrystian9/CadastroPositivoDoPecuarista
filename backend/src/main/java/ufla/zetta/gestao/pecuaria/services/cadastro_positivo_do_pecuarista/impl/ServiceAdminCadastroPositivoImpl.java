package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryAdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceAdminCadastroPositivo;

@Service
public class ServiceAdminCadastroPositivoImpl implements ServiceAdminCadastroPositivo {

    @Autowired
    RepositoryAdminCadastroPositivo repositoryAdminCadastroPositivo;

    @Override
    public ResponseEntity<AdminCadastroPositivo> cadastrarAdmin(String cpf, String codigoDeAcesso) {
        if(AdminCadastroPositivo.getCodigoDeAcesso().equals(codigoDeAcesso)){
            AdminCadastroPositivo adminCadastroPositivo = new AdminCadastroPositivo(cpf);

            repositoryAdminCadastroPositivo.save(adminCadastroPositivo);

            return ResponseEntity.ok().body(adminCadastroPositivo);
        }
        return ResponseEntity.notFound().build();
    }
}
