import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        Arrays.sort(list);
        for(int i:list){
            if(i>number){
                int index = Arrays.binarySearch(list, i);
                System.out.println("Girilen sayıdan küçük en yakın sayı : " +list[index-1] );
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + i);
                break;
            }
        }
    }
}