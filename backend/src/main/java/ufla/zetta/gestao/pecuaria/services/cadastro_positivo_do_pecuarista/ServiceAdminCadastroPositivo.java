package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;

public interface ServiceAdminCadastroPositivo {
    AdminCadastroPositivo cadastrarAdmin(String cpf, String codigoDeAcesso);
    AdminCadastroPositivo buscaAdmin(String cpf);
    String deletaAdmin(String cpf);
    Frigorifico aprovaFrigorifico(String cnpj);
}
