import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, firstNumber=0,secondNumber=1, temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        number = input.nextInt();
        if(number==0)
            return;
        else if (number==1) {
            System.out.print(firstNumber);
        } else if (number>=2) {
            System.out.print(firstNumber + "\t");
            System.out.print(secondNumber + "\t");
            for(int i=2;i<number;i++){
                System.out.print(firstNumber+secondNumber + "\t");
                temp=secondNumber;
                secondNumber=firstNumber+secondNumber;
                firstNumber=temp;
            }
        }
    }
}