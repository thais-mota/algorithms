package AlgoritmosBusca;

public class BuscaBinaria {
    
    /*
        É necessário que os elemtos estejam ordenados.
        Realiza sucessivas divisões do espaço de busca comparando o elemento buscado(chave) 
        com o elemento do meio do vetor.
    
        Melhor caso -> O(1)
        Caso médio  -> O(log(n))
        Pior caso   -> O(log(n))
    
    */
    
    public int buscaBinariaIterativa(int[] v, int k){
        
        int inicio = 0;
        int fim = v.length;
        int meio;
        
        while(inicio <= fim){
            meio = inicio + (fim - inicio)/2;
            
            if(k == v[meio]){
                return meio;
            } else if(k > v[meio]){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
                      
        }
        
        return -1;
        
    }
      
}
