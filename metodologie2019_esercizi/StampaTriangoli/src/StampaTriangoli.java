public class StampaTriangoli {
  public static void StampaTriangoli(int N) {
    int stars = 1;
    String result = "";
    int heigth = (N/2) + 1;

    for (int i = 0; i < heigth; i++) {
      for (int sp = 0; sp < (N - stars)/2; sp++) {
        result += " ";
      }
      for (int st = 0; st < stars; st++) {
        result += "*";
      }
      result += "\n";
      stars += 2;
    }
    System.out.print(result);
  }

  public static void main(String[] args) {
    StampaTriangoli(75);
  }
}
