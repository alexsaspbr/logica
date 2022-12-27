import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Impressora impressora = new Impressora();
        //impressora.imprimir("Ola mundo!");
        //impressora.imprimirInt(150);
        Integer[] numeros = {78, 9, 5, 12, 100, 36};
        Integer[] novoNumeros = Arrays.copyOf(numeros, 6);
        //novoNumeros[5] = 100;
        //novoNumeros[3] = 20;
        //Integer[] ordenado = impressora.ordenar(novoNumeros);
        System.out.println("Na ordem de inserção");
        impressora.imprimirIntEmLote(numeros);
        //System.out.println("Na ordem de inserção reversa");
        //impressora.imprimirIntEmLoteInverso(numeros);
        //System.out.println("Indice 4: " + numeros[4]);



    }

}