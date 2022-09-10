import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        number = input.nextInt();
        decrease(number,number);
        increase(number,number);
    }
    static void decrease(int number,int temp){
        System.out.print(number + "\t");
        if(number>0){
            decrease( number-5,temp);
        }else {
            increase(number+5,temp);
            System.exit(0);
        }
    }
    static void increase(int number,int temp){
        if(number==temp){
            System.out.print(number + "\t");
            return;
        }
        System.out.print(number + "\t");
        if(number<temp){
            increase( number+5,temp);
        }
    }
}