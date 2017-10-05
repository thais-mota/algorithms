package AlgoritmosOrdenacao;

public class MergeSort {

    /*
        A entrada de dados é sempre dividida de forma balanceada.
        
        O algoritmo possui as seguintes etapas: 
            Divida o vetor em vetores menores até que os vetores tenham comprimento 1.
            Agrupe esses vetores colocando-os em ordem.
    
     */
    
    //Recursivo
    //p = indice inicial; r = indice final
    public static void MergeSort(int[] v, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            MergeSort(v, p, q);
            MergeSort(v, q + 1, r);
            merge(v, p, q, r);
        }

    }

    public static void merge(int[] v, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] aux1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            aux1[i] = v[i + p];
        }

        int[] aux2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            aux2[i] = v[i + q + 1];
        }

        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            
            if (i == n1) {
                v[k] = aux2[j++];
            } else if (j == n2) {
                v[k] = aux1[i++];
            } else if (aux1[i] < aux2[j]) {
                v[k] = aux1[i++];
            } else {
                v[k] = aux2[j++];
            }

        }
    }
}
