import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      //int num1 = 0, num2 = 0, num3 = 0;
      //double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

      System.out.println("Please enter the first whole number you would like to add.");
      int num1 = keyboard.nextInt();
      System.out.println("Please enter the first second number you would like to add.");
      int num2 = keyboard.nextInt();
      System.out.println("Please enter the first third number you would like to add.");
      int num3 = keyboard.nextInt();
      System.out.println("Please enter the first decimal number you would like to add.");
      double dub1 = keyboard.nextDouble();
      System.out.println("Please enter the first decimal number you would like to add.");
      double dub2 = keyboard.nextDouble();
      System.out.println("Please enter the first decimal number you would like to add.");
      double dub3 = keyboard.nextDouble();

      int sum = num1 + num2 + num3;
      double dubSum = dub1 + dub2 + dub3;

      System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);
      System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);
    }
}
