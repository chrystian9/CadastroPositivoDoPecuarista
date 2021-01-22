package ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Documento;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryDocumento extends JpaRepository<Documento, Long> {
    List<Documento> findByCadastroPositivoId(Long cadastroPositivoId);
    Optional<Documento> findByIdAndCadastroPositivoId(Long id, Long cadastroPositivoId);
}