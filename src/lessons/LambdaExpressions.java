package lessons;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class LambdaExpressions {
  /*
  Make an array containing a few Strings. Sort it by
• length (i.e., shortest to longest)
(Hint: this exact solution was shown in the lecture)
• reverse length (i.e., longest to shortest)
(Hint: minor variation of the first bullet)
• alphabetically by the first character only
(Hint: charAt(0) returns the numeric code for the first character)
• Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement. See the first two lambda examples in the notes.)
• Redo the previous problem, but use a static helper method so that your lambda looks like this:
Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))

   */
  public static void main(String[] args) {
String[] unsortArray = {"a New string 1", "String with numbers 1 2 3","a New string 1","New string with long taile", "Short string", "String with numbers 1 2 3"};

 System.out.println("Unsorted Array " + unsortArray.toString() + " ");
 //   System.out.println("Sorted Array shortest to longest "+ shortToLongSorter(unsortArray));
    printArray(unsortArray);
    System.out.println(" Task # 1 Sort it by length (i.e., shortest to longest)");
    Arrays.sort(unsortArray, (s1,s2) -> shortToLongSorter(s1,s2));
    printArray(unsortArray);
    System.out.println(" Task # 2 Reverse length (i.e., longest to shortest)");
    Arrays.sort(unsortArray, (s1,s2) -> longToshortSorter(s1,s2));
    printArray(unsortArray);
    System.out.println(" Task # 3 Alphabetically by the first character only");
    Arrays.sort(unsortArray, (s1,s2) -> alphabeticallySort(s1,s2));
    printArray(unsortArray);
    System.out.println(" Task # 4 Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.\n" +
            "(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement. See the first two lambda examples in the notes.)");
    Arrays.sort(unsortArray, (s1, s2) -> { String f = "^e"; return -1; });
    printArray(unsortArray);
  }

  private static int shortToLongSorter(String a, String b) {
    if (a.length() > b.length()) {
      return 1;
    } else if (a.length() < b.length()) {
      return -1;
    } else {
      return 0;
    }
  }
  private static int longToshortSorter(String a, String b) {
    if (a.length() < b.length()) {
      return 1;
    } else if (a.length() > b.length()) {
      return -1;
    } else {
      return 0;
    }
  }
  private static int alphabeticallySort(String a, String b) {
    if (a.charAt(0)< b.charAt(0)) {
      return 1;
    } else if (a.charAt(0) > b.charAt(0)) {
      return -1;
    } else {
      return 0;
    }
  }
  private static void printArray (String[] unsortArray) {
    for (String s : unsortArray) {
      System.out.println(s);
          }

  }

}
