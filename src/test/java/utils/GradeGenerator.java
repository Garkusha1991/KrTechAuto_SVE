/** Генерация рандомных оценок при регистрации в шаге 3 */

package utils;

import java.util.Random;

public class GradeGenerator {

  public static String generateFives() {
    return String.valueOf(new Random().nextInt(5) + 1);
  }

  public static String generateFours() {
    return String.valueOf(new Random().nextInt(5) + 1);
  }

  public static String generateThrees() {
    return String.valueOf(new Random().nextInt(5) + 1);
  }
}
