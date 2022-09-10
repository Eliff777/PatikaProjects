import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        String space=" ", star="*";

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for(int j=number-1;j>=0;j--){
            System.out.print(space.repeat(number-j));
            System.out.print(star.repeat(j));
            System.out.print("*");
            System.out.println(star.repeat(j));
        }
    }
}