import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total=0, a;
        String number;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextLine();

        for(int i=0;i<number.length();i++){
            total += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println("Sayının basamakları toplamı :  " + total);
    }
}