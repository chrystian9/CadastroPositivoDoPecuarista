package com.squad_one.cadastro_positivo_do_pecuarista.repository;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.CadastroPositivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCadastroPositivo extends CrudRepository<CadastroPositivo, Long> {

}
