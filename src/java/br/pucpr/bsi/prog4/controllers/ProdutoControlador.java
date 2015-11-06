/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.bsi.prog4.controllers;

import java.util.ArrayList;
import java.util.List;
import br.pucpr.bsi.prog4.models.Produto;
import br.pucpr.bsi.prog4.models.repositórios.MemoriaProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alexandre.hauffe
 */
@Controller
public class ProdutoControlador {
    
    @Autowired
    MemoriaProdutoRepositorio repositorio;
    
    @RequestMapping("/produtos")
    public ModelAndView obterProduto(){
        ModelAndView mav;
        mav = new ModelAndView("produtos");

        mav.addObject("produtos", repositorio.obterTodos());
        return mav;
    }
    @RequestMapping("/produto/(id)")
    public ModelAndView detalheProduto(@PathVariable("id") long id){
        ModelAndView mav;
        mav = new ModelAndView("produto-detalhe");
        mav.addObject("produtos", repositorio.obterPorId(id));
        return mav;
    }
}