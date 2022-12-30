public class Calculo {

    // !5 = 5*4*3*2*1

    public Integer fatorial(Integer numero) {

        int fatorial = 1;

        //!0 = 1
        if(numero == 0) {
            return 1;
        }

        for (int i = numero; i > 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    public Integer fatorialRecursivo(Integer numero){

        //!0 = 1
        if(numero == 0) {
            return 1;
        }

        return numero * fatorialRecursivo(numero -1);
    }

}
