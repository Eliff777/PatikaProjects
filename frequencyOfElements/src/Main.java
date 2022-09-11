import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int[][] arr2= new int[arr.length][2];
        arr2[0][0]=arr[0];
        arr2[0][1] =1;
        int index=1;
        for(int i=1;i<arr2.length;i++){
            if(arr2[index-1][0]==arr[i]){
                arr2[index-1][1] = arr2[index-1][1]+1;
            }else{
                arr2[index][0]=arr[i];
                arr2[index][1]=1;
                index++;
            }
        }
        for (int[] row : arr2){
            if(row[0] == 0)
                break;
            System.out.println(row[0] + " sayısı " + row[1] + " kez tekrar etmektedir.");
        }
    }

}
