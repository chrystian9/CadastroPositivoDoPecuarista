package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.impl;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.Documento;

public class OutorgaDaAgua extends Documento {
    public OutorgaDaAgua(String status, CadastroPositivo cadastroPositivo) {
        super(status, "outorga_da_agua", cadastroPositivo);
    }

//    public OutorgaDaAgua(String status, FILE comprovante) {
//        super(status, comprovante);
//    }

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
