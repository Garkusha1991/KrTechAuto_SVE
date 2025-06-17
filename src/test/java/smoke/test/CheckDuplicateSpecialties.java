/**
 * Проверка на дубликат создания Специальности
 * Проверка реализована под ролью Супер-Администратор (В других ролях функционал заблокирован)
 * После проверки, необходимо убедиться, что появился надпись  "В вашей организации уже создана специальность с такими параметрами"
 */

package smoke.test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.Auth;
import setup.LoadPage;
import setup.Setup;
import utils.ScreenshotUtil;

import java.time.Duration;

public class CheckDuplicateSpecialties {

  WebDriver driver;
  WebDriverWait wait;

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

  @BeforeClass
  public void beforeClass() {
    Setup setup = new Setup();
    setup.openBrowser();
    driver = setup.getDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
      "admin",
      "SKU46adm");
  }

  @Test(priority = 3)
  @Description("Переход в раздел специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void receptionPlan() {
    //     Клик по созданию специальности
    WebElement ReceptionPlan =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/aside[1]/div/nav/ul/li[4]/a")));
    ReceptionPlan.click();
    //     Клик по разделу специальности
    WebElement AddSpecialties =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/aside[1]/div/nav/ul/li[4]/ul/li[1]")));
    AddSpecialties.click();
  }

  @Test(priority = 4)
  @Description("Добавление специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void addSpecialty() throws InterruptedException {
    // Выбор СПО
    WebElement OrganizationName =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"w0\"]/div[1]/div/span/span[1]/span")));
    OrganizationName.sendKeys("Симферопольский колледж радиоэлектроники");
    OrganizationName.sendKeys(Keys.ENTER);
    // Клик по dropDown специальности
    WebElement NameOfSpecialty =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"w0\"]/div[2]/div/span/span[1]/span")));
    NameOfSpecialty.click();
    // Выбор специальности
    WebElement NameOfSpecialtyChoice = wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("/html/body/span/span/span[1]/input")));
    NameOfSpecialtyChoice.sendKeys("Радиомеханик" + Keys.ENTER);
    //  Дата начала приема заявлений
    WebElement ApplicationStartDate = driver.findElement(By.xpath("//*[@id=\"spospecialties-start_date_time\"]"));
    ApplicationStartDate.sendKeys(getTodayDate());
    //Дата окончания приема заявлений
    WebElement SpespecialtiesEndDateTime =
      driver.findElement(By.id("spospecialties-end_date_time"));
    SpespecialtiesEndDateTime.sendKeys(getDateThreeMonthsFromNow());
    // Дата окончания приема оригиналов/согласий
    WebElement SpospecialtiesEndDateTimeAgreed =
      driver.findElement(By.id("spospecialties-end_date_time_agreed"));
    SpospecialtiesEndDateTimeAgreed.sendKeys(getDateThreeMonthsFromNow());
    // Уровень базового образования (9 классов)
    WebElement BasicEducationLevel =
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/form/div[6]/div/span/span[1]/span"));
    BasicEducationLevel.click();
    BasicEducationLevel.sendKeys(Keys.ENTER);
    // Форма обучения (Очная)
    WebElement FormOfStudy =
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/form/div[7]/div/span/span[1]/span"));
    FormOfStudy.click();
    FormOfStudy.sendKeys(Keys.ENTER);
    // Форма оплаты
    WebElement FormOfPayment =
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/form/div[8]/div/span/span[1]/span"));
    FormOfPayment.click();
    FormOfPayment.sendKeys(Keys.ENTER);
    // Количество мест для приема
    WebElement NumberOfReceptionPlaces = driver.findElement(By.id("spospecialties-number_places"));
    NumberOfReceptionPlaces.sendKeys("10");
    // Срок обучения
    WebElement DurationOfTraining = driver.findElement(By.id("spospecialties-term_study"));
    DurationOfTraining.sendKeys("10");
    // Наличие вступительных испытаний
    WebElement EntranceExaminations = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[11]/div/div[1]/div/div/span[2]"));
    EntranceExaminations.click();
    // Расширенная медицинская справка
    WebElement MedicalCertificate = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[12]/div/div[1]/div/div/span[2]"));
    MedicalCertificate.click();
    // Использовать профильные дисциплины
    WebElement ProfileDisciplines = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[13]/div/div[1]/div/div/span[2]"));
    ProfileDisciplines.click();
    // Наличие приема на ЕПГУ
    WebElement AdmissionEPGU = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[14]/div/div[1]/div/div/span[2]"));
    AdmissionEPGU.click();
    // Сохранить
    WebElement BtnSave = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[15]/div/button"));
    BtnSave.click();

    Thread.sleep(1000);

    String pageSource = driver.getPageSource();
    String expectedText = "В вашей организации уже создана специальность с такими параметрами.";

    Assert.assertNotNull(pageSource);
    if (!pageSource.contains(expectedText)) {
      Assert.fail("Проверка не пройдена: всплывающая подсказка -- '" + expectedText + "' не найдена");
    } else {
      System.out.println("Проверка пройдена, повторное создание организации не доступно");
    }
  }

  @AfterMethod
  public void takeScreenshotOnFailure(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
      // Сделать скриншот с именем теста + время
      String fileName = result.getName() + "_" + System.currentTimeMillis();
      ScreenshotUtil.takeScreenshot(driver, fileName);
    }
  }

  @AfterClass
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}





