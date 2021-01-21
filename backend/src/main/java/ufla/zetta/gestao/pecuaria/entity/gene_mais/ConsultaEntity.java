package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "consulta")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private UsuarioEntity usuario;

    @NotBlank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fazenda", referencedColumnName = "id")
    private FazendaEntity fazenda;

    @Column(name = "indiceProducao")
    private int indiceProducao;

    @Column(name = "indiceReproducao")
    private int indiceReproducao;

    @Column(name = "indiceMaternidade")
    private int indiceMaternidade;

    @Column(name = "indiceMorfologicas")
    private int indiceMorfologicas;

    @Column(name = "indiceCarcaca")
    private int indiceCarcaca;

    @Column(name = "indice")
    private int indice;

    @Column(name = "raca")
    private String raca;
}
