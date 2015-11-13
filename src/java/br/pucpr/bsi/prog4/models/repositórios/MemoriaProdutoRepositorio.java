/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.bsi.prog4.models.repositórios;

import br.pucpr.bsi.prog4.models.Categoria;
import br.pucpr.bsi.prog4.models.Produto;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexandre.hauffe
 */
@Repository
public class MemoriaProdutoRepositorio implements ProdutoRepositorio{

    private static List<Produto> produtos = new ArrayList<Produto>();
    
    static{
        
        Categoria celular = new Categoria(1, "Celular", "celulares...");
        Categoria tablet = new Categoria(2, "Tablets", "tablets...");
        
        produtos.add(new Produto());
        produtos.get(0).setId(1L);
        produtos.get(0).setCategoria(celular);
        produtos.get(0).setNome("iPhone");
        produtos.get(0).setQuantidade(110);
        produtos.get(0).setPrecoUnitario(999.99f);
        
        produtos.add(new Produto());
        produtos.get(1).setId(2L);
        produtos.get(1).setCategoria(celular);
        produtos.get(1).setNome("iPhone2");
        produtos.get(1).setQuantidade(110);
        produtos.get(1).setPrecoUnitario(999.99f);
        
        produtos.add(new Produto());
        produtos.get(2).setId(3L);
        produtos.get(2).setCategoria(celular);
        produtos.get(2).setNome("iPhone3");
        produtos.get(2).setQuantidade(110);
        produtos.get(2).setPrecoUnitario(999.99f);
        
        produtos.add(new Produto());
        produtos.get(3).setId(4L);
        produtos.get(3).setCategoria(tablet);
        produtos.get(3).setNome("Tablet");
        produtos.get(3).setQuantidade(110);
        produtos.get(3).setPrecoUnitario(999.99f);
        
        produtos.add(new Produto());
        produtos.get(4).setId(5L);
        produtos.get(4).setCategoria(tablet);
        produtos.get(4).setNome("Tablet2");
        produtos.get(4).setQuantidade(110);
        produtos.get(4).setPrecoUnitario(999.99f);
    }
    
    @Override
    public List<Produto> obterTodos() {
        return produtos;
    }

    @Override
    public Produto obterPorId(long id) {
        Produto produto = produtos.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst()
                    .get();
        return produto;
    }

    @Override
    public List<Produto> obterTodosPorId(int CategoriaId) {
        List<Produto> produtosCat = new ArrayList<Produto>();
        for(Produto produto : produtos){
            if(produto.getCategoria().getId() == CategoriaId){
                produtosCat.add(produto);
            }
        }
        return produtosCat;
    }

    @Override
    public Produto adicionar(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    
}
