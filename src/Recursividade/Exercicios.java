package Recursividade;

public class Exercicios {

    //Exercício 1
    public static int multiplicacaoExponencial(int base, int expoente, int resultado) {

        while (expoente != 1) {
            resultado = base * multiplicacaoExponencial(base, --expoente, resultado);
            return resultado;
        }

        return base;
    }

    //Exercício 2
    public static int calculoFatorial(int f) {

        if (f == 1) {
            return 1;
        }

        return f * calculoFatorial(--f);

    }

    //Exercício 3 - Fibonacci
    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Exercício 4
    public static int maiorValor(int[] v, int n) {

        if (n == 0) {
            return v[0];
        } else {
            int m = maiorValor(v, n - 1);
            if (m > v[n]) {
                return m;
            } else {
                return v[n];
            }
        }

    }

    //Exercício 5
    public static void decimal2Binario(int n) {

        if (n > 0) {
            decimal2Binario(n / 2);
            System.out.print(n % 2 + "  ");
        }

    }
    
    //Exercício 6
    
    //Exercício 7
    

}
