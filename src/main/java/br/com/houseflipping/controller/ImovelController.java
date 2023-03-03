package br.com.houseflipping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.houseflipping.entity.Imovel;
import br.com.houseflipping.service.ImovelService;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @PostMapping
    public Imovel salvar(@RequestBody Imovel imovel) {
        return imovelService.salvar(imovel);
    }

    @GetMapping
    public List<Imovel> listar() {
        return imovelService.listar();
    }

    @GetMapping("/{id}")
    public Imovel buscarPorId(@PathVariable Long id) {
        return imovelService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        imovelService.excluir(id);
    }
}