/**
 * Тест проверки обязательных полей
 * при регистрации заявления
 * Доработать проверку полей, после добавления разработчиком подсказок.
 * 1. Специальные условия
 * 2. Индивидуальные достижения
 * 3. Оценка
 */

package smoke.test.Registration;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.Auth;
import setup.LoadPage;
import setup.Setup;
import smoke.test.Registration.Data.TestDataForRegistration;
import smoke.test.Registration.Steps.*;
import utils.ClearFieldsStep_1_NotError;
import utils.ScreenshotUtil;

import java.time.Duration;
import java.util.List;

import static smoke.test.Registration.Data.TestDataForRegistration.*;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantAddress;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantBirthDate;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantBirthPlace;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantEmail;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantIndex;
import static smoke.test.Registration.Data.TestDataForRegistration.expectedApplicantPhone;

public class RegistrationMandatoryFields {

  WebDriver driver;
  WebDriverWait wait;

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
      "AutotestAdmin000",
      "AutotestAdmin000!");
  }

  @Test(priority = 3)
  @Description("Переход к регистрации заявления")
  @Severity(SeverityLevel.CRITICAL)
  public void registrationApplication() {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/a"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/ul/li[1]/a"))).click();
  }

  @Test(priority = 4)
  @Description("Очистка полей")
  @Severity(SeverityLevel.TRIVIAL)
  public void clearFieldsStep_1_NotError() {
    ClearFieldsStep_1_NotError clearFields = new ClearFieldsStep_1_NotError(driver, wait);
    clearFields.clearFieldsStep_1_NotError();
  }

  @Test(priority = 5)
  @Description("Шаг 1й - Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_1() throws InterruptedException {
    // Клик по кнопке далее
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"msform\"]/div[12]/div/div/div/button")))
      .click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «Фамилия».",
      "Необходимо заполнить «Имя».",
      "Необходимо заполнить «Дата рождения».",
      "Необходимо заполнить «Пол».",
      "Необходимо заполнить «Место рождения».",
      "Необходимо заполнить «Адрес регистрации».",
      "Необходимо заполнить «Индекс».",
      "Необходимо заполнить «СНИЛС»."
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 6)
  @Description("Шаг 1 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_1() {
    MainStep_1 step_1 = new MainStep_1(
      driver,
      expectedApplicantLastName,
      expectedApplicantName,
      expectedApplicantSurname,
      expectedApplicantBirthDate,
      expectedApplicantGender,
      expectedApplicantEmail,
      expectedApplicantBirthPlace,
      expectedApplicantAddress,
      expectedApplicantIndex,
      TestDataForRegistration.getExpectedApplicantSnils(),
      expectedApplicantPhone
    );
    step_1.step_1();
  }

  @Test(priority = 7)
  @Description("Шаг 2й - Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_2() throws InterruptedException {
    // Клик по кнопке далее
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"msform\"]/fieldset/div[7]/div[2]/button")))
      .click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «Тип документа».",
      "Необходимо заполнить «Номер».",
      "Необходимо заполнить «Кем выдан».",
      "Необходимо заполнить «Дата выдачи».",
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }

    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"msform\"]/fieldset/div[7]/div[2]/button")))
      .click();
  }

  @Test(priority = 8)
  @Description("Шаг 2 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_2() {
    MainStep_2 step_2 = new MainStep_2(
      driver,
      wait,
      expectedApplicantTypeOfDocument,
      TestDataForRegistration.getExpectedDocumentSeries(),
      TestDataForRegistration.getExpectedDocumentNumber(),
      expectedDocumentIssued,
      expectedDocumentIssueDate,
      expectedDocumentDepartmentCode
    );
    step_2.step_2();
  }

  @Test(priority = 9)
  @Description("Шаг-3 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_3() throws InterruptedException {
    // Клик по кнопке далее
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset/div[10]/div[2]/button"))).click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «Документ об образовании».",
      "Необходимо заполнить «Кем выдан».",
      "Необходимо заполнить «Номер».",
      "Необходимо заполнить «Дата выдачи».",
      "Необходимо заполнить «Отлично (кол-во)».",
      "Необходимо заполнить «Удовл. (кол-во)».",
      "Необходимо заполнить «Хорошо (кол-во)».",
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 10)
  @Description("Шаг 3 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_3() {
    MainStep_3 step_3 = new MainStep_3(
      driver,
      wait,
      expectedEducationDocumentIssued,
      expectedEducationDocumentSeries,
      expectedEducationDocumentNumber,
      expectedEducationDocumentIssueDate,
      expectedEducationDocumentNumberFives,
      expectedEducationDocumentNumberFours,
      expectedEducationDocumentNumberThrees
    );
    step_3.step_3();
  }

  @Test(priority = 11)
  @Description("Шаг-4 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_4() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[3]/div[2]/button"))).click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «Наименование организации».",
      "Необходимо заполнить «Уровень базового образования».",
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 12)
  @Description("Шаг 4 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_4() {
    MainStep_4 step_4 = new MainStep_4(
      driver,
      wait,
      expectedSPOOrganisation,
      expectedEducationLevel
    );
    step_4.step_4();
  }

  @Test(priority = 13)
  @Description("Шаг-5 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_5() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[2]/div[2]/button"))).click();

    Thread.sleep(2000);
    String[] fieldHints = { "Необходимо заполнить «Код и наименование специальности/профессии»." };
    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 14)
  @Description("Шаг 5 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_5() {
    MainStep_5 step_5 = new MainStep_5(
      driver,
      wait,
      expectedListSpecialties
    );
    step_5.step_5();
  }

  @Test(priority = 15)
  @Description("Шаг-6 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_6() throws InterruptedException {

    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(2000);

    // Клик по кнопке далее
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//form[@id='msform']//button[@type='submit']")))
      .click();

    Thread.sleep(2000);

    String[] fieldHints = { "Необходимо заполнить «Оценка»." };
    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertNotNull(pageSource);
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 16)
  @Description("Шаг 6 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_6() {
    MainStep_6 step_6 = new MainStep_6(
      driver,
      wait,
      expectedMathematicsScore,
      expectedComputerScienceScore,
      expectedPhysicsScore,
      expectedGeographyScore,
      expectedChineseScore,
      expectedLiteratureScore,
      expectedSpanishScore,
      expectedGermanScore
    );
    step_6.step_6();
  }

  @Test(priority = 17)
  @Description("Шаг-7 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_7() throws InterruptedException {
    //Справка об инвалидности
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[1]/div/div[1]/div/div/span[2]"))).click();
    // Имеется преимущественное право (льгота)
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[3]/div/div[1]/div/div/span[2]"))).click();
    // Справка 086У
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[5]/div/div[1]/div/div/span[2]")).click();
    // Имеется потребность в специальных условиях при прохождении ВИ
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[9]/div/div[1]/div/div/span[2]")).click();
    // Индивидуальные достижения
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[12]/div/div[1]/div/div/span[2]"))).click();
    // Клик далее
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[14]/div[2]/button")).click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «Номер».",
      "Необходимо заполнить «Группа инвалидности».",
      "Необходимо заполнить «Причина».",
      "Необходимо заполнить «Дата выдачи»."
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 18)
  @Description("Шаг 7 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_7() throws InterruptedException {
    // == Справка об инвалидности ==
    driver.findElement(By.id("specialconditionsform-serial")).sendKeys(expectedSpecialConditionsFormSerial);
    driver.findElement(By.id("specialconditionsform-number")).sendKeys(expectedSpecialConditionsFormNumber);
    driver.findElement(By.id("specialconditionsform-group")).sendKeys(expectedSpecialConditionsFormGroup);
    driver.findElement(By.id("specialconditionsform-reason")).sendKeys(expectedSpecialConditionsFormReason);
    driver.findElement(By.id("specialconditionsform-issued")).sendKeys(expectedSpecialConditionsFormIssued);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-issue_date")))
      .sendKeys(expectedSpecialConditionsFormIssueDate + Keys.ENTER);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-expiration_date")))
      .sendKeys(expectedSpecialConditionsFormExpirationDate + Keys.ENTER);

    // == Льгота ==
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-0-results']/li[1]")))
      .click();

    // == Справка по форме 086/у ==
    driver.findElement(By.id("specialconditionsform-reference_086u_series"))
      .sendKeys(expectedReference_086USeries);
    driver.findElement(By.id("specialconditionsform-reference_086u_number"))
      .sendKeys(expectedReference_086UNumber);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-reference_086u_creation_date"))).sendKeys(expectedReference_086UDate + Keys.ENTER);

    // Специальные условия при прохождении ВИ
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"special_condition{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .sendKeys("Для слепых" + Keys.ENTER);

    // Имеются индивидуальные достижения
    // Клик по списку
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"personal_achievement{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .click();
    // Выбор значения
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-personal_achievement-0-personal_achievement-results']/li[1]")))
      .click();

    // Оценка ИД (проверка если нет оценки)
    List<WebElement> achievementScore = driver.findElements(By.id("specialconditionsform-personal_achievement-0-personal_achievement_score"));
    if (!achievementScore.isEmpty()) {
      WebElement input = achievementScore.get(0);
      input.sendKeys(expectedIndividualAchievementsScore);
    }
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[14]/div[2]/button")).click();
  }

  @Test(priority = 19)
  @Description("Шаг-8 Данные о законном представителе")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_8() throws InterruptedException {

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[4]/div[2]/button"))).click();

    Thread.sleep(2000);

    String[] fieldHints = {
      "Необходимо заполнить «ФИО».",
      "Необходимо заполнить «Телефон»."
    };

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 20)
  @Description("Шаг 8 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_8() throws InterruptedException {
    MainStep_8 step_8 = new MainStep_8(
      driver,
      wait,
      expectedLegalRepresentativeFio,
      expectedLegalRepresentativePhone,
      expectedLegalRepresentativeEmail
    );
    step_8.step_8();
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


















