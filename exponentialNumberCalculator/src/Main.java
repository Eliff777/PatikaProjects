import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, üs, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Üslü sayı hesaplama programı");
        System.out.print("Lütfen taban değerini giriniz: ");
        taban = input.nextInt();
        System.out.print("Lütfen üs değerini giriniz: ");
        üs = input.nextInt();

        for(int i=0;i<üs;i++){
            result *=taban;
        }
        System.out.print("Sonuç :  " + result);
    }
}