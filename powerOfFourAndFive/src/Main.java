import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        System.out.println("Dördün kuvvetleri :  ");
        for(int i=1;i<=number;i*=4){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Beşin kuvvetleri :  ");
        for(int i=1;i<=number;i*=5){
            System.out.print(i + " ");
        }
    }
}