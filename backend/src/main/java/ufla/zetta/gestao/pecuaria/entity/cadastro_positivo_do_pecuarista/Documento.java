package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(/*schema=*/ name = "documentos")
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

    protected void calculaValor() {
        switch (tipo) {
            case "descarte_de_residuos_solidos":
                switch (status) {
                    case "Faz":
                        //                if(comprovante){
                        //                    this.valor = 100;
                        //                else{
                        //                    this.valor = 0;
                        //                }
                        this.valor = 100;
                        break;
                    case "Não faz":
                        this.valor = 100;
                        break;
                    default:
                        valor = 0;
                        break;
                }
                break;
            case "licenciamento_ambiental":
                switch (status) {
                    case "Não Possui":
                        this.valor = 0;
                        break;
                    case "Deferido":
                        this.valor = 200;
                        break;
                    case "Indeferido":
                        this.valor = 0;
                        break;
                    case "Arquivado":
                        this.valor = 0;
                        break;
                    case "Cancelado":
                        this.valor = 0;
                        break;
                    default:
                        valor = 0;
                        break;
                }
            case "outorga_da_agua":
                switch (status) {
                    case "Possui":
                        //                if(comprovante){
                        //                    this.valor = 100;
                        //                else{
                        //                    this.valor = 0;
                        //                }
                        this.valor = 100;
                        break;
                    case "Não precisa":
                        this.valor = 100;
                        break;
                    case "Não possui":
                        this.valor = 0;
                        break;
                    default:
                        valor = 0;
                        break;
                }
                break;
            case "certificado_de_regularidade_ibama":
                switch (status) {
                    case "Ativo":
                        this.valor = 200;
                        break;
                    case "Vencido":
                        this.valor = 100;
                        break;
                    case "Não possui":
                        this.valor = 0;
                        break;
                    default:
                        valor = 0;
                        break;
                }
                break;
            case "CAR":
                switch (status) {
                    case "Ativo":
                        this.valor = 400;
                        break;
                    case "Pendente":
                        this.valor = 200;
                        break;
                    case "Suspenso":
                        this.valor = 100;
                        break;
                    case "Não possui":
                        this.valor = 0;
                        break;
                    default:
                        valor = 0;
                        break;
                }
                break;
            default:
                this.valor = 0;
                break;
        }
    }

    public void setStatus(String status) {
        this.status = status;
        this.calculaValor();
    }

//    protected void setFILE(){
//
//    }
}
