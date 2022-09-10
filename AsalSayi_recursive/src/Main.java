import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        System.out.print(isPrime(number,2) ? number + " sayısı asaldır." : number + " sayısı asal değildir.");

    }
    static boolean isPrime(int number,int i){
        if(i+1==number)
            return true;
        if(number==2)
            return true;
        else if (number<2) {
            return false;
        }
        else {
            if((number%i)==0)
                return false;//asal değil
            else
                return isPrime(number,i+1);
        }
    }
}

