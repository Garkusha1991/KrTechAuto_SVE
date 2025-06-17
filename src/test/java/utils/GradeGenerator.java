package utils;

import java.util.Random;

public class GradeGenerator {

  public static String generateFives() {
    return String.valueOf(new Random().nextInt(5)); // от 0 до 10
  }

  public static String generateFours() {
    return String.valueOf(new Random().nextInt(5));
  }

  public static String generateThrees() {
    return String.valueOf(new Random().nextInt(5));
  }

}
