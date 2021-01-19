package com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.impl;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.Documento;

public class DescarteResiduosSolidos extends Documento {
    public DescarteResiduosSolidos(String status){
        super(status, "descarte_de_residuos_solidos");
    }

    //    public OutorgaDaAgua(String status, FILE comprovante) {
//        super(status, comprovante);
//    }

    @Override
    protected void calculaValor(){
        switch (status){
            case "Faz":
//                if(comprovante){
//                    this.valor = 100;
//                else{
//                    this.valor = 0;
//                }
                this.valor = 100;
                break;
            case "Não faz":
                this.valor = 100;
                break;
            default:
                valor = 0;
                break;
        }
    }
}
