package com.squad_one.cadastro_positivo_do_pecuarista.entity.documentos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public abstract class Documento {
    @NotBlank
    @Column(name = "valor")
    protected Integer valor = null;
    @NotBlank
    @Column(name = "status")
    protected String status = null;
//    protected FILE comprovante = null;

    public Documento(){};

    public Documento(String status) {
        this.status = status;
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
