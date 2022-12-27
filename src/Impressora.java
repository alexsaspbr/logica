public class Impressora {

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public void imprimirInt(Integer numero) {
        System.out.println(numero);
    }

    public void imprimirIntEmLote(Integer [] numeros) {
/*        for(int contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);
        }*/

  /*      int contador = 0;
        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;
        }*/

        int contador2 = 0;
        do {
            System.out.println(numeros[contador2]);
            contador2++;
        } while (contador2 > numeros.length);

    }

    public void imprimirIntEmLoteInverso(Integer [] numeros) {
        for(int contador = numeros.length-1; contador >= 0; contador--) {
            System.out.println(numeros[contador]);
        }

     /*   int contador = 0;
        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;
        }*/

    }

    public Integer [] ordenar(Integer [] numeros) {
        for(int i = 0; i < numeros.length; i++) {
            for(int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }



}
