import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,4,4,5,6,8,8,9};
        int[] arr2 = new int[arr.length];
        Arrays.fill(arr2,-1);
        int index=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(arr2[index]!=arr[i]){
                    arr2[index]=arr[i];
                    index++;
                }
            }
        }
        for(int i:arr2){
            if(i!=-1)
                System.out.print(i + "\t");
        }
    }
}