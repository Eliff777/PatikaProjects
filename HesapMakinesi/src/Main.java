import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber , secondNumber, operation;

        Scanner input= new Scanner(System.in);

        System.out.println( "Enter the first number : ");
        firstNumber= input.nextInt();

        System.out.println( "Enter the second number");
        secondNumber= input.nextInt();

        System.out.println( "Addition 1\nSubstraction 2\nMultiplication 3\nDivision 4 ");
        System.out.println( "Please select one of them : ");
        operation= input.nextInt();

        switch (operation) {
            case 1 :
                System.out.println( "Addition of two number is : " + (firstNumber + secondNumber));
                break;
            case 2 :
                System.out.println( "Substraction of two number is : " + (firstNumber - secondNumber));
                break;
            case 3 :
                System.out.println( "Multiplication of two number is : " + (firstNumber * secondNumber));
                break;
            case 4 :
                if (secondNumber != 0){
                    System.out.println(firstNumber / secondNumber);
                }
                else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default :
                System.out.println("Wrong choice");
        }
    }
}