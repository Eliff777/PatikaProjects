import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height;
        int weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height(in meters) : ");
        height = input.nextDouble();

        System.out.print("Please enter your weight : ");
        weight = input.nextInt();

        System.out.println("Your body mass index is : " + weight/(height*height));
    }
}