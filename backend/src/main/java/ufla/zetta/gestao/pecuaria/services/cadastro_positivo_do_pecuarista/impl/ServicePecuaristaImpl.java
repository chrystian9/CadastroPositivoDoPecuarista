package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryPecuarista;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServicePecuarista;

import java.util.List;

public class ServicePecuaristaImpl implements ServicePecuarista {
    @Autowired
    RepositoryPecuarista repositoryPecuarista;

    @Override
    public Pecuarista buscaPecuarista(String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public ResponseEntity<String> deletaPecuarista(String cnpj) {
        List<Pecuarista> pecuaristas = repositoryPecuarista.findAll();
        for (Pecuarista x : pecuaristas) {
            if (x.getCnpj().equals(cnpj)) {
                repositoryPecuarista.delete(x);
                return ResponseEntity.ok(x.getCnpj() + " deletado");
            }
        }
        return ResponseEntity.notFound().build();
    }
}
