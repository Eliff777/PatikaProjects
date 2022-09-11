import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] arr2 = new int[arr1[0].length][arr1.length];
        int index=0;
        for(int[] row : arr1){
            int counter=0;
            for(int i=0;i<arr2.length;i++){
               arr2[i][index]=row[counter];
               counter++;
            }
            index++;
        }
        System.out.println("Matrix:");
        System.out.println(Arrays.deepToString(arr1));
        System.out.println("Transpose of it:");
        System.out.println(Arrays.deepToString(arr2));
    }
}