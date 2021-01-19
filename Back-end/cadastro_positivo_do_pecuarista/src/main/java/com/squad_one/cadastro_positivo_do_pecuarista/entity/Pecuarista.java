package com.squad_one.cadastro_positivo_do_pecuarista.entity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Pecuarista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=11)
    @Digits(integer=11,fraction = 0, message = "CPF - É permitido apenas 11 numeros")
    @Column(name="cpf")
    private String cpf;

    //exemplo: MG-3149903-D80BF326C7D4411C8AF0EFDD82E4EA3A
    @NotBlank
    @Size(min=43, max=43)
    @Pattern(regexp = "[A-Z a-z 0-9]*\\s*")
    @Column(name="car")
    private String car;

    public Pecuarista(String cpf){
        this.cpf = cpf;
    }

    public Pecuarista() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCar() {
        return car;
    }
}
