import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * калькулятор с вводом с клавиатуры
 */
public class Calc {
  public static void main(String[] arg) {
    try (Scanner scan = new Scanner(System.in)) {
      Calculator calc = new Calculator();
      String exit = "no";
      while (!exit.equals("yes")) {
        System.out.print("Enter first number: ");
        Double first = scan.nextDouble();
        MathOperation operation = MathOperation.ERROR_OPERATION;
        while (operation == MathOperation.ERROR_OPERATION) {
          System.out.print("Enter mathematical operation (+  -  *  /  ^): ");
          String enterOperation = scan.next().replaceAll(" ", "");
          if (enterOperation.length() == 1)
            operation = MathOperation.getOperation(enterOperation.charAt(0));
        }
        System.out.print("Enter second number: ");
        Double second = scan.nextDouble();
        calc.solve(first, second, operation);
        System.out.println("Result: " + (int)calc.getResult());
        calc.resetResult();
        System.out.print("Exit? (yes/no)");
        exit = scan.next();
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid number");
    }
  }
}