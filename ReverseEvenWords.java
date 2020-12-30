package week3.day2;

public class ReverseEvenWords {
  //Build a logic to reverse the even position words (output: I ma a erawtfos tester)
  public static void main(String[] args) {
    String test = "I am a software tester";
    String[] splitedTest = test.split(" ");
    String rev = "";
    int count = 0;
    for (int i = 0; i < splitedTest.length; i++) {
      if (i % 2 == 0) {
        String[] evenNumberValue = splitedTest;
        System.out.print(evenNumberValue[i] + " ");
      } else {
        //count++;
        //System.out.println(count);
        char[] charArray = splitedTest[i].toCharArray();
        //System.out.println(charArray);
        for (int j = charArray.length - 1; j >= 0; j--) {
          rev = rev + charArray[j];
        }
        System.out.print(rev + " ");
        rev = "";
      }
    }

  }

}






