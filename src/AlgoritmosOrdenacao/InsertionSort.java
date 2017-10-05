package AlgoritmosOrdenacao;

public class InsertionSort {
    
    /*
        Percorre um vetor da esquerda para a direita.
        À medida que avança, vai deixando os elementos mais a esquerda ordenados, comparando
        o elemento com os anteriores.
        O(n^2)
        
    */
    
    public static void InsertionSort(int[] v){
        
        for(int i = 0; i < v.length; i++){
            for(int j = i; j > 0; j--){
                
                if(v[j] < v[j-1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                } else {
                    break;
                }
                
            }
        }
        
    }
    
}
