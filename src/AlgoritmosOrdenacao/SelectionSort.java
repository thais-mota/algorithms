package AlgoritmosOrdenacao;

public class SelectionSort {
 
    /*
        Recomendado para conjuntos pequenos de dados.
    
        O algoritmo consiste em três passos: 
            Navegue pelo vetor até encontrar o menor valor.
            Remova esse valor do vetor e insira na primeira posição não alterada do vetor de resposta.
            Repita esse passo para cada item presente no vetor.
            
            O(n^2)
    
    */
    
    public static void SelectionSort(int[] v){
        
        for (int i = 0; i < v.length-1; i++){
            int menor = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[menor]){
                    menor = j;
                }
            }
            
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
            
        }
        
    }
    
    
}
