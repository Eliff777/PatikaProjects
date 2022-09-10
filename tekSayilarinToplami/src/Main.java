import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        while (number%2==0){
            if(number%4==0){
                total+=number;
            }
            System.out.print("Lütfen bir sayı giriniz : ");
            number = input.nextInt();
        }
        System.out.print("toplam: "+total);
    }
}