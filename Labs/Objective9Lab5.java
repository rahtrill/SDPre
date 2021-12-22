import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    while(keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      switch(choice) {
        case 1:
          System.out.println("Please enter your first number: ");
          num1 = kb.nextDouble();
          System.out.println("Please enter your second number: ");
          num2 = kb.nextDouble();
          System.out.println("The sum of " + num1 + " and " + num2 + " is " + findSum(num1, num2));
          break;

        case 2:
          System.out.println("Please enter your first number: ");
          num1 = kb.nextDouble();
          System.out.println("Please enter your second number: ");
          num2 = kb.nextDouble();
          System.out.println("The average of " + num1 + " and " + num2 + " is " + findAverage(num1, num2));
          break;

        case 3:
          System.out.println("Please enter the amount you'd like to calculate tax for: ");
          answer = kb.nextDouble();
          System.out.println("The amount after tax is $" + calcTax(answer));
          break;

        case 4:
          System.out.println("Goodbye!");
          keepGoing = false;
          break;

        default:
          System.out.println("Invalid entry. Please try again.");
          break;
      }
    }
    kb.close();
  }

  public static void printMenu() {
    System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }

  public static double findAverage(double x, double y) {
    double sum = (findSum(x, y) / 2);
    return sum;
  }

  public static double calcTax(double gross) {
    double net = gross - (gross * 0.0831);
    return net;
  }
}
