public class Cornice {
  public static void Cornice(int N) {
    String result = "";
    for (int j = 0; j < N - 1; j++) {result += "*";}
    result += "*\n";
    int index = N - 2;
    for (int i = 0; i <= index; i++) {
      result += "*";
      // I need this iteration to insert spaces
      for (int k = 0; k < index; k++) {result += " ";}
      result += "*\n";
    }
    for (int j = 0; j < N; j++) {result += "*";}
    System.out.print(result);
  }

  public static void main(String[] args) {
    Cornice(10);
  }
}
