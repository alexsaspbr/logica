import br.com.ecommerce.Carrinho;
import br.com.ecommerce.Item;
import br.com.ecommerce.Produto;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto(1, "TV", new BigDecimal(3500));
        Produto p2 = new Produto(2, "PS5", new BigDecimal(4500));
        Produto p3 = new Produto(3, "Rack", new BigDecimal(2000));

        Item item = new Item(2, p1);
        Item item2 = new Item(1, p3);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item);
        carrinho.adicionarItem(item2);
        carrinho.resumo();


    }

}