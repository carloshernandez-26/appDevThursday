import java.util.Scanner;
public class GroupWork   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: 6");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: 3");
        int num2 = scanner.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Product: " + Calculator.multiply(num1, num2));  // Group 3's method
        
     }
  }
