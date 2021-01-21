package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.*;

@Entity
@Table(name = "centralGenetica")
public class CentralGeneticaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "urlWebsite")
    private String urlWebsite;

    @Column(name = "caminhoImagemLogo")
    private String caminhoImagemLogo;
}
