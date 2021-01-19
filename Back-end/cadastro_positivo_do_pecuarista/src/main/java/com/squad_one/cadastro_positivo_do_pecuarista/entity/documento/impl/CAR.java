package com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.impl;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.Documento;

public class CAR extends Documento {
    public CAR(String status){
        super(status, "CAR");
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
