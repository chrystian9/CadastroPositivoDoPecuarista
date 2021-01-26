package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Frigorifico;

import java.util.List;

public interface ServiceFrigorifico {
    Frigorifico insereFrigorigico(String cnpj);
    List<Frigorifico> listaFrigorificos();
    List<Frigorifico> listaFrigorificosNaoAprovados();
    String editaFrigorifico(Frigorifico x);
}
