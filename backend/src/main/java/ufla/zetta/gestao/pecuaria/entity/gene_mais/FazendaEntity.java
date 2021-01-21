package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "fazenda")
public class FazendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 255)
    @Column(name="nome")
    @Pattern(regexp = "[A-Z a-z 0-9]*\\s*", message = "Não é permitido caracteres especiais")
    private String nome;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;
}
