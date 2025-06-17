  /**
   * (Добавить в Intellij Idea Плагин - TestNG)
   * Позитивный тест регистрации заявления
   * Проходится по всем полям.
   * Добавить логин и пароль в на строки 65-66 в "@Test - Авторизация"
   */

  package smoke.test.Registration;

  import io.qameta.allure.Severity;
  import io.qameta.allure.SeverityLevel;
  import jdk.jfr.Description;
  import org.openqa.selenium.By;
  import org.openqa.selenium.support.ui.ExpectedConditions;
  import org.openqa.selenium.support.ui.WebDriverWait;
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
  import static smoke.test.Registration.Data.TestDataForRegistration.*;

  public class RegistrationClassic {

    org.openqa.selenium.WebDriver driver;
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
    @Severity(SeverityLevel.CRITICAL)
    public void clearFields() {
      ClearFieldsStep_1_NotError clearFields = new ClearFieldsStep_1_NotError(driver, wait);
      clearFields.clearFieldsStep_1_NotError();
    }

    @Test(priority = 5)
    @Description("Шаг-1")
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

    @Test(priority = 6)
    @Description("Шаг-2 Тип документа")
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

    @Test(priority = 7)
    @Description("Шаг-3 Документ об образовании")
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

    @Test(priority = 8)
    @Description("Шаг-4 Параметры специальности")
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

    @Test(priority = 9)
    @Description("Шаг-5")
    @Severity(SeverityLevel.CRITICAL)
    public void step_5() {
      MainStep_5 step_5 = new MainStep_5(
        driver,
        wait,
        expectedListSpecialties
      );
      step_5.step_5();
    }

    @Test(priority = 10)
    @Description("Шаг-6 Специальности")
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

    @Test(priority = 11)
    @Description("Шаг-7 Особые условия при поступлении")
    @Severity(SeverityLevel.CRITICAL)
    public void step_7() throws InterruptedException {
      MainStep_7 step_7 = new MainStep_7(
        driver,
        wait,
        expectedSpecialConditionsFormSerial,
        expectedSpecialConditionsFormNumber,
        expectedSpecialConditionsFormGroup,
        expectedSpecialConditionsFormReason,
        expectedSpecialConditionsFormIssued,
        expectedSpecialConditionsFormIssueDate,
        expectedSpecialConditionsFormExpirationDate,
        expectedBenefit_1,
        expectedBenefit_2,
        expectedBenefit_3,
        expectedBenefit_4,
        expectedBenefit_5,
        expectedBenefit_6,
        expectedBenefit_7,
        expectedBenefit_8,
        expectedBenefit_9,
        expectedBenefit_10,
        expectedReference_086USeries,
        expectedReference_086UNumber,
        expectedReference_086UDate,
        expectedIndividualAchievementsScore
      );
      step_7.step_7();
    }

    @Test(priority = 12)
    @Description("Шаг-8 Данные о законном представителе")
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

