package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import org.springframework.http.ResponseEntity;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;

import java.util.List;

public interface ServiceFrigorifico {
    ResponseEntity<Frigorifico> insereFrigorigico(String cnpj);
    ResponseEntity<List<Frigorifico>> listaFrigorificos();
    List<Frigorifico> listaFrigorificosNaoAprovados();
    ResponseEntity<String> editaFrigorifico(Frigorifico x);
}
