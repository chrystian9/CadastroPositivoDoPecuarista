package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.dto.CadastroPecuaristaDto;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;

import java.util.List;

public interface ServiceCadastroPositivo {
    CadastroPositivo insereCadastroPositivo (CadastroPecuaristaDto cadastroPecuaristaDto);
    List<CadastroPositivo> listarCadastrosPositivos ();
    CadastroPositivo buscaCadastroPositivo(String cnpj);
    String editarCadastroPositivo(String cnpj);
    String deletaCadastroPositivo(String cnpj);
}
