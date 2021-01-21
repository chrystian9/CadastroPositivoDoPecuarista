package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryCadastroPositivo;

import javax.validation.Valid;

@Controller
public class ControllerCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;
//
//    @PostMapping("/insereCadastroPositivo")
//    public CadastroPositivo insereCadastroPositivo(@Valid @RequestBody CadastroPositivo cadastroPositivo){
//
//    }
}
