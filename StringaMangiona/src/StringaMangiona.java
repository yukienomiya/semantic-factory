public class StringaMangiona {
  private String s;
  private int lettereMangiate;

  public StringaMangiona(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return s;
  }


  public int length() {
    return s.length();
  }

  public char getCarattere(int k) {
    return s.charAt(k);
  }

  public void mangiaLettera(char a) {
    String s2 = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == a) {
        lettereMangiate++;
        continue;
      }
      else {
        s2 += s.charAt(i);
      }
    }
    this.s = s2;
  }

  public void slurp() {
    lettereMangiate += s.length();
    String s = "";
    this.s = s;
  }

  public void mangiaStringaMangiona(StringaMangiona r) {
    String result = "";
    for (int j = 0; j < s.length(); j++) {
      boolean match = false;
      for (int i = 0; i < r.s.length(); i++) {
        if (s.charAt(j) == r.s.charAt(i)) {
          match = true;
          break;
        }
      }
      if (!match) {
        result += s.charAt(j);
      }
    }
    lettereMangiate += s.length - result.length;
    this.s = result;
  }

  public int getTotaleMangiate() {
    return lettereMangiate;
  }

  public static void main(String[] args) {
    StringaMangiona str = new StringaMangiona("aiuola");
    System.out.println(str.toString());
    System.out.println(str.length());
    System.out.println(str.getCarattere(2));
    str.mangiaLettera('u');
    System.out.println(str);
    str.slurp();
    System.out.println(str);
    System.out.println(lettereMangiate);

    StringaMangiona str1 = new StringaMangiona("euristico");
    StringaMangiona str2 = new StringaMangiona("ioi");
    str1.mangiaStringaMangiona(str2);
    System.out.println(str1);
    System.out.println(lettereMangiate);
  }
}
