package br.com.ecommerce;

import java.math.BigDecimal;

public class Produto {

    private Integer id;

    private String nome;
    private BigDecimal valor;

    public Produto(Integer id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
