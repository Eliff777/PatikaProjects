import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();
        System.out.print(isPalindrom(n) ? n + " sayısı palindrom bir sayıdır." : n + " sayısı palindrom bir sayı değildir.");
    }

    static boolean isPalindrom(int number) {
        String Nmbr=String.valueOf(number), temp="";
        for(int i=0;i<Nmbr.length();i++){
            temp+=String.valueOf(number%10);
            number /=10;
        }
        if(Nmbr.equals(temp))
            return true;
        else
            return false;
    }
}