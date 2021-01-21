package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.impl;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.Documento;

public class CertificadoDeRegularidade_IBAMA extends Documento {
    public CertificadoDeRegularidade_IBAMA(String status, CadastroPositivo cadastroPositivo){
        super(status, "certificado_de_regularidade_ibama", cadastroPositivo);
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
