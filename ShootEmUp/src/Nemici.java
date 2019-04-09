abstract public class Nemici extends Oggetti {
  public Nemici(int x, int y) {
    this.x = x;
    this.y = y;
  }

  abstract void prossimoPasso();
}
