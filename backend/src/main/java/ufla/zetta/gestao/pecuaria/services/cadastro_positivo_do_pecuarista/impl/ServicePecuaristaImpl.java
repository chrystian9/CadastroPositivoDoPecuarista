package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryPecuarista;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServicePecuarista;

import java.util.List;

@Service
public class ServicePecuaristaImpl implements ServicePecuarista {
    @Autowired
    RepositoryPecuarista repositoryPecuarista;

    @Override
    public Pecuarista buscaPecuarista(String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista pecuarista : pecuaristas) {
            if (pecuarista.getCnpj().equals(cnpj)) {
                return pecuarista;
            }
        }
        return null;
    }

    @Override
    public String deletaPecuarista(String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                repositoryPecuarista.delete(x);
                return x.getCnpj() + " deletado";
            }
        }
        return null;
    }
}
