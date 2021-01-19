package com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl;

import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.Documento;

import javax.persistence.*;

@Entity
@Table(/*schema*/name = "descarte_residuos_solidos")
public class DescarteResiduosSolidos extends Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public DescarteResiduosSolidos(String status){
        super(status);
    }
    public DescarteResiduosSolidos(){
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
