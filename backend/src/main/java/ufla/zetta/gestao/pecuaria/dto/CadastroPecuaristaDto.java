package ufla.zetta.gestao.pecuaria.dto;

import lombok.Data;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Documento;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;

import java.util.ArrayList;
import java.util.List;

@Data
public class CadastroPecuaristaDto {
    private String nome;
    private String cnpj;
    private String senha;
    private String car;
    private String estadocar;
    private String regularidade;
    private String outorga;
    private String licenciamento;
    private String comprovante;

    public CadastroPositivo getCadastroPositivo(){
        Pecuarista pecuarista = new Pecuarista(cnpj, car, nome, senha);
        CadastroPositivo cadastroPositivo = new CadastroPositivo(pecuarista);
        cadastroPositivo.setPecuarista(pecuarista);

        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento(estadocar, "CAR", cadastroPositivo));
        documentos.add(new Documento(estadocar, "descarte_de_residuos_solidos", cadastroPositivo));
        documentos.add(new Documento(licenciamento, "licenciamento_ambiental", cadastroPositivo));
        documentos.add(new Documento(outorga, "outorga_da_agua", cadastroPositivo));
        documentos.add(new Documento(estadocar, "certificado_de_regularidade_ibama", cadastroPositivo));
        cadastroPositivo.setDocumentos(documentos);

        cadastroPositivo.atualizaScore();

        return cadastroPositivo;
    }
}
