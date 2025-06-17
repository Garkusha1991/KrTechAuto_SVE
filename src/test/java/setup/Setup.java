/**
 * Класс запуска Chrome драйвера
 * Указание директории для Allure
 */

package setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
  private WebDriver driver;

  public void openBrowser() {
    System.setProperty("webdriver.chromeDriver.driver", "D:\\chromedriver.exe");
    System.setProperty("allure.results.directory", "target/allure-results");

    ChromeOptions options = new ChromeOptions();
    // options.addArguments("--headless"); // если нужно без UI
    driver = new ChromeDriver(options);
    driver.manage().window().setSize(new Dimension(1920, 1080));
  }

  public WebDriver getDriver() {
    return driver;
  }
}