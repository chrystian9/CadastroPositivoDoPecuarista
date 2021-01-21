package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.impl;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.Documento;

public class LicenciamentoAmbiental extends Documento {
    public LicenciamentoAmbiental(String status, CadastroPositivo cadastroPositivo){
        super(status, "licenciamento_ambiental", cadastroPositivo);
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
