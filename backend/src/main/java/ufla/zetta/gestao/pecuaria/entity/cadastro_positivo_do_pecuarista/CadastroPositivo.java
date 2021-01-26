package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.utils.cadastro_positivo_do_pecuarista.Config;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = Config.SCHEMA, name = "cadastro_positivo")
public class CadastroPositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pecuarista", referencedColumnName = "id")
    private Pecuarista pecuarista;

    @OneToMany(mappedBy = "cadastroPositivo",
            cascade = CascadeType.ALL)
    List<Documento> documentos;

    @Column(name = "score")
    private Integer score;

    public CadastroPositivo(Pecuarista pecuarista) {
        this.pecuarista = pecuarista;
    }

    public CadastroPositivo() {}

    public void atualizaScore(){
        this.calculaScore();
    }

    private void calculaScore(){
        //media aritmetica da soma dos valores de cada parametro (documento)
        this.score = 0;
        for (Documento documento : documentos) {
            this.score =+ documento.getValor();
        }
        this.score = this.score / documentos.size();
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPecuarista(Pecuarista pecuarista) {
        this.pecuarista = pecuarista;
    }

    public Long getId() {
        return id;
    }

    public Pecuarista getPecuarista() {
        return pecuarista;
    }

    public Integer getScore() {
        return score;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

}
