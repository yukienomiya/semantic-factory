public class Meteorite extends Nemici {

  public Meteorite(int x, int y) {
    super(x, y);
  }

  @Override
  public void prossimoPasso() {
    x--;
    y++;
  }

  @Override
  public String toString() {
    return "M";
  }
}
