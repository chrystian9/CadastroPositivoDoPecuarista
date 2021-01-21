package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AnimalParenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 255)
    @Column(name="nome")
    @Pattern(regexp = "[A-Z a-z]*\\s*", message = "Não é permitido numeros ou caracteres especiais")
    private String nome;

    @Size(max = 255)
    @Column(name="descricao")
    @Pattern(regexp = "[A-Z a-z 0-9]*\\s*", message = "Não é permitido caracteres especiais")
    private String descricao;

    @Column(name = "parentesco")
    private String parentesco;


}
