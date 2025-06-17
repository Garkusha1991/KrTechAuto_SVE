package utils;

import static smoke.test.Registration.Data.TestDataForRegistration.*;

public class GradeCalculator {

  public static String GradeGenerator() {
    int fives = Integer.parseInt(expectedEducationDocumentNumberFives);
    int fours = Integer.parseInt(expectedEducationDocumentNumberFours);
    int threes = Integer.parseInt(expectedEducationDocumentNumberThrees);

    int totalGrades = fives + fours + threes;

    if (totalGrades == 0) {
      return "0";
    }

    int totalPoints = fives * 5 + fours * 4 + threes * 3;
    double rawAverage = (double) totalPoints / totalGrades;
    double rounded = Math.round(rawAverage * 1000.0) / 1000.0;

    if (rounded == (long) rounded) {
      return String.valueOf((long) rounded);
    } else {
      return String.valueOf(rounded);
    }
  }
}



