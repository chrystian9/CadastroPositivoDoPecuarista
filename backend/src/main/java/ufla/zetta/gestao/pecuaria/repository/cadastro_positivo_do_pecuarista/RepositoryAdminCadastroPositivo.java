package ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.AdminCadastroPositivo;

@Repository
public interface RepositoryAdminCadastroPositivo extends JpaRepository<AdminCadastroPositivo, Long> {
}
