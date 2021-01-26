package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryAdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl.ServiceAdminCadastroPositivoImpl;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ControllerAdminCadastroPositivo {

    @Autowired
    RepositoryAdminCadastroPositivo repositoryAdminCadastroPositivo;
    @Autowired
    ServiceAdminCadastroPositivoImpl serviceAdminCadastroPositivo;

    @PostMapping("/insereAdmin")
    public ResponseEntity<AdminCadastroPositivo> insereAdmin(
            /*@PathVariable String cpf, @PathVariable String codigoDeAcesso*/
            @Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo){
        //AdminCadastroPositivo adminCadastroPositivo = serviceAdminCadastroPositivo.cadastrarAdmin(cpf, codigoDeAcesso);

        repositoryAdminCadastroPositivo.save(adminCadastroPositivo);
//        if (adminCadastroPositivo == null){
//            return ResponseEntity.notFound().build();
//        }
        return ResponseEntity.ok().body(adminCadastroPositivo);
    }

    @GetMapping("/buscaAdmin/{cpf}")
    public ResponseEntity<AdminCadastroPositivo> buscaAdmin(@PathVariable String cpf
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/){
        AdminCadastroPositivo adminCadastroPositivo = serviceAdminCadastroPositivo.buscaAdmin(cpf);
        if (adminCadastroPositivo == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(adminCadastroPositivo);
    }

    @DeleteMapping("/deletaAdmin/{cpf}")
    public ResponseEntity<String> delete(@PathVariable String cpf
            /*@Valid @RequestBody AdminCadastroPositivo adminCadastroPositivo*/) {
        String result = serviceAdminCadastroPositivo.deletaAdmin(cpf);
        if (result == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/aprovaFrigorifico/{cnpj}")
    public ResponseEntity<Frigorifico> aprovaFrigorifico(@PathVariable String cnpj){
        Frigorifico frigorifico = serviceAdminCadastroPositivo.aprovaFrigorifico(cnpj);
        if (frigorifico == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(frigorifico);
    }
}
