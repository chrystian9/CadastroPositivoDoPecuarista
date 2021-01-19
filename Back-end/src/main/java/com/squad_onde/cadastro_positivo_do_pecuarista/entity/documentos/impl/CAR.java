package com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl;

import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.Documento;

import javax.persistence.*;

@Entity
@Table(/*schema*/ name = "car")
public class CAR extends Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public CAR(String status){
        super(status);
    }
    public CAR(){
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
    }
}
