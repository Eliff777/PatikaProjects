import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber,thirdNumber,min,secondMin,max;

        Scanner input = new Scanner(System.in);
        System.out.print( "Please enter the first number : ");
        firstNumber = input.nextInt();
        System.out.print( "Please enter the second number : ");
        secondNumber = input.nextInt();
        if(secondNumber<firstNumber) {
            min = secondNumber;
            secondMin = firstNumber;
        }else{
            min=firstNumber;
            secondMin=secondNumber;
        }
        System.out.print( "Please enter the third number : ");
        thirdNumber = input.nextInt();
        if(thirdNumber<min){
            max=secondMin;
            secondMin=secondNumber;
            min=thirdNumber;
        }
        else{
            if(thirdNumber<secondMin){
                max=secondMin;
                secondMin=thirdNumber;
            }else{
                max=thirdNumber;
            }
        }
        if(min==secondMin && secondMin==max){
                System.out.print(min + " = "+secondMin+" = "+ max);
        }else if(min==secondMin){
            System.out.print(min + " = "+secondMin+" < "+ max);
        } else if (secondMin==max) {
            System.out.print(min + " < "+secondMin+" = "+ max);
        }else{
            System.out.print(min + " < "+secondMin+" < "+ max);
        }
    }
}