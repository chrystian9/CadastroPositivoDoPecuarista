package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Documento;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryCadastroPositivo;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryPecuarista;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ControllerCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;
    @Autowired
    RepositoryPecuarista repositoryPecuarista;

    @PostMapping("/insereCadastroPositivo")
    public ResponseEntity<CadastroPositivo> insereCadastroPositivo(/*@Valid @RequestBody CadastroPositivo cadastroPositivo*/){
        Pecuarista pecuarista = new Pecuarista("14572457000185");
        CadastroPositivo novoCadastro = new CadastroPositivo(pecuarista);

        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento("Ativo", "CAR", novoCadastro));
        documentos.add(new Documento("Faz", "descarte_de_residuos_solidos", novoCadastro));
        documentos.add(new Documento("Deferido", "licenciamento_ambiental", novoCadastro));
        documentos.add(new Documento("Possui", "outorga_da_agua", novoCadastro));
        documentos.add(new Documento("Ativo", "certificado_de_regularidade_ibama", novoCadastro));

        novoCadastro.setDocumentos(documentos);
        novoCadastro.atualizaScore();

        repositoryCadastroPositivo.save(novoCadastro);
        return ResponseEntity.ok().body(novoCadastro);
    }

    @GetMapping("/listarCadastrosPositivos")
    public ResponseEntity<List<CadastroPositivo>> listarCadastrosPositivos(){
        List<CadastroPositivo> cadastrosPositivos = repositoryCadastroPositivo.findAll();
        List<Long> ids = new ArrayList<>();
        for (CadastroPositivo x : cadastrosPositivos) {
            ids.add(x.getId());
        }
        if(cadastrosPositivos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(cadastrosPositivos);
    }

    @GetMapping("/buscaCadastroPositivo/{cnpj}")
    public ResponseEntity<CadastroPositivo> buscaCadastroPositivo(@PathVariable String cnpj){
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                return ResponseEntity.ok().body(x.getCadastroPositivo());
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping(value = "/editarCadastroPositivo/{cnpj}")
    public ResponseEntity<String> editarCadastroPositivo(
            /*@Valid @RequestBody CadastroPositivo cadastroPositivo*/@PathVariable String cnpj){
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                //repositoryCadastroPositivo.save(cadastroPositivo);
                repositoryCadastroPositivo.save(x.getCadastroPositivo());
                return ResponseEntity.ok("Cadastro atualizado com sucesso");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletaCadastroPecuarista/{cnpj}")
    public ResponseEntity<String> deleteCadastroPositivo(@PathVariable String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                repositoryCadastroPositivo.deleteById(x.getCadastroPositivo().getId());
                return ResponseEntity.ok(x.getCadastroPositivo().getId() + ": cadastro deletada com sucesso");
            }
        }
        return ResponseEntity.notFound().build();
    }
}