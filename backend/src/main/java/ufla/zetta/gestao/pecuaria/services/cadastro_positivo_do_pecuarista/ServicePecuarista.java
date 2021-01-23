package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import org.springframework.http.ResponseEntity;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;

public interface ServicePecuarista {
    Pecuarista buscaPecuarista(String cnpj);
    ResponseEntity<String> deletaPecuarista(String cnpj);
}
