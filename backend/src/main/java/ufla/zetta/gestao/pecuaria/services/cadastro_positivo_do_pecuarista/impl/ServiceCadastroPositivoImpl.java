package ufla.zetta.gestao.pecuaria.services.cadastro_positivo_do_pecuarista.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufla.zetta.gestao.pecuaria.dto.CadastroPecuaristaDto;
import ufla.zetta.gestao.pecuaria.entity.cadastro_positivo_do_pecuarista.CadastroPositivo;
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

    public CadastroPositivo insereCadastroPositivo (CadastroPecuaristaDto cadastroPecuaristaDto){
        repositoryCadastroPositivo.save(cadastroPecuaristaDto.getCadastroPositivo());

        return cadastroPecuaristaDto.getCadastroPositivo();
    }

    @Override
    public List<CadastroPositivo> listarCadastrosPositivos() {
        List<CadastroPositivo> cadastrosPositivos = repositoryCadastroPositivo.findAll();
        if(cadastrosPositivos.isEmpty()){
            return null;
        }
        return cadastrosPositivos;
    }

    @Override
    public CadastroPositivo buscaCadastroPositivo(String cnpj) {
        Pecuarista pecuarista = servicePecuarista.buscaPecuarista(cnpj);
        if(pecuarista == null){
            return null;
        }
        return pecuarista.getCadastroPositivo();
    }

    @Override
    public String editarCadastroPositivo(String cnpj) {
        Pecuarista pecuarista = servicePecuarista.buscaPecuarista(cnpj);
        if(pecuarista == null){
            return null;
        }
        CadastroPositivo cadastroPositivo = pecuarista.getCadastroPositivo();

        repositoryCadastroPositivo.save(cadastroPositivo);
        return "Cadastro atualizado com sucesso";
    }

    public String deletaCadastroPositivo(String cnpj){
        return servicePecuarista.deletaPecuarista(cnpj);
    }
}
