package setup;

import data.GeneratedTestData;
import data.TestData;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ClearFieldsStep_1;
import utils.JsonUtils;
import utils.ScreenshotUtil;

import java.time.Duration;

public class BaseRegistration {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected TestData data;

  @BeforeClass
  public void beforeClass() {
    Setup setup = new Setup();
    setup.openPage("https://beta.rkspo.ru/user/login");
    driver = setup.getDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    data = JsonUtils.readTestData("TestData.json");

    GeneratedTestData.generateGrades();
  }

  @AfterMethod
  public void takeScreenshotOnFailure(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
      String fileName = result.getName() + "_" + System.currentTimeMillis();
      ScreenshotUtil.takeScreenshot(driver, fileName);
    }
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);
    Setup.closeBrowser();
  }

  @Test(priority = 1, description = "Авторизация")
  @Description("Авторизация")
  @Severity(SeverityLevel.CRITICAL)
  public void auth() {
    Auth auth = new Auth(driver, wait);
    auth.login(
      "AutotestAdmin000",
      "AutotestAdmin000!");
  }

  @Test(priority = 2)
  @Description("Переход к регистрации заявления")
  @Severity(SeverityLevel.CRITICAL)
  public void registrationApplication() {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/a"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/ul/li[1]/a"))).click();
  }

  @Test(priority = 3)
  @Description("Очистка полей")
  @Severity(SeverityLevel.TRIVIAL)
  public void clearFields() {
    ClearFieldsStep_1 clearFields = new ClearFieldsStep_1(driver, wait);
    clearFields.clearFieldsStep_1();
  }
}
