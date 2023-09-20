package com.fatec.produto.services;

import com.fatec.produto.model.Catalogo;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.Produto;
import com.fatec.produto.model.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.CompositeData;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService implements IProdutoService {
    @Autowired
    private IProdutoRepository repositoryP;

    @Autowired
    ImagemService imagemService;

    public List<Catalogo> consultaCatalogo() {

        Catalogo c = null;
        List<Catalogo> lista = new ArrayList<Catalogo>();
        List<Produto> listaP = repositoryP.findAll();
        CompositeData imagemServico;
        List<Imagem> listaI = imagemService.getAll();
        for (Produto p : listaP) {
            for (Imagem i : listaI) {
                if (p.getId().equals(i.getId())) {
                    c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(),
                            p.getCusto(),p.getQuantidadeNoEstoque(), i.getArquivo());
                    lista.add(c);
                }
            }
        }
        return lista;
    }
}
