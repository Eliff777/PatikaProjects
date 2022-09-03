import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, phy, chem, turkish, history, music;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        math = sc.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        phy = sc.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        chem = sc.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = sc.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        history = sc.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        music = sc.nextInt();

        double result = (double)(math + phy + chem + turkish + history + music)/6;
        System.out.println("Ortalamanız : " + result);

        boolean condition = result >= 60;
        String isPassed = condition ? "Tebrikler geçtiniz. " : "Kaldınız. ";
        System.out.println(isPassed);

    }
}