import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2,result;

        Scanner input = new Scanner(System.in);

        System.out.println("Konbinasyon formülü : C(n,r) = n! / (r! * (n-r)!) şeklindedir. ");
        System.out.print("Lütfen n değerini giriniz: ");
        number1 = input.nextInt();
        System.out.print("Lütfen r değerini giriniz: ");
        number2 = input.nextInt();

        System.out.print("C(" + number1 + "," + number2 + ") = "
                +(calcFac(number1)/(calcFac(number2)*calcFac((number1-number2)))));
    }
    public static int calcFac(int number){
        int factorial=1;
        for(int i = 1; i <= number; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}