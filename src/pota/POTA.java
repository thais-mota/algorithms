package pota;

public class POTA {

    public static void main(String[] args) {
        
        int v[] = {0,1,2,3,4,5,6,7,8,9};
        
        int inicio = 0;       
        int fim = v.length - 1;
        int centro = inicio + (fim - inicio)/2;
        
        //System.out.println(buscaBinaria(v, inicio, fim, centro, 10));

    }



    public static int funcao(int a, int b) {

        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        } else {
            return a + funcao(a, b - 1);
        }

    }

    public static int somaNumeros(int n) {
        
        int quociente = n / 10;
        int resto = n % 10;
        
        if(quociente == 0){
            return resto;
        }
        
        return resto + somaNumeros(quociente);

    }
    
    public static int somaNumeros2(int n) {

        if(n % 10 == 0)
            return n % 10;
          
        return n % 10 + somaNumeros(n / 10);

    }
            
    public static boolean buscaSequencialRecursiva(int[] v, int k, int i){
                 
            if(i == v.length){
                return false;
            } else if(v[i] == k){
                return true;
            }  else {
                return buscaSequencialRecursiva(v, k, ++i);               
            }
                        
        }
        
    public static boolean buscaBinaria(int[] v, int inicio, int fim, int centro, int k){
            
            boolean flag = false;
            
            do {
               
                if(k == v[centro]){
                    flag = true;
                } 
                
                else {
                    if(k > v[centro]){
                        inicio = centro + 1;                        
                    } else {
                        fim = centro - 1; 
                    }
                    
                    centro = inicio + (fim - inicio)/2;
                }
                
            } while (!flag);
            
            return flag;
            
        }
     
}
