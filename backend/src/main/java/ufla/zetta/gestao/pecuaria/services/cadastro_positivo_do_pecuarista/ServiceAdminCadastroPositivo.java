package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import org.springframework.http.ResponseEntity;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;

public interface ServiceAdminCadastroPositivo {
    ResponseEntity<AdminCadastroPositivo> cadastrarAdmin(String cpf, String codigoDeAcesso);
}
