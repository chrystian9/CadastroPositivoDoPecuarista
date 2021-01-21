package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.impl;

import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.documento.Documento;

public class CAR extends Documento {
    public CAR(String status, CadastroPositivo cadastroPositivo){
        super(status, "CAR", cadastroPositivo);
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
