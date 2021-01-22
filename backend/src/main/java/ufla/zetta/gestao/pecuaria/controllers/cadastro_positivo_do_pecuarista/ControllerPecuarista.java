package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryPecuarista;

import java.util.List;

@Controller
public class ControllerPecuarista {
    @Autowired
    RepositoryPecuarista repositoryPecuarista;

    @DeleteMapping("/deletaCadastroPecuarista/{cnpj}")
    public ResponseEntity<String> deleteCadastroPositivo(@PathVariable String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                repositoryPecuarista.deleteById(x.getCadastroPositivo().getId());
                return ResponseEntity.ok(x.getCadastroPositivo().getId() + ": pecuarista deletada com sucesso");
            }
        }
        return ResponseEntity.notFound().build();
    }
}
