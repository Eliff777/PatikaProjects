import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      int a, b;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first side : ");
      a = input.nextInt();

      System.out.print("Enter the second side : ");
      b = input.nextInt();
      double c = Math.sqrt((double)(a*a+b*b));
      System.out.println("The hypotenuse is : " + c );
      double perimeter = (a + b + c)/2;
      System.out.println("The area is : " + Math.sqrt((double)(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c))));
    }
}