package br.com.houseflipping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.houseflipping.entity.Imovel;
import br.com.houseflipping.repository.ImovelRepository;

@Service
public class ImovelService {
	@Autowired
    private ImovelRepository imovelRepository;

    public Imovel salvar(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public List<Imovel> listar() {
        return imovelRepository.findAll();
    }

    public Imovel buscarPorId(Long id) {
        return imovelRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        imovelRepository.deleteById(id);
    }
}
