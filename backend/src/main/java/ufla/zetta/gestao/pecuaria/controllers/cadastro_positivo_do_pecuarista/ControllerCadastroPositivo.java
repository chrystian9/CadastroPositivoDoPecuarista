package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryCadastroPositivo;

@Controller
public class ControllerCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;

    /*
    @PostMapping("/insereCadastroPositivo")
    public CadastroPositivo insereCadastroPositivo(@Valid @RequestBody CadastroPositivo cadastroPositivo){
        Pecuarista aux = new Pecuarista("70770770700");
        CadastroPositivo novoCadastro = new CadastroPositivo(aux);

    }*/

    /*
    @GetMapping("/buscaCadastroPositivo")
    public ResponseEntity<Optional<CadastroPositivo>> buscaCadastroPositivo(@Valid @RequestBody Pecuarista pecuarista){

    }*/

    /*public ResponseEntity<String> delete(@Valid @RequestBody Pecuarista pecuarista){

     */
}