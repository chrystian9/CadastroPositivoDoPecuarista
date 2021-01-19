package com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.impl;

import com.squad_one.cadastro_positivo_do_pecuarista.entity.documento.Documento;

public class CertificadoDeRegularidade_IBAMA extends Documento {
    public CertificadoDeRegularidade_IBAMA(String status){
        super(status, "certificado_de_regularidade_ibama");
    }

    //    public OutorgaDaAgua(String status, FILE comprovante) {
//        super(status, comprovante);
//    }

    @Override
    protected void calculaValor(){
        switch (status){
            case "Ativo":
                this.valor = 200;
                break;
            case "Vencido":
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
