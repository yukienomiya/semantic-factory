public class Navicella extends Oggetti {
  // private final int initialX = 0; (mi da errore se uso questi)
  // private final int initialY = 2; (non posso referenziare queste variabili prima di chiamare il costruttore)
  private boolean laser;

  public Navicella(boolean laser) {
    x = 0;
    y = 2;
    setLaser(laser);
  }

  public void su() {
    y++;
  }

  public void giu() {
    y--;
  }

  public void setLaser(boolean laser) {
    this.laser = laser;
  }

  public boolean getLaser() {
    return laser;
  }

  @Override
  public String toString() {
    return "N";
  }

  public String toString_Laser() {
    return "-";
  }
}
