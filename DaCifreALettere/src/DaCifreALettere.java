public class DaCifreALettere {
  public static void DaCifreALettere(String s) {
    char[] value = s.toCharArray();
    String result = "";
    for (int i = 0; i < value.length; i++) {
      switch(value[i]) {
        case '0': result += "zero "; break;
        case '1': result += "uno "; break;
        case '2': result += "due "; break;
        case '3': result += "tre "; break;
        case '4': result += "quattro "; break;
        case '5': result += "cinque "; break;
        case '6': result += "sei "; break;
        case '7': result += "sette "; break;
        case '8': result += "otto "; break;
        case '9': result += "nove "; break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    DaCifreALettere("07537");
  }
}
