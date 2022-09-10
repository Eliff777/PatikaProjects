import java.util.Scanner;
// 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
public class Main {
    public static void main(String[] args) {
        int number = 0, counter = 0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for(int i = 0; i <= number; i++){
            if(i%12==0){
                total += i;
                counter++;
            }
        }
        System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması  :"
                +(double)(total/(counter-1)));
    }
}