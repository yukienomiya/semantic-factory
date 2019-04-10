public class Divisori {
  public static void Divisori(int n) {
    String divisori = "1";
    for (int i = 2; i < n; i++){
      if (n % i == 0) {divisori += ", " +i ;}
    }
    System.out.print(divisori);
  }

  public static void main(String[] args) {
    Divisori(20);
  }
}
