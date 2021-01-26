package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufla.zetta.gestao.pecuaria.dto.CadastroPecuaristaDto;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl.ServiceCadastroPositivoImpl;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ControllerCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;

//    @Autowired
//    RepositoryPecuarista repositoryPecuarista;

    @Autowired
    ServiceCadastroPositivoImpl serviceCadastroPositivo;

    @PostMapping("/insereCadastroPositivo")
    public ResponseEntity<CadastroPositivo> insereCadastroPositivo(
            @Valid @RequestBody CadastroPecuaristaDto cadastroPecuaristaDto){

        return ResponseEntity.ok().body(serviceCadastroPositivo.insereCadastroPositivo(cadastroPecuaristaDto));
    }

    @GetMapping("/listarCadastrosPositivos")
    public ResponseEntity<List<CadastroPositivo>> listarCadastrosPositivos(){

        return ResponseEntity.ok().body(serviceCadastroPositivo.listarCadastrosPositivos());
    }

    @GetMapping("/buscaCadastroPositivo/{cnpj}")
    public ResponseEntity<CadastroPositivo> buscaCadastroPositivo(@PathVariable String cnpj){

        return ResponseEntity.ok().body(serviceCadastroPositivo.buscaCadastroPositivo(cnpj));
    }

    @PutMapping(value = "/editarCadastroPositivo/{cnpj}")
    public ResponseEntity<String> editarCadastroPositivo(
            /*@Valid @RequestBody CadastroPositivo cadastroPositivo*/@PathVariable String cnpj){

        return ResponseEntity.ok().body(serviceCadastroPositivo.editarCadastroPositivo(cnpj));
    }

    @DeleteMapping("/deletaCadastroPecuarista/{cnpj}")
    public ResponseEntity<String> deleteCadastroPositivo(@PathVariable String cnpj) {

        return ResponseEntity.ok().body(serviceCadastroPositivo.deletaCadastroPositivo(cnpj));
    }
}