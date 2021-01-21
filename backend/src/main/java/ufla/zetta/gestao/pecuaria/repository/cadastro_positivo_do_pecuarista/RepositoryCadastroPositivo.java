package ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;

@Repository
public interface RepositoryCadastroPositivo extends CrudRepository<CadastroPositivo, Long> {

}
