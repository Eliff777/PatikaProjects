import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int radius, angle;
        double pi = 3.14;

        Scanner input= new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        radius = input.nextInt();

        System.out.print("Merkez açıyı giriniz : ");
        angle = input.nextInt();

        System.out.println("Alan : " + (pi * radius * radius));
        System.out.println("Çevre : " + (2 * pi * radius));
        System.out.println("Yarıçapı " + radius + " merkez açısı " + angle + " derece olan daire diliminin alanı : " +
                ((pi * radius * radius) * angle)/360);
    }
}