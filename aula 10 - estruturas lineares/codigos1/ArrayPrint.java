package codigos1;
public class ArrayPrint {
    public static void main(String[] args) {
        Integer[] x = new Integer[50];
        for (int i=0 ; i < x.length ; i++)  
            x[i]=i;
            imprimeArray(x); 
        }
        
        public static void imprimeArray (Integer[] array )  { 
            Integer n = array.length; 
            for (int i = 0 ; i < n ; i++)
            System.out.println(array[i]);
    }
}