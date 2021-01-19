package com.squad_onde.cadastro_positivo_do_pecuarista.entity;

import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl.CAR;
import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl.DescarteResiduosSolidos;
import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl.LicenciamentoAmbiental;
import com.squad_onde.cadastro_positivo_do_pecuarista.entity.documentos.impl.OutorgaDaAgua;

import javax.persistence.*;

@Entity
@Table(/*schema*/ name = "cadastro_positivo_pecuarista")
public class CadastroPositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_pecuarista", referencedColumnName = "id")
    private Pecuarista pecuarista;
    @OneToOne
    @JoinColumn(name = "id_car", referencedColumnName = "id")
    private CAR car = null;
    @OneToOne
    @JoinColumn(name = "id_outorga_da_agua", referencedColumnName = "id")
    private OutorgaDaAgua outorgaDaAgua = null;
    @OneToOne
    @JoinColumn(name = "id_descare_residuos_solidos", referencedColumnName = "id")
    private DescarteResiduosSolidos descarteResiduosSolidos = null;
    @OneToOne
    @JoinColumn(name = "id_pecuarista", referencedColumnName = "id")
    private LicenciamentoAmbiental licenciamentoAmbiental = null;
    @Column(name = "score")
    private Integer score;

    public CadastroPositivo(Pecuarista pecuarista) {
        this.pecuarista = pecuarista;
    }

    public CadastroPositivo() {
    }

    private void calculaScore(){
        //media aritmetica da soma dos valores de cada parametro (documento)
        this.score = (car.getValor() + outorgaDaAgua.getValor() + descarteResiduosSolidos.getValor()
                + licenciamentoAmbiental.getValor()) / 4;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOutorgaDaAgua(OutorgaDaAgua outorgaDaAgua) {
        this.outorgaDaAgua = outorgaDaAgua;
    }

    public void setDescarteResiduosSolidos(DescarteResiduosSolidos descarteResiduosSolidos) {
        this.descarteResiduosSolidos = descarteResiduosSolidos;
    }

    public void setLicenciamentoAmbiental(LicenciamentoAmbiental licenciamentoAmbiental) {
        this.licenciamentoAmbiental = licenciamentoAmbiental;
    }

    public Long getId() {
        return id;
    }

    public Pecuarista getPecuarista() {
        return pecuarista;
    }

    public CAR getCar() {
        return car;
    }

    public DescarteResiduosSolidos getDescarteResiduosSolidos() {
        return descarteResiduosSolidos;
    }

    public LicenciamentoAmbiental getLicenciamentoAmbiental() {
        return licenciamentoAmbiental;
    }

    public OutorgaDaAgua getOutorgaDaAgua() {
        return outorgaDaAgua;
    }

    public Integer getScore() {
        return score;
    }
}
