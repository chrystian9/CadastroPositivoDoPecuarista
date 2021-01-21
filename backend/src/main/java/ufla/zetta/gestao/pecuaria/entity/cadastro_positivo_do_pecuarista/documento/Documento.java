package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(/*schema*/ name = "documentos")
public abstract class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotBlank
    @Column(name = "valor")
    protected Integer valor;

    @NotBlank
    @Column(name = "status")
    protected String status;

    @NotBlank
    @Column(name = "tipo")
    protected String tipo;
//    protected FILE comprovante = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cadastro_positivo_id")
    private CadastroPositivo cadastroPositivo;

    public Documento(){};

    public Documento(String status, String tipo, CadastroPositivo cadastroPositivo) {
        this.status = status;
        this.tipo = tipo;
        this.cadastroPositivo = cadastroPositivo;
        this.calculaValor();
    }

//    public Documento(String status, FILE comprovante){
//        this.status = status;
//        this.calculaValor();
//        this.setFILE(comprovante);
//    }

    public Integer getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public CadastroPositivo getCadastroPositivo() {
        return cadastroPositivo;
    }

    protected void calculaValor(){
        this.valor = 0;
    }

    public void setStatus(String status) {
        this.status = status;
        this.calculaValor();
    }

//    protected void setFILE(){
//
//    }
}
