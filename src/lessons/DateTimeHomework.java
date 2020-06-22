package lessons;

import java.time.*;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;


public class DateTimeHomework {
  public static void main(String[] args) {
// 1.
    int year = 2020;
    System.out.println("Task #1 ");
    lenghtMonthDuringYear(year);
// 2.
    int month = 6;
    System.out.println("Task #2 ");

    listAllMondaysItThatMonth(month);

//3.

    System.out.println("Task #3 ");

    LocalDate inputDate = LocalDate.of(2020, 3, 13);
    testGivenDateFridayThe13Th(inputDate);

  }

  //1. Write an example that, for a given year, reports the length of each month within that year.
  private static void lenghtMonthDuringYear(int year) {
    for (int month = 1; month <= 12; ++month) {
      LocalDate inputDate = LocalDate.of(year, month, 1);
      System.out.println("Length of " + inputDate.getMonth() + " is " + inputDate.lengthOfMonth() + " days");
    }
  }

  // 2. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
  private static void listAllMondaysItThatMonth(int month) {
    LocalDate inputDate = LocalDate.of(LocalDate.now().getYear(), month, 1);

    for (int day = 1; day <= inputDate.lengthOfMonth(); ++day) {
      LocalDate operationDate = LocalDate.of(inputDate.getYear(), month, day);
      if (operationDate.getDayOfWeek() == MONDAY) {
        System.out.println(operationDate.getDayOfWeek() + " " + operationDate.getDayOfMonth());
      }
    }
  }

  //3. Write an example that tests whether a given date occurs on Friday the 13th.
  private static void testGivenDateFridayThe13Th(LocalDate inputDate) {
    if (inputDate.getDayOfWeek() == FRIDAY && inputDate.getDayOfMonth() == 13) {
      System.out.println("This day is Friday 13th");
    } else {
      System.out.println("This day is not Friday 13th");
    }
  }
}



