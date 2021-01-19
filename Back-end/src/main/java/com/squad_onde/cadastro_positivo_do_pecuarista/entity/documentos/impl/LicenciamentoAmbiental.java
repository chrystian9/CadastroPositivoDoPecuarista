package com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl;

import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.Documento;

import javax.persistence.*;

@Entity
@Table(/*schema*/name = "licenciamento_ambiental")
public class LicenciamentoAmbiental extends Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public LicenciamentoAmbiental(String status){
        super(status);
    }

    public LicenciamentoAmbiental(){
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
