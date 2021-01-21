package ufla.zetta.gestao.pecuaria.entity.gene_mais;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 255)
    @Column(name="nome")
    @Pattern(regexp = "[A-Z a-z]*\\s*", message = "Não é permitido numeros ou caracteres especiais")
    private String nome;

    @NotBlank
    @Size(min = 11)
    @Digits(integer=11,fraction = 0, message = "É permitido apenas 11 numeros")
    @Column(name="cpf")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @NotBlank
    @Size(max = 255)
    @Column(name="senha")
    private String senha;

    @ManyToMany
    @JoinTable(name="fazendaUsuario",joinColumns = @JoinColumn(name="id_usuario", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_fazenda", referencedColumnName = "id"))
    private List<FazendaEntity> fazendas;









}
