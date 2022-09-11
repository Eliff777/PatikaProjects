import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        number = input.nextInt();
        int[] arr = new int[number];
        for(int i=0;i<number;i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i + "\t");
        }
    }
}