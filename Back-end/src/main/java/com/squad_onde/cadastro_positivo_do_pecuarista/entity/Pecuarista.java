package com.squad_onde.cadastro_positivo_do_pecuarista.entity;

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
    private final String cpf;

    //exemplo: MG-3149903-D80BF326C7D4411C8AF0EFDD82E4EA3A
    @NotBlank
    @Size(min=43, max=43)
    @Pattern(regexp = "[A-Z a-z 0-9]*\\s*")
    @Column(name="car")
    private String car;

//    private boolean outorgaDaAgua;
//    private boolean descarteResiduosSolidos;
//    private boolean licenciamentoAmbiental;

    public Pecuarista(String cpf){
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCar(String car) {
        this.car = car;
    }
//
//    public void setOutorgaDaAgua(boolean outorgaDaAgua) {
//        this.outorgaDaAgua = outorgaDaAgua;
//    }
//
//    public void setDescarteResiduosSolidos(boolean descarteResiduosSolidos) {
//        this.descarteResiduosSolidos = descarteResiduosSolidos;
//    }
//
//    public void setLicenciamentoAmbiental(boolean licenciamentoAmbiental) {
//        this.licenciamentoAmbiental = licenciamentoAmbiental;
//    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCar() {
        return car;
    }
//
//    public boolean isOutorgaDaAgua() {
//        return outorgaDaAgua;
//    }
//
//    public boolean isDescarteResiduosSolidos() {
//        return descarteResiduosSolidos;
//    }
//
//    public boolean isLicenciamentoAmbiental() {
//        return licenciamentoAmbiental;
//    }
}
