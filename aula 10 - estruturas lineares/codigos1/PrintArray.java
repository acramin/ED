package codigos1;

public class PrintArray {
    public static void main(String[] args) {
        int[][] nums  = new int[5][4];
        for (int r=0; r < nums.length; r++)  
            for (int c=0; c < nums[r].length; c++)  
            nums [r][c] = (int) ( Math.random() * 10);
        printArray2D(nums); 
    }

    public static void printArray2D (int[][] array) { 
        for (int r=0; r < array.length; r++)  { 
            for (int c=0; c < array[r].length; c++)  
                System.out.print ( array[r][c] + " " ); 
        System.out.print("\n"); 
        }
    } 
}