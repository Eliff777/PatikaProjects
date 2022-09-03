import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvsizFiyat, kdvliFiyat, kdvTutari, kdvYuzdesi;

        Scanner fiyat = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz : ");
        kdvsizFiyat = fiyat.nextDouble();

        kdvYuzdesi = (kdvsizFiyat <= 1000 && kdvsizFiyat>=0)? 0.18 : 0.08;
        kdvTutari = kdvsizFiyat * kdvYuzdesi;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("Ürünün KDV'siz fiyatı: " +kdvsizFiyat);
        System.out.println("Ürünün KDV oranı: " +kdvYuzdesi);
        System.out.println("Ürünün KDV'li fiyatı: " + kdvliFiyat);
        System.out.println("Ürünün KDV tutarı:" +(kdvliFiyat - kdvsizFiyat));
    }}