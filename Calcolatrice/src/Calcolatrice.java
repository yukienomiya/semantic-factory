import java.util.Arrays;

public class Calcolatrice {
  private double value;
  private double[] memory = new double[0];
  private double[] previousSum = new double[] {0};


  public void somma(double s) {
    double[] copyOfpSum = Arrays.copyOf(previousSum, previousSum.length + 1);
    copyOfpSum[previousSum.length] = s;
    value += s;
    this.value = value;
    this.previousSum = copyOfpSum;
  }

  public void memorizza() {
    double[] copyOfMemory = Arrays.copyOf(memory, memory.length + 1);
    copyOfMemory[memory.length] = value;
    this.memory = copyOfMemory;
  }

  public void azzera() {
    value = 0.0;
    double[] copyOfpSum = new double[0];
    this.previousSum = copyOfpSum;
  }

  public boolean recupera(int k) {
    if (k >= 0 && k < memory.length) {
      value = memory[k];
      double[] copyOfpSum = Arrays.copyOf(previousSum, previousSum.length + 1);
      copyOfpSum[previousSum.length] = memory[k];
      this.previousSum = copyOfpSum;
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {
    String result = "";
    result += previousSum[0];
    for (int i = 1; i < previousSum.length; i++) {
      result += "+" + previousSum[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Calcolatrice c1 = new Calcolatrice();
    c1.somma(5);
    c1.somma(3);
    System.out.println(c1.toString());
    c1.memorizza(); c1.azzera(); c1.recupera(0); c1.somma(1);
    System.out.println(c1.toString());
    c1.memorizza(); c1.azzera(); c1.recupera(1);
    System.out.println(c1.toString());
  }
}
