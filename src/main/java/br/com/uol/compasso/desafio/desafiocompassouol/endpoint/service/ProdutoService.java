package br.com.uol.compasso.desafio.desafiocompassouol.endpoint.service;

import br.com.uol.compasso.desafio.desafiocompassouol.endpoint.model.Produto;
import br.com.uol.compasso.desafio.desafiocompassouol.endpoint.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Iterable<Produto> list(Pageable pageable){
        return produtoRepository.findAll(pageable);
    }
}
