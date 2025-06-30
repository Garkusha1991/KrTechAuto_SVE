package utils.random;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class GenerateDate {

  public static String getTodayDate() {
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    return today.format(formatter);
  }

  public static String getDateThreeMonthsFromNow() {
    LocalDate futureDate = LocalDate.now().plusMonths(3);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    return futureDate.format(formatter);
  }
}
