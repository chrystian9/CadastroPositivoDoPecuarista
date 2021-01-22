package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryAdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceAdminCadastroPositivo;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ControllerAdminCadastroPositivo {

    @Autowired
    RepositoryAdminCadastroPositivo repositoryAdminCadastroPositivo;

    @Autowired
    ServiceAdminCadastroPositivo serviceAdminCadastroPositivo;

    @PostMapping("/insereAdmin/{cpf, codigoDeAcesso}")
    public ResponseEntity<AdminCadastroPositivo> insereAdmin(String cpf, String codigoDeAcesso
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/){

        return serviceAdminCadastroPositivo.cadastrarAdmin(cpf, codigoDeAcesso);
    }

    /*
    @GetMapping("/buscaAdmin")
    public ResponseEntity<Optional<AdminCadastroPositivo>> buscaAdmin(
            @Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo){

    }*/

    /*public ResponseEntity<String> delete(@Valid @RequestBody Pecuarista pecuarista){

     */
}
