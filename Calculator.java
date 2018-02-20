/**
 * Класс реализует калькулятор
 */
public class Calculator {
  /**
   * результат выполнения
   */
  private double result;
  /**
   * сумма аргументов
   */
  public void add(double ... params){
      this.result=params[0]+params[1];
    }

  /**
   * разность аргументов
   */
  public void subtract(double ... params){
    this.result = params[0]-params[1];
  }
  /**
   * произведение аргументов
   */
  public void multiply(double ... params){
    this.result=params[0]*params[1];
  }
  /**
   * деление дробей
   */
  public void divide(double ... params){
    this.result=params[0]/params[1];
  }
  /**
   * возведение в степень
   */
  public void exponentiation(double ... params){
    this.result=Math.pow(params[0],params[1]);
  }
  /**
   * выполнение операции
   */
  public void solve(double first, double second,MathOperation operation){
    switch (operation){
      case ADD:
        this.add(first,second);
        break;
      case DIVIDE:
        this.divide(first,second);
        break;
      case MULTIPLY:
        this.multiply(first,second);
        break;
      case SUBTRACT:
        this.subtract(first,second);
        break;
      case EXPONENTIATION:
        this.exponentiation(first,second);
        break;
    }

  }
  /**
   * getter результата
   */
  public double getResult(){
    return this.result;
  }
  /**
   * обнуление резульата
   */
  public void resetResult(){
    this.result=0;
  }
}
