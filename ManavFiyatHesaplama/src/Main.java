import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, muz=0.95, patlıcan=5.0, domates=1.11, armutkg, elmakg,muzkg,patlıcankg,domateskg ;

        Scanner input= new Scanner(System.in);

        System.out.print("Kaç kg armut aldınız : ");
        armutkg = input.nextDouble();
        System.out.print("Kaç kg elma aldınız : ");
        elmakg = input.nextDouble();
        System.out.print("Kaç kg domates aldınız : ");
        domateskg = input.nextDouble();
        System.out.print("Kaç kg muz aldınız : ");
        muzkg = input.nextDouble();
        System.out.print("Kaç kg patlıcan aldınız : ");
        patlıcankg = input.nextDouble();
        System.out.println("Toplam tutar : " + (armutkg*armut + elmakg*elma +
                muzkg*muz + domateskg*domates + patlıcankg*patlıcan));
    }
}