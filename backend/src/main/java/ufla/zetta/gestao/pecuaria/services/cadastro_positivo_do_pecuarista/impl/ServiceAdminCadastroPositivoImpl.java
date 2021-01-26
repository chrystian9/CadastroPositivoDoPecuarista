package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
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
    public AdminCadastroPositivo cadastrarAdmin(String cpf, String codigoDeAcesso) {
        if(AdminCadastroPositivo.confereCodigoDeAcesso(codigoDeAcesso)){
            AdminCadastroPositivo adminCadastroPositivo =
                    new AdminCadastroPositivo(cpf, "testeSenha", "testeLogin");

            repositoryAdminCadastroPositivo.save(adminCadastroPositivo);

            return adminCadastroPositivo;
        }
        return null;
    }

    @Override
    public AdminCadastroPositivo buscaAdmin(String cpf) {
        List<AdminCadastroPositivo> listaDeAdmins = repositoryAdminCadastroPositivo.findAll();
        for (AdminCadastroPositivo adminCadastroPositivo : listaDeAdmins) {
            if (adminCadastroPositivo.getCpf().equals(cpf)) {
                return adminCadastroPositivo;
            }
        }
        return null;
    }

    @Override
    public String deletaAdmin(String cpf) {
        List<AdminCadastroPositivo> listaDeAdmins = repositoryAdminCadastroPositivo.findAll();
        for (AdminCadastroPositivo x : listaDeAdmins) {
            if (x.getCpf().equals(cpf)) {
                repositoryAdminCadastroPositivo.delete(x);
                return x.getCpf() + " deletado";
            }
        }
        return null;
    }

    @Override
    public Frigorifico aprovaFrigorifico(String cnpj) {
        List<Frigorifico> frigorificos = serviceFrigorifico.listaFrigorificosNaoAprovados();

        if(frigorificos.isEmpty()){
            return null;
        }
        for (Frigorifico frigorifico : frigorificos) {
            if(frigorifico.getCnpj().equals(cnpj)){
                frigorifico.setStatus(true);
                serviceFrigorifico.editaFrigorifico(frigorifico);
                return frigorifico;
            }
        }
        return null;
    }
}
