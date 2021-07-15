package br.com.uol.compasso.desafio.desafiocompassouol.endpoint.controller;


import br.com.uol.compasso.desafio.desafiocompassouol.endpoint.model.Produto;
import br.com.uol.compasso.desafio.desafiocompassouol.endpoint.service.ProdutoService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/desafiocompassouuol")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Produto>> list(Pageable pageable){
        return new ResponseEntity<>(produtoService.list(pageable), HttpStatus.OK);
    }
}
