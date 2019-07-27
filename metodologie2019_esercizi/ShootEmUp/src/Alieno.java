public class Alieno extends Nemici {

  public Alieno(int x, int y) {
    super(x, y);
  }

  @Override
  public void prossimoPasso() {
    x--;
  }

  @Override
  public String toString() {
    return "A";
  }
}
