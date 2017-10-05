package AlgoritmosOrdenacao;

import java.util.Random;

public class ShotgunSort {
    
    /*
        Caso a lista não esteja ordenada, embaralhe novamente.
        No pior caso, leva tempo infinito.
    
    */
    
    
    
    public static void ShotgunSort(int[] v){
        
        embaralha(v);
        long contador = 0;
        
        while(!isOrdenado(v)){
            embaralha(v);
            contador++;
        }
        
        System.out.println("O vetor está ordenado após " + contador + " embaralhamentos.");
        
    }
    
    public static void embaralha(int[] v){
        Random r = new Random();
        
        int elementosRestantes = v.length;
        
        while(elementosRestantes > 0){
            int k = r.nextInt(elementosRestantes);
            
            int aux = v[k];
            v[k] = v[elementosRestantes - 1];
            v[elementosRestantes - 1] = aux;
            
            elementosRestantes--;
                  
        }      
    }
    
    public static boolean isOrdenado(int[] v){
        
        boolean ordenado = true;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                ordenado = false;
                break;
            }
        }
        
        return ordenado;
        
    }


    
}
