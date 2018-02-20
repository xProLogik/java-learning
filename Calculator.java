/**
 * Класс реализует калькулятор
 */
public class Calculator {
  /**
   * результат выполнения
   */
  private int result;
  /**
   * сумма аргументов
   */
  public void add(int ... params){
    for (int param:params){
      this.result+=param;
    }
  }
  /**
   * getter результата
   */
  public int getResult(){
    return this.result;
  }
  /**
   * обнуление резульата
   */
  public void resetResult(){
    this.result=0;
  }
}
