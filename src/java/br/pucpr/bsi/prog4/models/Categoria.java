/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.bsi.prog4.models;

/**
 *
 * @author alexandre.hauffe
 */
public class Categoria {
    
    private int id;
    private String Nome;
    private String Descricao;

    public Categoria(int id, String Nome, String Descricao) {
        this.id = id;
        this.Nome = Nome;
        this.Descricao = Descricao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
