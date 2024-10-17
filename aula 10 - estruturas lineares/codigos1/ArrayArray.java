package codigos1;

public class ArrayArray {
    public static void main(String[] args) {
        int[][] nums  = new int[5][4];
        for (int r=0; r < nums.length; r++) {
            for (int c=0; c < nums[r].length; c++) {
                nums [r][c] = (int) (Math.random() * 10);
                System.out.print(" " + nums[r][c]);
            }
            System.out.println("");
        } 
    }
} 
