package AlgoritmosBusca;

public class BuscaInterpolacao {
    
    /*
    
        Os elementos devem estar uniformemente distribuídos e ordenados.
        EX. 10 20 30 40 50 60 70 80 90
    
        Pior caso -> O(log log n)
    
    */
    
    public static int BuscaInterpolacao(int[] v, int k){
        
        int inicio = 0;
        int fim = v.length - 1;
        int meio;
        
        while(inicio <= fim && k >= v[inicio] && k <= v[fim]){
            
            meio = inicio + ((fim - inicio)*(k - v[inicio]))/(v[fim] - v[inicio]);
            
            if(v[meio] < k){
                inicio = meio +1;
            } else if(v[meio] > k){
                fim = meio - 1;
            } else {
                return meio;
            }
            
        }
        
        return -1;
        
    }  
    
}
