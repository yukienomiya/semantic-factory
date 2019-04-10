import java.util.Arrays;

public class EstrazioneDelLotto {

  private int[] estrazione = new int[5];
  private int totaleNumeriEstratti;

  public void estrai() {
    for (int i = 0; i < 5; i++) {
      estrazione[i] = (int)(Math.random() * 89) + 1;
      totaleNumeriEstratti += estrazione[i];
    }
  }

  @Override
  public String toString() {
    String estrazioneString = "\"";
    estrazioneString += estrazione[0];
    for (int i = 1; i < 5; i++) {
      estrazioneString += "," + estrazione[i];
    }
    estrazioneString += "\"";
    return estrazioneString;
  }

  public int numeriContenuti(int[] giocata) {
    if (giocata.length > 10) return -1;
    int[] copiaEstrazione = Arrays.copyOf(estrazione, 5);
    int count = 0;

    for (int i = 0; i < giocata.length; i ++) {
      for (int j = 0; j < copiaEstrazione.length; j++) {
        if (giocata[i] == copiaEstrazione[j]) {
          copiaEstrazione[j] = 0;
          count++;
        }
      }
    }
    return count;
  }

  public boolean vincita(int[] giocata) {
    int vincita = numeriContenuti(giocata);
    return vincita > 1;
  }

  public int getTotaleNumeriEstratti() {
    return totaleNumeriEstratti;
  }

  public static void main(String[] args) {
    EstrazioneDelLotto estrazione1 = new EstrazioneDelLotto();
    estrazione1.estrai();
    System.out.println(estrazione1.toString());
    int[] giocata1 = new int[] {-1, 3};
    System.out.println(estrazione1.numeriContenuti(giocata1));
    System.out.println(estrazione1.vincita(giocata1));
    System.out.println(estrazione1.getTotaleNumeriEstratti());
    estrazione1.estrai();
    System.out.println(estrazione1.toString());
    System.out.println(estrazione1.getTotaleNumeriEstratti());
  }
}
