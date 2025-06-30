/** Распаковщик Data.json */

package utils;

import data.TestData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JsonUtils {
  public static TestData readTestData(String resourceName) {
    ObjectMapper mapper = new ObjectMapper();
    try (InputStream inputStream = JsonUtils.class.getClassLoader().getResourceAsStream(resourceName)) {
      if (inputStream == null) {
        throw new RuntimeException("Файл не найден: " + resourceName);
      }
      return mapper.readValue(inputStream, TestData.class);
    } catch (IOException e) {
      throw new RuntimeException("Ошибка чтения JSON: " + e.getMessage(), e);
    }
  }
}
