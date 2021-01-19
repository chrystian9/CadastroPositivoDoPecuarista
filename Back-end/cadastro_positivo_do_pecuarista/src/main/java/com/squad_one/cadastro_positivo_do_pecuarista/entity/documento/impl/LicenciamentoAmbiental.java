package com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.impl;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.Documento;

public class LicenciamentoAmbiental extends Documento {
    public LicenciamentoAmbiental(String status){
        super(status, "licenciamento_ambiental");
    }

    //    public OutorgaDaAgua(String status, FILE comprovante) {
//        super(status, comprovante);
//    }

    @Override
    protected void calculaValor(){
        switch (status){
            case "Não Possui":
                this.valor = 0;
                break;
            case "Deferido":
                this.valor = 200;
                break;
            case "Indeferido":
                this.valor = 0;
                break;
            case "Arquivado":
                this.valor = 0;
                break;
            case "Cancelado":
                this.valor = 0;
                break;
            default:
                valor = 0;
                break;
        }
    }
}
