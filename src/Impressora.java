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

    public String [] ordenar(String [] nomes) {
        for(int i = 0; i < nomes.length; i++) {
            for(int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    String aux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux;
                }
            }
        }
        return nomes;
    }

    private int verificarRecorrenciaNumero(Integer [] numeros, Integer numeroRecorrente) {
        int recorrencia = 0;
        for (Integer numero: numeros) {
            if(numero == numeroRecorrente)
                recorrencia++;
        }
        return recorrencia;
    }

    public Integer [] remove(Integer [] numeros, Integer numeroARemover) {
        int recorrencia = verificarRecorrenciaNumero(numeros, numeroARemover);
        Integer [] novoNumeros = new Integer[numeros.length - recorrencia];
        int indiceNovoNumeros = 0;
        for (int indiceNumero = 0; indiceNumero < numeros.length; indiceNumero++) {
            if(numeros[indiceNumero] != numeroARemover) {
                novoNumeros[indiceNovoNumeros] = numeros[indiceNumero];
                indiceNovoNumeros++;
            }
        }
        return novoNumeros;
    }

    public void matriz(){
        Integer [] [] matriz = new Integer[3] [3];
        int numero = 1;
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = numero;
                numero++;
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println("");
        }

    }

}
