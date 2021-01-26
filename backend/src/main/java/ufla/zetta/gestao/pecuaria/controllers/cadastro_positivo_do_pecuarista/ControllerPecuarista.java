package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryPecuarista;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServicePecuarista;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl.ServicePecuaristaImpl;

import java.util.List;

@Controller
public class ControllerPecuarista {
//    @Autowired
//    RepositoryPecuarista repositoryPecuarista;
//
    @Autowired
    ServicePecuaristaImpl servicePecuarista;

    @DeleteMapping("/deletaPecuarista/{cnpj}")
    public ResponseEntity<String> deleteCadastroPositivo(@PathVariable String cnpj) {

        return ResponseEntity.ok().body(servicePecuarista.deletaPecuarista(cnpj));
    }
}
