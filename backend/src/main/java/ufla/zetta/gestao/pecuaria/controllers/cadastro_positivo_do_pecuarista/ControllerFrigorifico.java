package ufla.zetta.gestao.pecuaria.controllers.cadastro_positivo_do_pecuarista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Documento;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryFrigorifico;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerFrigorifico {
    @Autowired
    RepositoryFrigorifico repositoryFrigorifico;

    @PostMapping("/insereFrigorifico")
    public Frigorifico insereFrigorifico(/*@Valid @RequestBody Frigorifico frigorifico*/@PathVariable String cnpj){
        Frigorifico frigorifico = new Frigorifico(cnpj);
        repositoryFrigorifico.save(frigorifico);

        return frigorifico;
    }
}
