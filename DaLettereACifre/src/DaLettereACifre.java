public class DaLettereACifre {
  public static String DaLettereACifre(String s) {
    String value[] = s.split(" ");
    String result = "";
    for (int i = 0; i < value.length; i++) {
      switch(value[i]) {
        case "zero": result += "0"; break;
        case "uno": result += "1"; break;
        case "due": result += "2"; break;
        case "tre": result += "3"; break;
        case "quattro": result += "4"; break;
        case "cinque": result += "5"; break;
        case "sei": result += "6"; break;
        case "sette": result += "7"; break;
        case "otto": result += "8"; break;
        case "nove": result += "9"; break;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    DaLettereACifre("otto quattro cinque due");
  }
}
