import java.util.Scanner;

public class StringaVerticale {

  public static String StringaVerticale(String inputS) {
    String finalString = "";
    char[] chars = inputS.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      finalString += (chars[i] + "\n");
    }
    return finalString;
  }
  public static void main(String[] args) {
    // legge la stringa in input e la mette in inputString
    System.out.print("Enter a string : ");
    Scanner scanner = new Scanner(System. in);
    String inputString = scanner. nextLine();

    // stampa il risultato di StringaVerticale
    System.out.println(StringaVerticale(inputString));
  }
}
