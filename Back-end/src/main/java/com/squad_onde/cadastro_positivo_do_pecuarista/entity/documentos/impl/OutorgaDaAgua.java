package com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl;

import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.Documento;

import javax.persistence.*;

@Entity
@Table(/*schema*/name = "outorga_da_agua")
public class OutorgaDaAgua extends Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public OutorgaDaAgua(String status) {
        super(status);
    }
    public OutorgaDaAgua() {
        super("");
    }

//    public OutorgaDaAgua(String status, FILE comprovante) {
//        super(status, comprovante);
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    protected void calculaValor(){
        switch (status){
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
    }
}
