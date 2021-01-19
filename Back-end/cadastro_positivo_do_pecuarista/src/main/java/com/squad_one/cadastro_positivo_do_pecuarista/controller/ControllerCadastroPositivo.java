package com.squad_one.cadastro_positivo_do_pecuarista.controller;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.CadastroPositivo;
import com.squad_one.cadastro_positivo_do_pecuarista.repository.RepositoryCadastroPositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class ControllerCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;

    @PostMapping("/insereCadastroPositivo")
    public CadastroPositivo insereCadastroPositivo(@Valid @RequestBody CadastroPositivo cadastroPositivo){

    }
}
