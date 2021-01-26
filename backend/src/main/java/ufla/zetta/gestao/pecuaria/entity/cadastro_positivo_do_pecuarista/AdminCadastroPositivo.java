package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.utils.cadastro_positivo_do_pecuarista.Config;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(schema = Config.SCHEMA, name = "admins_cadastro_positivo")
public class AdminCadastroPositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static final String codigoDeAcesso = "EuTenhoAcesso";

    @NotBlank
    @Size(min=11)
    @Digits(integer=11,fraction = 0, message = "CPF - É permitido apenas 11 numeros")
    @Column(name="cpf")
    private String cpf;

    @NotBlank
    @Size(max = 255)
    @Column(name="senha")
    private String senha;

    @NotBlank
    @Size(max=255)
    @Column(name="login")
    private String login;

    public AdminCadastroPositivo() {}

    public AdminCadastroPositivo(
            String cpf, String senha, String login){
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean verificaLogin(String login, String senha){
        if(this.login.equals(login) && this.senha.equals(senha)){
            return true;
        }else return false;
    }

    public static boolean confereCodigoDeAcesso(String codigoDeAcesso) {
        return codigoDeAcesso.equals(codigoDeAcesso);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
