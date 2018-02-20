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
        String first = scan.next();
        System.out.print("Enter second number: ");
        String second = scan.next();
        calc.add(Integer.valueOf(first), Integer.valueOf(second));
        System.out.println("Result: "+calc.getResult());
        calc.resetResult();
        System.out.print("Exit? (yes/no)");
        exit = scan.next();
      }
    }
    catch (NumberFormatException e){
      System.out.println("Not number");
    }
  }
}