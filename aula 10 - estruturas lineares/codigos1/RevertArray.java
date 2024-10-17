package codigos1;
import java.util.Arrays;

public class RevertArray {
  public static void main(String[] args) {
    Integer[] x = new Integer[9];
    for (int i=0 ; i < x.length ; i++)  
      x[i]=i+1;
    System.out.println(Arrays.toString(x));
    System.out.println("\n");
    System.out.println(Arrays.toString(Reorder(x)));
  }

  public static Integer[]  Reorder (Integer[] array )  { 
    Integer n = array.length; 
    Integer j = (n/2), temp; 
    for (int i = 0; i < j ; i++) { 
      temp = array[i]; 
      array[i] = array[n-1-i]; 
      array[n-1-i] = temp; 
    }
    return array; 
    }
}
    
