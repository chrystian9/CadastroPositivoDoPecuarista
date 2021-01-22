package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(/*schema*/ name = "admins_cadastro_positivo")
public class AdminCadastroPositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=11)
    @Digits(integer=11,fraction = 0, message = "CPF - É permitido apenas 11 numeros")
    @Column(name="cpf")
    private String cpf;

    //Login

    //senha

    public AdminCadastroPositivo() {}

    public AdminCadastroPositivo(String cpf){
        this.cpf = cpf;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }
}
