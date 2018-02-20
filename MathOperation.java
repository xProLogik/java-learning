public enum MathOperation{
  ADD,
  SUBTRACT,
  MULTIPLY,
  DIVIDE,
  EXPONENTIATION,
  ERROR_OPERATION;
  public static MathOperation getOperation(char symbol) {
    switch (symbol) {
      case '+': return ADD;
      case '-': return SUBTRACT;
      case '*': return MULTIPLY;
      case '/': return DIVIDE;
      case '^': return EXPONENTIATION;
      default: return ERROR_OPERATION;
    }
  }
}