package br.pucpr.bsi.prog4.models;

/**
 *
 * @author alexandre.hauffe
 */
public class Produto {
    
    private long id;
    private String nome;
    private float Quantidade;
    private float PrecoUnitario;
    private Categoria categoria;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(float Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getPrecoUnitario() {
        return PrecoUnitario;
    }

    public void setPrecoUnitario(float PrecoUnitario) {
        this.PrecoUnitario = PrecoUnitario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}