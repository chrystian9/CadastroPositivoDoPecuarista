package ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(/*schema*/name = "frigorifico")
public class Frigorifico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=14)
    @Digits(integer=14,fraction = 0, message = "CPF - É permitido apenas 11 numeros")
    @Column(name="cnpj")
    private String cnpj;

    @NotNull
    @Column(name = "status")
    private boolean status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_")
    private FilaDeAprovacaoFrigorifico filaDeAprovacaoFrigorifico;

    public Frigorifico(String cnpj) {
        this.cnpj = cnpj;
        this.status = false;
    }

    public Frigorifico() {}

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String getCnpj() {
        return cnpj;
    }


}
