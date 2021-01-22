package ufla.zetta.gestao.pecuaria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @GetMapping("/public")
    public String HelloPublic() {

        return "Hello Public!";
    }

    @GetMapping("/private")
    public String HelloPrivate() {

        return "Hello Private!";
    }

    @GetMapping("/admin")
    public String HelloAdmin() {

        return "Hello Admin!";
    }

    @GetMapping("/teste")
    public String teste() {

        return "chegou aqui!";
    }

}
