import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, min, max, count;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        count = input.nextInt();
        if(count==0){
            System.out.print("Geçerli bir sayı girmediniz.");
            return;
        }else if(count==1){
            System.out.print("1. sayıyı giriniz :");
            min = input.nextInt();
            max=min;
        }else if(count==2){
            System.out.print("1. sayıyı giriniz :");
            min = input.nextInt();
            System.out.print("2. sayıyı giriniz :");
            max = input.nextInt();
            if(min>max){
                number=max;
                max=min;
                min=number;
            }
        }else {
            System.out.print("1. sayıyı giriniz :");
            min = input.nextInt();
            System.out.print("2. sayıyı giriniz :");
            max = input.nextInt();
            if(min>max){
                number=max;
                max=min;
                min=number;
            }
            for(int i=2; i<count; i++){
                System.out.print((i+1) + ". sayıyı giriniz :");
                number = input.nextInt();
                if(number>max)
                    max=number;
                else if(number<min)
                    min=number;
            }
        }
        System.out.print("min : " + min + "\t max : "+ max);
    }
}