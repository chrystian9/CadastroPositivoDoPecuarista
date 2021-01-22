package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(/*schema*/ name = "pecuarista")
public class Pecuarista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=14)
    @Digits(integer=14,fraction = 0, message = "CNPJ - É permitido apenas 14 numeros")
    @Column(name="cnpj")
    private String cnpj;

    @OneToOne(mappedBy = "pecuarista")
    private CadastroPositivo cadastroPositivo;

    public Pecuarista(String cnpj){
        this.cnpj = cnpj;
    }

    public Pecuarista() {}

    public void setCadastroPositivo(CadastroPositivo cadastroPositivo) {
        this.cadastroPositivo = cadastroPositivo;
    }

    public Long getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public CadastroPositivo getCadastroPositivo() {
        return cadastroPositivo;
    }
}
