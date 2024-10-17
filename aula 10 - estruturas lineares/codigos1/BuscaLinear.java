package codigos1;
public class BuscaLinear {
    public static void main(String[] args) {
        Integer[] x = new Integer[50];
        for (int i=0 ; i < x.length ; i++)  
            x[i]=i+1;
            Integer argumento = 50; 
            Integer n = (BuscaLinearArray(x,argumento) ) ; 
        if ( n == -1)
            System.out.println("Valor não existente no array...");
        else
            System.out.println("Valor " + argumento + " encontrado na posição: " + n );
    }        

    public static Integer BuscaLinearArray (Integer[] array , Integer argumento ) { 
        Integer n = array.length; 
        for (int i = 0 ; i < n ; i++)
            if (array[i] == argumento)
                return i; 
        return -1; 
    }
}

