package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Documento;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.Pecuarista;
import ufla.zetta.gestao.pecuaria.repository.cadastro_positivo_do_pecuarista.RepositoryCadastroPositivo;
import ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.ServiceCadastroPositivo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCadastroPositivoImpl implements ServiceCadastroPositivo {
    @Autowired
    RepositoryCadastroPositivo repositoryCadastroPositivo;

    @Autowired
    ServicePecuaristaImpl servicePecuarista;

    public ResponseEntity<CadastroPositivo> insereCadastroPositivo (){
        Pecuarista pecuarista = new Pecuarista("14572457000185");
        CadastroPositivo novoCadastro = new CadastroPositivo(pecuarista);

        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento("Ativo", "CAR", novoCadastro));
        documentos.add(new Documento("Faz", "descarte_de_residuos_solidos", novoCadastro));
        documentos.add(new Documento("Deferido", "licenciamento_ambiental", novoCadastro));
        documentos.add(new Documento("Possui", "outorga_da_agua", novoCadastro));
        documentos.add(new Documento("Ativo", "certificado_de_regularidade_ibama", novoCadastro));

        novoCadastro.setDocumentos(documentos);
        novoCadastro.atualizaScore();

        repositoryCadastroPositivo.save(novoCadastro);

        return ResponseEntity.ok().body(novoCadastro);
    }

    @Override
    public ResponseEntity<List<CadastroPositivo>> listarCadastrosPositivos() {
        List<CadastroPositivo> cadastrosPositivos = repositoryCadastroPositivo.findAll();
        if(cadastrosPositivos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(cadastrosPositivos);
    }

    @Override
    public ResponseEntity<CadastroPositivo> buscaCadastroPositivo(String cnpj) {
        Pecuarista pecuarista = servicePecuarista.buscaPecuarista(cnpj);
        if(pecuarista == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(pecuarista.getCadastroPositivo());
    }

    @Override
    public ResponseEntity<String> editarCadastroPositivo(String cnpj) {
        Pecuarista pecuarista = servicePecuarista.buscaPecuarista(cnpj);
        if(pecuarista == null){
            return ResponseEntity.notFound().build();
        }
        CadastroPositivo cadastroPositivo = pecuarista.getCadastroPositivo();

        repositoryCadastroPositivo.save(cadastroPositivo);
        return ResponseEntity.ok("Cadastro atualizado com sucesso");
    }

    public ResponseEntity<String> deletaCadastroPositivo(String cnpj){
        return servicePecuarista.deletaPecuarista(cnpj);
    }
}
