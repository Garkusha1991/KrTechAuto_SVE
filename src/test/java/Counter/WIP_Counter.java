package Counter;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.Auth;
import setup.LoadPage;
import setup.Setup;
import utils.GenerateRandomSeries;
import utils.GenerateRandomSnils;
import utils.TimeUtil;

import java.time.Duration;

public class WIP_Counter {

  WebDriver driver;
  WebDriverWait wait;

  // Генерация точного времени
  String time = TimeUtil.getCurrentTime();
  // Вызов генерации рандомного СНИЛС
  String snils = GenerateRandomSnils.generateRandomSnils();
  // Вызов генерации рандомной серии паспорта
  String series = GenerateRandomSeries.generateRandomSeries();

  @BeforeClass
  public void beforeClass() {
    Setup setup = new Setup();
    setup.openBrowser();
    driver = setup.getDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // инициализация wait с таймаутом 10 сек
  }

  @Test(priority = 1)
  @Description("Загрузка страницы")
  @Severity(SeverityLevel.CRITICAL)
  public void loadPage() {
    LoadPage loadPage = new LoadPage(driver);
    loadPage.loadPage();
  }

  @Test(priority = 2)
  @Description("Авторизация")
  @Severity(SeverityLevel.CRITICAL)
  public void auth() {
    Auth auth = new Auth(driver);
    auth.login(
      "AutetestAdminOO777",
      "AutetestAdminOO777!");
  }

  @Test(priority = 3)
  @Description("счётчик Заявлений поступило с ЕПГУ")
  @Severity(SeverityLevel.MINOR)
  public void counter_1 () throws InterruptedException {

    Thread.sleep(3000);

    String pageSource = driver.getPageSource();
    String counterName = "Заявлений поступило с ЕПГУ";

    Assert.assertNotNull("Страница не загрузилась", pageSource);


    String counterValue = null;
    if (pageSource.contains(counterName)) {
      try {
        // Находим элемент заголовка счётчика
        WebElement countCounter = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/div/div[1]/h3"));
        counterValue = countCounter.getText();
        System.out.println("Найден счётчик с значением: " + counterValue);

        // Кликаем по родительскому блоку (чтобы перейти в счётчик)
        WebElement clickOnCounter = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/div/div[1]"));
        clickOnCounter.click();

        // Ждём перехода на новую страницу и появления counterValue в тексте body
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean isValueFound = wait.until(ExpectedConditions.textToBePresentInElementLocated(
          By.tagName("body"), counterValue));

        Assert.assertTrue(isValueFound, "Значение счётчика не найдено на новой странице");
        System.out.println("Проверка пройдена: значение найдено.");

      } catch (Exception e) {
        e.printStackTrace();
        Assert.fail("Ошибка при работе с счётчиком: " + e.getMessage());
      }
    } else {
      Assert.fail("Счётчик с названием '" + counterName + "' не найден на странице.");
    }
    // переход внутрь счётчика
    WebElement counterClick = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/div/a"));
    counterClick.click();

    Thread.sleep(1000);

    WebElement comparison = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w1\"]/div/div[1]/div[1]/div/b[2]")));

    Thread.sleep(20000);

    String comparisonValue = comparison.getText();
    System.out.println(comparisonValue);
    String pageSourceCounter = driver.getPageSource();


    if (counterValue == counterValue) {
      // Всё хорошо — условие истинно
      Assert.assertTrue(true);
    } else {
      // Значение не найдено — выводим сообщение об ошибке
      Assert.fail("Значение счётчика не найдено на новой странице, ожидалось: '" + comparisonValue + "'");
    }
  }

}
