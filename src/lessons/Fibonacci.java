package lessons;

public class Fibonacci {
  public static void main(String[] args) {
    for (int i = -3; i <= 10; i++) {
      if (i < 0) {
        System.out.println("Please enter positive index");
      } else {
        System.out.println("i = " + i + " value = " + fibonacci(i));
      }
    }
  }

  private static int fibonacci(int indexFib) {
    int value = 0;
    int a = 0;
    int b = 1;
    for (int i = 0; i <= indexFib; ++i) {
      value = a;
      a = a + b;
      b = value;
    }
    return value;
  }

}
