import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, vacationType, age;
        double price, perKm=0.10,discountWay;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km olarak giriniz : ");
        km = input.nextInt();
        if (km < 1) {
            System.out.print("Hatalı bir değer girdiniz!");
            System.exit(0);
        }
        price = (double)(km*perKm);
        System.out.print("Yolcunun yaşını giriniz: ");
        age = input.nextInt();
        if(age<=0){
            System.out.print("Hatalı seçim yaptınız. ");
            System.exit(0);
        }
        if(age<12){
            price = price/2;
        } else if (age>=12 && age<24) {
            price -= (price*0.1);
        } else if (age>65) {
            price -= (price*0.3);
        }
        System.out.print("Lütfen yolculuk türünü seçiniz.\n1= Tek Yön 2=Gidiş Dönüş:");
        vacationType = input.nextInt();
        if(vacationType==2){
            discountWay=price*0.2;
            System.out.print("Toplam tutar : " + (price - discountWay)*2);
        }else{
            System.out.print("Toplam tutar : " + price);
        }
    }
}