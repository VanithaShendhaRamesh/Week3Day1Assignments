package week3.day2;

public class SumOfDigitsFromString {

  public static void main(String[] args) {
    String text = "Tes12Le79af65";
    int sum = 0;
    String replaceAll = text.replaceAll("\\D", "");
    //System.out.println(replaceAll);
    char[] charArray = replaceAll.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      int numericValue = Character.getNumericValue(charArray[i]);
      sum = sum + numericValue;

    }
    System.out.println(sum);
  }

}
/** a) using replaceAll(), replace all the non-digits into ""
 * b) Now, convert the String into array
 * c) Iterate over the array and get each character
 * d) Using Character.getNumericValue(), Change the char into int
 * e) Add the values to sum & print*/