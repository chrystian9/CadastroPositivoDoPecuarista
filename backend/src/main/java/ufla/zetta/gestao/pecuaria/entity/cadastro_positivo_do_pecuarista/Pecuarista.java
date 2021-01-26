package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import ufla.zetta.gestao.pecuaria.utils.cadastro_positivo_do_pecuarista.Config;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(schema = Config.SCHEMA, name = "pecuarista")
public class Pecuarista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //exemplo: 01010101010101
    @NotBlank
    @Size(min=14)
    @Digits(integer=14,fraction = 0, message = "CNPJ - É permitido apenas 14 numeros")
    @Column(name="cnpj")
    private String cnpj;

    //exemplo: SP-3500550-743F2702003F42F780845B7682E06F60
    @NotBlank
    @Size(min=43)
    @Column(name="car")
    private String car;

    @NotBlank
    @Size(max=255)
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Size(max=255)
    @Column(name = "senha")
    private String senha;

    @OneToOne(mappedBy = "pecuarista")
    private CadastroPositivo cadastroPositivo;

    public Pecuarista(String cnpj, String car, String nome, String senha) {
        this.cnpj = cnpj;
        this.car = car;
        this.nome = nome;
        this.senha = senha;
    }

    public Pecuarista() {}

    public void setCadastroPositivo(CadastroPositivo cadastroPositivo) {
        this.cadastroPositivo = cadastroPositivo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCar(String car) {
        this.car = car;
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
