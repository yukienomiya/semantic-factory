import java.util.ArrayList;

public class Sparatutto {
  public static final int h = 5;
  public static final int w = 10;
  private final int nstelle = 3;

  private Navicella N;
  private ArrayList<Nemici> nemici;
  private ArrayList<Stella> stelle;

  public Sparatutto(Navicella N, ArrayList<Nemici> nemici) {//throws Exception {
    // if (N == null || nemici == null) throw new Exception();
    this.N = N;
    this.nemici = nemici;
    stelle = new ArrayList<>();
    for (int i = 0; i < nstelle; i++) {
      stelle.add(new Stella());
    }
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        str.append(" ");
      }
      str.append("\n");
    }

    // stampa le stelle
    for (Stella s : stelle) {
      int positionS = posStr(s.getX(), s.getY());
      if ((str.charAt(positionS) == '\n') || (positionS == 21)) {
        str.setCharAt(positionS + 2, s.toString().charAt(0));
      }
      str.setCharAt(positionS, s.toString().charAt(0));
    }

    // setta la posizione di N (e se il laser è ON, lo stampa)
    int positionN = posStr(N.getX(), N.getY());
    str.setCharAt(positionN, N.toString().charAt(0));

    if (N.getLaser()) {
      for (int i = positionN + 1; i < positionN + w; i++) {
        str.setCharAt(i, N.toString_Laser().charAt(0));
      }
    }

    // stampa i nemici
    for (Nemici n : nemici) {
      str.setCharAt(posStr(n.getX(), n.getY()), n.toString().charAt(0));
    }

    return str.toString();
  }

  public int posStr(int x, int y) {
    return x + y * (w + 1);
  }

  public void prossimoPasso() {
    for (Nemici n : nemici) {
      n.prossimoPasso();
    }
  }



  public static void main(String[] args) {
    Navicella n = new Navicella(false);

    ArrayList<Nemici> nemici = new ArrayList<>();
    Nemici m1 = new Meteorite(3, 2);
    Nemici a1 = new Alieno(7, 0);
    Nemici a2 = new Alieno(6, 4);
    nemici.add(m1);
    nemici.add(a1);
    nemici.add(a2);

    Sparatutto s = new Sparatutto(n, nemici);
    System.out.println(s.toString());

    Navicella n2 = new Navicella(true);
    Sparatutto s2 = new Sparatutto(n2, nemici);
    s2.prossimoPasso();
    System.out.print(s2.toString());
  }
}
