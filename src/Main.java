import br.com.ecommerce.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  Produto p1 = new Produto(1, "TV", new BigDecimal(3500));
        Produto p2 = new Produto(2, "PS5", new BigDecimal(4500));
        Produto p3 = new Produto(3, "Rack", new BigDecimal(2000));

        Item item = new Item(2, p1);
        Item item2 = new Item(1, p3);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item);
        carrinho.adicionarItem(item2);
        carrinho.resumo();*/

        //List, Set e Map

      /*  long duracao = 0;
        long inicial = System.currentTimeMillis();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            numeros.add(i);
        }

        long termino = System.currentTimeMillis();
        duracao = termino - inicial;
        System.out.println("A método add " +  duracao);


        inicial = System.currentTimeMillis();

        List<Integer> numeros2 = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            numeros2.add(i);
        }

        termino = System.currentTimeMillis();
        duracao = termino - inicial;

        System.out.println("L método add " +  duracao);


        for (int i = 0; i < 100000; i++) {
            numeros.get(i);
        }

        termino = System.currentTimeMillis();
        duracao = termino - inicial;

        System.out.println("A método get " +  duracao);


        inicial = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            numeros2.get(i);
        }

        termino = System.currentTimeMillis();
        duracao = termino - inicial;

        System.out.println("L método get " +  duracao);

        Vector<Integer> numeros3 = new Vector<>();*/

/*        Set<Produto> numeros4 = new HashSet<>();

        Produto p1 = new Produto(1, "TV", new BigDecimal(3500));
        Produto p2 = new Produto(1, "TV2", new BigDecimal(4500));
        Produto p3 = new Produto(3, "Rack", new BigDecimal(2000));

        numeros4.add(p1);
        numeros4.add(p2);
        numeros4.add(p3);

        numeros4.stream().forEach(System.out::println);*/


        /*Produto p1 = new Produto(1, "TV", new BigDecimal(3500));
        Produto p2 = new Produto(1, "TV2", new BigDecimal(4500));
        Produto p3 = new Produto(3, "Rack", new BigDecimal(2000));

        Map<String, Object> mapa = new HashMap<>();
        //adicionando no map
        mapa.put("produto1", p1);
        mapa.put("produto2", 1);
        mapa.put("produto3", "qualquer coisa");

        mapa.entrySet().stream().forEach(item -> {
            System.out.print(item.getKey() + " ");
            System.out.print(item.getValue() + "\n");
        });

        System.out.println(mapa.get("produto1"));*/

       // adicionarProdutoJOptionPane();
        adicionarProdutoScanner();


    }

    public static void adicionarProdutoJOptionPane() {

        String id = JOptionPane.showInputDialog("Digite o id do produto");
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        String valor = JOptionPane.showInputDialog("Digite o valor do produto");

        Produto produto = new Produto(Integer.parseInt(id), nome, new BigDecimal(valor));

        JOptionPane.showMessageDialog(null, produto.toString());

    }

    public static void adicionarProdutoScanner() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o id do produto");
        String id = entrada.nextLine();

        System.out.println("Digite o nome do produto");
        String nome = entrada.nextLine();

        System.out.println("Digite o valor do produto");
        String valor = entrada.nextLine();

        Produto produto = new Produto(Integer.parseInt(id), nome, new BigDecimal(valor));

        System.out.println(produto.toString());

    }


}
