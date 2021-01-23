package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;0
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryAdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl.ServiceAdminCadastroPositivoImpl;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ControllerAdminCadastroPositivo {
//
//    @Autowired
//    RepositoryAdminCadastroPositivo repositoryAdminCadastroPositivo;

    @Autowired
    ServiceAdminCadastroPositivoImpl serviceAdminCadastroPositivo;

    @PostMapping("/insereAdmin/{cpf, codigoDeAcesso}")
    public ResponseEntity<AdminCadastroPositivo> insereAdmin(@PathVariable String cpf, @PathVariable String codigoDeAcesso
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/){

        return serviceAdminCadastroPositivo.cadastrarAdmin(cpf, codigoDeAcesso);
    }

    @GetMapping("/buscaAdmin/{cpf}")
    public ResponseEntity<AdminCadastroPositivo> buscaAdmin(@PathVariable String cpf
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/){

        return serviceAdminCadastroPositivo.buscaAdmin(cpf);
    }

    @DeleteMapping("/deletaAdmin/{cpf}")
    public ResponseEntity<String> delete(@PathVariable String cpf
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/) {

        return serviceAdminCadastroPositivo.deletaAdmin(cpf);
    }

    @GetMapping("/aprovaFrigorifico/{cnpj}")
    public ResponseEntity<String> aprovaFrigorifico(@PathVariable String cnpj){
        return serviceAdminCadastroPositivo.aprovaFrigorifico(cnpj);
    }
}
