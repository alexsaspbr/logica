import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Impressora impressora = new Impressora();
        //impressora.imprimir("Ola mundo!");
        //impressora.imprimirInt(150);
        Integer[] numeros = {78, 9, 5, 12, 9, 100, 9, 36, 9};
        //Integer[] novoNumeros = Arrays.copyOf(numeros, 6);
    /*    Integer[] novoNumeros = impressora.remove(numeros, 9);
        for (Integer numero : novoNumeros) {
            System.out.print(numero + " ");
        }*/
        //novoNumeros[5] = 100;
        //novoNumeros[3] = 20;
        //Integer[] ordenado = impressora.ordenar(novoNumeros);
        //System.out.println("Na ordem de inserção");
        //impressora.imprimirIntEmLote(numeros);
        //System.out.println("Na ordem de inserção reversa");
        //impressora.imprimirIntEmLoteInverso(numeros);
        //System.out.println("Indice 4: " + numeros[4]);

/*        String [] nomes = {"Alex", "Julia", "Agamenon Marciel", "Maria", "Agamenon Junior"};
        String[] nomesOrdenados = impressora.ordenar(nomes);

        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }*/

        impressora.matriz();


    }

}