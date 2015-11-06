/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.bsi.prog4.models.repositórios;

import br.pucpr.bsi.prog4.models.Produto;
import java.util.List;

/**
 *
 * @author alexandre.hauffe
 */
public interface ProdutoRepositorio {  
    List<Produto> obterTodos();
    Produto obterPorId(long id);
}
