/**
 * Класс запуска chrome драйвера
 * Указание директории для Allure
 */

package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Setup {
  private static WebDriver driver;
  private final WebDriverWait wait;

  static {
    WebDriverManager.chromedriver().setup();
    System.setProperty("allure.results.directory", "target/allure-results");
  }

  public Setup() {
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
    driver.manage().window().setSize(new Dimension(1920, 1080));
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  public WebDriver getDriver() {
    return driver;
  }

  public void maximizeWindow() {
    driver.manage().window().maximize();
  }

  public WebDriverWait getWait() {
    return wait;
  }

  public void openPage(String url) {
    driver.get(url);
  }

  public static void closeBrowser() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }
}
