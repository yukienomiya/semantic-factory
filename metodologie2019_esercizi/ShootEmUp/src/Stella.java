import java.util.Random;

public class Stella extends Oggetti {

  public Stella() {
    Random rand = new Random();
    x = rand.nextInt(Sparatutto.w);
    y = rand.nextInt(Sparatutto.h);
  }

  @Override
  public String toString() {
    return "*";
  }

  public static void main(String[] args) {
    Stella s = new Stella();
  }
}
