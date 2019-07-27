public class RettangoloDiCaratteri {
  private int x, y, length, height;
  public RettangoloDiCaratteri(int x, int y, int length, int height) {
    this.x = x;
    this.y = y;
    this.length = length;
    this.height = height;
  }
  public void draw() {
    String result = "";
    for (int i = 0; i < y; i++) {
      result += "\n";
    }
    for (int h = 0; h < height; h++) {
      for (int k = 0; k < x; k++) {
        result += " ";
      }
      for (int l = 0; l < length; l++) {
        result += "*";
      }
      result += "\n";
    }
    System.out.print(result);
  }

  public static void main(String[] args) {
    RettangoloDiCaratteri rettangolo1 = new RettangoloDiCaratteri(2, 2, 4 ,3);
    rettangolo1.draw();
  }
}
