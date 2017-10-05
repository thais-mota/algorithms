package AlgoritmosBusca;

public class BuscaSequencial {

    /*
        A busca ocorre ao longo de todos os elementos do arranjo de dados.
        
        Melhor caso -> O(1)
        Caso médio  -> O((n+1)/2)
        Pior caso   -> O(n)
    
        Se os elementos não estiverem ordenados, o único método de busca é o Sequencial.
    */
      
    public static int buscaSequencialIterativa(int[] v, int k) {

        for (int i = 0; i < v.length; i++) {
            if (k == v[i]) {
                return i;
            }
        }

        return -1;

    }
    
    public static int buscaSequencialOrdenado(int[] v, int k){
        
        for(int i = 0; i < v.length || v[i] >= k; i++){
            if(v[i] == k){
                return i;
            }           
        }
        
        return -1;
               
    }

}
