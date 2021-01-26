package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.utils.cadastro_positivo_do_pecuarista.Config;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = Config.SCHEMA, name = "documentos")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "valor")
    private Integer valor;

    @NotBlank
    @Column(name = "situacao")
    private String status;

    @NotBlank
    @Column(name = "tipo")
    private String tipo;
//    protected FILE comprovante = null;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cadastro_positivo")
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

    private void calculaValor() {
        switch (tipo) {
            case "descarte_de_residuos_solidos":
                switch (status) {
                    case "Faz":
//                        if(comprovante) {
//                            this.valor = 100;
//                        }else{
//                            this.valor = 0;
//                        }
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
//                        if(comprovante) {
//                            this.valor = 100;
//                        }else{
//                            this.valor = 0;
//                        }
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
