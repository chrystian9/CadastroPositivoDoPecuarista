package ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;

@Repository
public interface RepositoryPecuarista extends JpaRepository<Pecuarista, Long> {
}