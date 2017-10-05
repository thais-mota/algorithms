package AlgoritmosOrdenacao;

public class BubbleSort {
    
    /*
        É um método de ordenação por troca que atua comparando sucessivamente pares de elementos
        e mudando-os de posição quando se apresentam da ordem desejada. 
    
        BubbleSort -> Número de comparações = n^2 - n
                   -> O(n^2)
    
    */
    
    public static void BubbleSort(int[] v){
        
        for(int n = 1; n <= v.length; n++){
            for(int i = 0; i < v.length-1; i++){
                
                if(v[i] > v[i+1]){
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
                
            }
        }
        
    }
    
    public static void BubbleSortMelhorado1(int[] v){
        
        /*
            Cada elemento de posição i será comparado com o de posição i-1, e quando a ordenação procurada  
            é encontrada, uma troca de posições entre os elementos é feita. Nessa versão as posições ordenadas 
            não são mais percorridas.
        
        */
        
        for(int j = 0; j < v.length; j++){
            for(int i = v.length-1; i > j; i--){
                
                if(v[i] < v[i-1]){
                    int aux = v[i];
                    v[i] = v[i-1];
                    v[i-1] = aux;
                }
                
            }
        }     
        
    }
    
    public static void BubbleSortMelhorado2(int[] v){
        
        /*
            Cada elemento de posição i será comparado com o de posição i+1 e, quando a ordenação que se busca
            é encontrada, uma troca de posições entre os dados é feita.
        
        */
        
        int n = 1;
        int troca = 1;
        
        while(n <= v.length && troca == 1){
            
            troca = 0;
            for(int i = 0; i < v.length-1; i++){
                
                if(v[i] > v[i+1]){
                    troca = 1;
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
            }
            
            n = n + 1;
            
        }
        
    }
    
    
}
