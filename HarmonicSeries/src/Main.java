import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total=0.0;
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for(double i=1;i<=number;i++){
            total += (double)(1/i);
            System.out.println((double)(1/i));
        }
        System.out.println("Sonuç :  " + total);
    }
}