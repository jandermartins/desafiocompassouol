package br.com.uol.compasso.desafio.desafiocompassouol.endpoint.repository;

import br.com.uol.compasso.desafio.desafiocompassouol.endpoint.model.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {
}
