package com.squad_one.cadastro_positivo_do_pecuarista.repository;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.Documento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryDocumento extends CrudRepository<Documento, Long> {
    List<Documento> findByCadastroPositivoId(Long cadastroPositivoId);
    Optional<Documento> findByIdAndCadastroPositivoId(Long id, Long cadastroPositivoId);
}