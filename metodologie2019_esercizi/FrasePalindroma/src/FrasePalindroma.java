public class FrasePalindroma {
  public static void FrasePalindroma(String str) {
    char[] inputString = str.toCharArray();
    int end = inputString.length;
    int middle = end/2;
    boolean w = false;

    for (int i = 0; i < middle; i++) {
      int k = end - 1;
      if (inputString[i] == inputString[k]) {w = true; k--;}
      else {break;}
    }
    System.out.print(w);
  }
  public static void main(String[] args) {
    FrasePalindroma("itopinonavevanonipoti");
  }
}
