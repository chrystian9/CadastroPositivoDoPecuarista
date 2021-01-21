package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min = 8,max = 8)
    @Digits(integer=8,fraction = 0, message = "São necessários 8 dígitos")
    @Column(name="registro")
    private String registro;


    @Size(max = 255)
    @Column(name="especie")
    @Pattern(regexp = "[A-Z a-z ]*\\s*", message = "Não é permitido caracteres especiais e números")
    private String especie;

    @Column(name = "objetivo")
    private String objetivo;


    @JoinColumn(name = "id_central", referencedColumnName = "id")
    private CentralGeneticaEntity central;

    @ManyToMany
    @JoinTable(name="parentes",joinColumns = @JoinColumn(name="id_animal", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_parente", referencedColumnName = "id"))
    private List<AnimalParenteEntity> parentes;




}
