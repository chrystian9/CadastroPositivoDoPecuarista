package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(/*schema*/name = "frigorifico")
public class Frigorifico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=14)
    @Digits(integer=14,fraction = 0, message = "CPF - É permitido apenas 11 numeros")
    @Column(name="cnpj")
    private String cnpj;

    public Frigorifico(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

}
