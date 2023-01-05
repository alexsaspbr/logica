package br.com.ecommerce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Carrinho {

    //<> - brackets
    private List<Item> itens;

    public Carrinho() {
        this.itens = new LinkedList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void resumo() {

        StringBuilder sb = new StringBuilder();
        sb.append("### RESUMO DO PEDIDO ###\n\n");
        itens.forEach(item -> {
            sb.append(String.format("Produto %10s - Valor R$ %.2f - Quantidade: %d %n",
                    item.getProduto().getNome(),
                    item.getProduto().getValor(),
                    item.getQuantidade()));
        });

        BigDecimal total = itens.stream().map(item -> {
            return new BigDecimal(item.getQuantidade()).multiply(item.getProduto().getValor());
        }).reduce(BigDecimal.ZERO, BigDecimal::add);

        sb.append(String.format("%37sTOTAL R$ %.2f", "", total));

        System.out.println(sb.toString());
    }

}
