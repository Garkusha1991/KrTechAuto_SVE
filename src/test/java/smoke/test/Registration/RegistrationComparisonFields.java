/**
 * Тест сравнения полей при заполнении регистрации
 * с полями внутри заявления
 */

package smoke.test.Registration;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

import static smoke.test.Registration.Data.TestDataForRegistration.*;
import static utils.GradeCalculator.GradeGenerator;

public class RegistrationComparisonFields {
  WebDriver driver;
  WebDriverWait wait;

  public static String snilsUsedInStep1;
  private String snils;

  public static String documentNumberUsedInStep2;
  private String number;

  public static String documentSeriesUsedInStep2;
  private String series;

  @BeforeClass
  public final void beforeClass() {
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
    this.snils = TestDataForRegistration.getExpectedApplicantSnils();
    snilsUsedInStep1 = this.snils;
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
      this.snils,
      expectedApplicantPhone
    );
    step_1.step_1();
  }

  @Test(priority = 6)
  @Description("Шаг-2 Тип документа")
  @Severity(SeverityLevel.CRITICAL)
  public void step_2() {
    this.series = TestDataForRegistration.getExpectedDocumentSeries();
    documentSeriesUsedInStep2 = this.series;

    this.number = TestDataForRegistration.getExpectedDocumentNumber();
    documentNumberUsedInStep2 = this.number;

    MainStep_2 step_2 = new MainStep_2(
      driver,
      wait,
      expectedApplicantTypeOfDocument,
      this.series,
      this.number,
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

  @Test(priority = 13)
  @Description("Проверка соответствия полей шага - 1")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_1() throws InterruptedException {
    Thread.sleep(5000);

    // Корректность отображения поля - Фамилия
    WebElement ApplicantLastName = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[1]/td/div[1]"));
    String actualApplicantLastName = ApplicantLastName.getText();
    Assert.assertEquals(actualApplicantLastName, expectedApplicantLastName, "Фамилия - введена неверно");

    // Корректность отображения поля - Имя
    WebElement ApplicantName = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[2]/td/div[1]"));
    String actualApplicantName = ApplicantName.getText();
    Assert.assertEquals(actualApplicantName, expectedApplicantName, "Имя - введено неверно");

    // Корректность отображения поля - Отчество
    WebElement ApplicantSurname = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[3]/td/div[1]"));
    String actualApplicantSurname = ApplicantSurname.getText();
    Assert.assertEquals(actualApplicantSurname, expectedApplicantSurname, "Отчество - введено неверно");

    // Корректность отображения поля - Дата рождения
    WebElement ApplicantBirthDate = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[5]/td/div[1]"));
    String actualApplicantBirthDate = ApplicantBirthDate.getText();
    Assert.assertEquals(actualApplicantBirthDate, expectedApplicantBirthDate, "Дата рождения - введена неверно");

    // Корректность отображения поля - Пол
    WebElement ApplicantGender = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[4]/td/div[1]"));
    String actualApplicantGender = ApplicantGender.getText();
    Assert.assertEquals(actualApplicantGender, expectedApplicantGender, "Пол - введено неверно");

    // Корректность отображения поля - Место рождения
    WebElement ApplicantBirthPlace = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[6]/td/div[1]"));
    String actualBirthPlace = ApplicantBirthPlace.getText();
    Assert.assertEquals(actualBirthPlace, expectedApplicantBirthPlace, "Место рождения - введено неверно");

    // Корректность отображения поля - Индекс
    WebElement ApplicantIndex = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[7]/td/div[1]"));
    String actualApplicantIndex = ApplicantIndex.getText();
    Assert.assertEquals(actualApplicantIndex, expectedApplicantIndex, "Индекс - введено неверно");

    // Корректность отображения поля - Адрес регистрации
    WebElement ApplicantAddress = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[8]/td/div[1]"));
    String actualApplicantAddress = ApplicantAddress.getText();
    Assert.assertEquals(actualApplicantAddress, expectedApplicantAddress, "Адрес регистрации - введено неверно");

    // Корректность отображения поля - СНИЛС
    WebElement ApplicantSnils = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[9]/td/div[1]"));
    String actualApplicantSnils = ApplicantSnils.getText();
    Assert.assertEquals(actualApplicantSnils, snilsUsedInStep1, "Снилс - введено неверно");

    // Корректность отображения поля - E-mail
    WebElement ApplicantEmail = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[10]/td/div[1]"));
    String actualApplicantEmail = ApplicantEmail.getText();
    Assert.assertEquals(actualApplicantEmail, expectedApplicantEmail, "email - введено неверно");

    // Корректность отображения поля - Телефон
    WebElement ApplicantPhone = driver.findElement(By.xpath("//*[@id=\"w2\"]/tbody/tr[11]/td/div[1]"));
    String actualApplicantPhone = ApplicantPhone.getText();
    Assert.assertEquals(actualApplicantPhone, "+7 " + expectedApplicantPhone, "Телефон - введено неверно");
  }

  @Test(priority = 14)
  @Description("Проверка соответсвия полей шага 2")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_2() {
    // Корректность отображения поля - Тип документа
    WebElement ApplicantTypeOfDocument = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[1]"));
    String actualApplicantTypeOfDocument = ApplicantTypeOfDocument.getText();
    Assert.assertEquals(actualApplicantTypeOfDocument, expectedApplicantTypeOfDocument, "Поле 'Тип документа' - введено неверно");

    // Корректность отображения поля - Серия
    WebElement ApplicantDocumentSeries = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[2]"));
    String actualDocumentSeries = ApplicantDocumentSeries.getText();
    Assert.assertEquals(actualDocumentSeries, documentSeriesUsedInStep2, "Поле 'Серия документа' - введено неверно");

    // Корректность отображения поля - Номер
    WebElement ApplicantDocumentNumber = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[3]"));
    String actualApplicantDocumentNumber = ApplicantDocumentNumber.getText();
    Assert.assertEquals(actualApplicantDocumentNumber, documentNumberUsedInStep2, "Поле 'Номер документа' - введено неверно");

    // Корректность отображения поля - Кем выдан
    WebElement ApplicantDocumentIssued = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[4]"));
    String actualApplicantDocumentIssued = ApplicantDocumentIssued.getText();
    Assert.assertEquals(actualApplicantDocumentIssued, expectedDocumentIssued, "Поле 'Кем выдан' - введено неверно");

    // Корректность отображения поля - Дата выдачи
    WebElement ApplicantDocumentIssueDate = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[5]"));
    String actualApplicantDocumentIssueDate = ApplicantDocumentIssueDate.getText();
    Assert.assertEquals(actualApplicantDocumentIssueDate, expectedDocumentIssueDate, "Поле 'Дата выдачи' - введено неверно");

    // Корректность отображения поля - Код подразделения
    WebElement ApplicantDocumentDepartmentCode = driver.findElement(By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[6]"));
    String actualApplicantDocumentDepartmentCode = ApplicantDocumentDepartmentCode.getText();
    Assert.assertEquals(actualApplicantDocumentDepartmentCode, expectedDocumentDepartmentCode, "Поле 'Код подразделения' - введено неверно");
  }

  @Test(priority = 15)
  @Description("Проверка соответсвия полей шага 3")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_3() throws InterruptedException {
    // Переход во вкладку "Заявление"
    driver.findElement(By.id("custom-content-above-view-application-tab")).click();

    Thread.sleep(2000);

    // Кем выдан
    WebElement EducationDocumentIssued =
      driver.findElement(By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[4]"));
    String actualEducationDocumentIssued = EducationDocumentIssued.getText();
    Assert.assertEquals(actualEducationDocumentIssued, expectedEducationDocumentIssued, "Ошибка соответствия - Документ об образовани -поле: 'Кем выдан'");

    // Серия документа
    WebElement EducationDocumentSeries =
      driver.findElement(By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[2]"));
    String actualEducationDocumentSeries = EducationDocumentSeries.getText();
    Assert.assertEquals(actualEducationDocumentSeries, expectedEducationDocumentSeries, "Ошибка соответствия - Документ об образовани -поле:'Серия'");

    // Номер документа
    WebElement EducationDocumentNumber =
      driver.findElement(By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[3]"));
    String actualEducationDocumentNumber = EducationDocumentNumber.getText();
    Assert.assertEquals(actualEducationDocumentNumber, expectedEducationDocumentNumber, "Ошибка соответствия - Документ об образовани -поле:'Номер документа'");

    // Дата выдачи
    WebElement EducationDocumentIssueDate =
      driver.findElement(By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[10]"));
    String actualEducationDocumentIssueDate = EducationDocumentIssueDate.getText();
    Assert.assertEquals(actualEducationDocumentIssueDate, expectedEducationDocumentIssueDate, "Ошибка соответствия - Документ об образовани -поле: 'Дата выдачи'");

    // -- С отличием - не реализована проверка т.к. неизвестно, как сделать проверку по картинке

    // Получение СПО впервые
    WebElement ReceivingDocumentFirst = driver.findElement(By.xpath("//*[@id=\"w7\"]/tbody/tr[5]/td/div[1]"));
    String actualReceivingDocumentFirst = ReceivingDocumentFirst.getText();
    Assert.assertEquals(actualReceivingDocumentFirst, "Да", "Ошибка соответствия - Документ об образовани -поле: 'Получение СПО впервые'");

    // Оценка (Средний балл)
    WebElement AverageScore = driver.findElement(By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[8]"));
    String actualAverageScore = AverageScore.getText();
    // Вычисление среднего балла
    String expectedAverageScore = (GradeGenerator());
    Assert.assertEquals(actualAverageScore, expectedAverageScore, "Ошибка соответствия - Документ об образовани -поле: 'средний балл не соответствует'");
  }

  @Test(priority = 16)
  @Description("Проверка соответсвия полей шага 4")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_4() throws InterruptedException {
    // Переход по вкладке "Информация об учреждении СПО и специальностях"
    WebElement TabInfoSVE = driver.findElement(By.id("custom-content-above-view-statement-tab"));
    TabInfoSVE.click();

    Thread.sleep(2000);

    // Наименование организации
    WebElement OrganizationSVE = driver.findElement(By.xpath("//*[@id=\"w11\"]/tbody/tr[1]/td/div[1]"));
    String actualOrganizationSVE = OrganizationSVE.getText();
    Assert.assertEquals(actualOrganizationSVE, expectedSPOOrganisation, "Ошибка соответствия - Параметры специальности -поле: 'Наименование организации'");

    // Уровень базового образования
    WebElement EducationLevel = driver.findElement(By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[5]"));
    String actualEducationLevel = EducationLevel.getText();
    Assert.assertEquals(actualEducationLevel, expectedEducationLevel, "Ошибка соответствия - Параметры специальности - поле: 'Наименование организации'");
  }

  @Test(priority = 17)
  @Description("Проверка соответсвия полей шага 5")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_5() {
    // Код и наименование специальностей
    WebElement ListSpecialties = driver.findElement(By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[2]"));
    String actualListSpecialties = ListSpecialties.getText();
    Assert.assertEquals(actualListSpecialties, expectedListSpecialties, "Ошибка соответствия - Специальности - поле: 'Список специальностей/профессий'");

    // Оригинал документа  - не реализована проверка т.к. неизвестно как проверять по картинке
  }

  @Test(priority = 18)
  @Description("Проверка соответсвия полей шага 6")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_6() {
    // Раскрытие списка специальностей
    driver.findElement(By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[1]/div/div[1]/span")).click();

    // Оценка первое поле - Математика
    WebElement MathematicScore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[1]/td[3]")));
    String actualMathematicScore = MathematicScore.getText();
    Assert.assertEquals(actualMathematicScore, expectedMathematicsScore, "Ошибка соответствия - Оценки по специальности - поле: 'Математика'");

    // Оценка второе поле - Информатика
    WebElement ComputerScienceScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[2]/td[3]"));
    String actualComputerScienceScore = ComputerScienceScore.getText();
    Assert.assertEquals(actualComputerScienceScore, expectedComputerScienceScore, "Ошибка соответствия - Оценки по специальности - поле: 'Информатика'");

    // Оценка третье поле - Физика
    WebElement PhysicsScoreScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[3]/td[3]"));
    String actualPhysicsScoreScore = PhysicsScoreScore.getText();
    Assert.assertEquals(actualPhysicsScoreScore, expectedPhysicsScore, "Ошибка соответствия - Оценки по специальности - поле: 'Физика'");

    // Оценка четвёртое поле - География
    WebElement GeographyScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[4]/td[3]"));
    String actualGeographyScore = GeographyScore.getText();
    Assert.assertEquals(actualGeographyScore, expectedGeographyScore, "Ошибка соответствия - Оценки по специальности - поле: 'География'");

    // Оценка пятое поле - Китайский язык
    WebElement ChineseScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[5]/td[3]"));
    String actualChineseScore = ChineseScore.getText();
    Assert.assertEquals(actualChineseScore, expectedChineseScore, "Ошибка соответствия - Оценки по специальности - поле: 'Китайский язык'");

    // Оценка шестое поле - Литература
    WebElement LiteratureScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[6]/td[3]"));
    String actualLiteratureScore = LiteratureScore.getText();
    Assert.assertEquals(actualLiteratureScore, expectedLiteratureScore, "Ошибка соответствия - Оценки по специальности - поле: 'Литература'");

    // Оценка Седьмое поле - Испанский язык
    WebElement SpanishScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[7]/td[3]"));
    String actualSpanishScore = SpanishScore.getText();
    Assert.assertEquals(actualSpanishScore, expectedSpanishScore, "Ошибка соответствия - Оценки по специальности - поле: 'Испанский язык'");

    // Оценка Восьмое поле - Немецкий язык
    WebElement GermanScore = driver.findElement(By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[8]/td[3]"));
    String actualGermanScore = GermanScore.getText();
    Assert.assertEquals(actualGermanScore, expectedGermanScore, "Ошибка соответствия - Оценки по специальности - поле: 'Немецкий язык'");
  }

  @Test(priority = 19)
  @Description("Проверка соответсвия полей шага 7")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_7() throws InterruptedException {
    // Переход по вкладке  Документ, подтверждающий инвалидность
    driver.findElement(By.id("custom-content-above-view-certificate-disability-tab")).click();
    Thread.sleep(3000);
    // =============== Справка об инвалидности ===========
    // Серия
    WebElement SpecialConditionsFormSerial = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[1]"));
    String actualSpecialConditionsFormSerial = SpecialConditionsFormSerial.getText();
    Assert.assertEquals(actualSpecialConditionsFormSerial, expectedSpecialConditionsFormSerial, "Ошибка соответствия - Справка об инвалидности - поле: 'Серия'");
    // Номер
    WebElement SpecialConditionsFormNumber = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[2]"));
    String actualSpecialConditionsFormNumber = SpecialConditionsFormNumber.getText();
    Assert.assertEquals(actualSpecialConditionsFormNumber, expectedSpecialConditionsFormNumber, "Ошибка соответствия - Справка об инвалидности - поле: 'Номер'");
    // Группа инвалидности
    WebElement SpecialSpecialConditionsFormGroup = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[3]"));
    String actualSpecialConditionsFormGroup = SpecialSpecialConditionsFormGroup.getText();
    Assert.assertEquals(actualSpecialConditionsFormGroup, expectedSpecialConditionsFormGroup, "Ошибка соответствия - Справка об инвалидности - поле: 'Группа инвалидности'");
    // Причина
    WebElement SpecialConditionsFormReason = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[4]"));
    String actualSpecialConditionsFormReason = SpecialConditionsFormReason.getText();
    Assert.assertEquals(actualSpecialConditionsFormReason, expectedSpecialConditionsFormReason, "Ошибка соответствия - Справка об инвалидности - поле: 'Причина'");
    // Наименование организации
    WebElement SpecialConditionsDFormIssued = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[6]"));
    String actualSpecialConditionsDFormIssued = SpecialConditionsDFormIssued.getText();
    Assert.assertEquals(actualSpecialConditionsDFormIssued, expectedSpecialConditionsFormIssued, "Ошибка соответствия - Справка об инвалидности - поле: 'Наименование организации'");
    // Дата выдачи
    WebElement SpecialConditionsFormDateStart = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[5]"));
    String actualSpecialConditionsFormDateStart = SpecialConditionsFormDateStart.getText();
    Assert.assertEquals(actualSpecialConditionsFormDateStart, expectedSpecialConditionsFormIssueDate, "Ошибка соответствия - Справка об инвалидности - поле: 'дата выдачи'");
    // Дата окончания срока действия
    WebElement SpecialConditionsFormExpirationDate = driver.findElement(By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[7]"));
    String actualSpecialConditionsFormExpirationDate = SpecialConditionsFormExpirationDate.getText();
    Assert.assertEquals(actualSpecialConditionsFormExpirationDate, expectedSpecialConditionsFormExpirationDate, "Ошибка соответствия - Справка об инвалидности - поле: 'дата окончания'");

    // ==================Имеется преимущественное право (льгота) ================
    // Переход к табу "Документ, подтверждающий инвалидность
    wait.until(ExpectedConditions.elementToBeClickable(By.id("custom-content-above-view-benefits-tab"))).click();

    // #1 Льгота
    WebElement Benefit_1 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[1]/td[1]")));
    String actualBenefit_1 = Benefit_1.getText();
    Assert.assertEquals(actualBenefit_1, expectedBenefit_1, "Ошибка соответствия - Льгота - поле: 'Льгота 1'");

    // #2 Льгота
    WebElement Benefit_2 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[2]/td[1]")));
    String actualBenefit_2 = Benefit_2.getText();
    Assert.assertEquals(actualBenefit_2, expectedBenefit_2, "Ошибка соответствия - Льгота - поле: 'Льгота 2'");

    // #3 Льгота
    WebElement Benefit_3 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[3]/td[1]")));
    String actualBenefit_3 = Benefit_3.getText();
    Assert.assertEquals(actualBenefit_3, expectedBenefit_3, "Ошибка соответствия - Льгота - поле: 'Льгота 3'");

    // #4 Льгота
    WebElement Benefit_4 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[4]/td[1]")));
    String actualBenefit_4 = Benefit_4.getText();
    Assert.assertEquals(actualBenefit_4, expectedBenefit_4, "Ошибка соответствия - Льгота - поле: 'Льгота 4'");

    // #5 Льгота
    WebElement Benefit_5 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[5]/td[1]")));
    String actualBenefit_5 = Benefit_5.getText();
    Assert.assertEquals(actualBenefit_5, expectedBenefit_5, "Ошибка соответствия - Льгота - поле: 'Льгота 5'");

    // #6 Льгота
    WebElement Benefit_6 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[6]/td[1]")));
    String actualBenefit_6 = Benefit_6.getText();
    Assert.assertEquals(actualBenefit_6, expectedBenefit_6, "Ошибка соответствия - Льгота - поле: 'Льгота 6'");

    // #7 Льгота
    WebElement Benefit_7 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[7]/td[1]")));
    String actualBenefit_7 = Benefit_7.getText();
    Assert.assertEquals(actualBenefit_7, expectedBenefit_7, "Ошибка соответствия - Льгота - поле: 'Льгота 7'");

    // #8 Льгота
    WebElement Benefit_8 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[8]/td[1]")));
    String actualBenefit_8 = Benefit_8.getText();
    Assert.assertEquals(actualBenefit_8, expectedBenefit_8, "Ошибка соответствия - Льгота - поле: 'Льгота 8'");

    // #9 Льгота
    WebElement Benefit_9 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[9]/td[1]")));
    String actualBenefit_9 = Benefit_9.getText();
    Assert.assertEquals(actualBenefit_9, expectedBenefit_9, "Ошибка соответствия - Льгота - поле: 'Льгота 9'");

    // #10 Льгота
    WebElement Benefit_10 = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[10]/td[1]")));
    String actualBenefit_10 = Benefit_10.getText();
    Assert.assertEquals(actualBenefit_10, expectedBenefit_10, "Ошибка соответствия - Льгота - поле: 'Льгота 10'");

    // ==  Справка 086У ==
    // Переход на вкладку "Информация об учреждении СПО"
    driver.findElement(By.id("custom-content-above-view-statement-tab")).click();
    // Серия
    WebElement Reference_086USeries = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[2]")));
    String actualReference_086USeries = Reference_086USeries.getText();
    Assert.assertEquals(actualReference_086USeries, expectedReference_086USeries, "Ошибка соответствия - Справка 086У - поле: 'Серия'");

    // Номер
    WebElement Reference_086UNumber =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[3]")));
    String actualReference_086UNumber = Reference_086UNumber.getText();
    Assert.assertEquals(actualReference_086UNumber, expectedReference_086UNumber, "Ошибка соответствия - Справка 086У - поле: 'Номер'");

    // Дата
    WebElement Reference_086UDate = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[6]")));
    String actualReference_086UDate = Reference_086UDate.getText();
    Assert.assertEquals(actualReference_086UDate, expectedReference_086UDate + " 00:00", "Ошибка соответствия - Справка 086У - поле: 'Дата'");

    // == Специальные условия для ВИ ==
    // Переход на вкладку "Информация об СПО"
    driver.findElement(By.id("custom-content-above-view-statement-tab")).click();
    WebElement SpecialConditionsVI =
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"w11\"]/tbody/tr[2]/td/div[1]")));
    String actualSpecialConditionsVI = SpecialConditionsVI.getText();
    Assert.assertEquals(actualSpecialConditionsVI, expectedSpecialConditionsVI, "Ошибка соответствия - Специальные условия ВИ - поле: 'условия'");

    // ИД
    // Переход на вклдаку ИД
    driver.findElement(By.id("custom-content-above-view-personal-achievement-tab")).click();
    WebElement IndividualAchievements = wait.until(
      ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"personal-achievement-index-container\"]/table/tbody/tr/td[1]")));
    String actualIndividualAchievements = IndividualAchievements.getText();
    Assert.assertEquals(actualIndividualAchievements, expectedIndividualAchievements, "Ошибка соответствия - Индивидуальные достижения - поле: 'ИД'");
    // Оценка ИД
    WebElement IndividualAchievementsScore =
      driver.findElement(
        By.xpath("//*[@id=\"personal-achievement-index-container\"]/table/tbody/tr/td[2]"));
    String actualIndividualAchievementsScore = IndividualAchievementsScore.getText();
    Assert.assertEquals(actualIndividualAchievementsScore, expectedIndividualAchievementsScore, "Ошибка соответствия - Индивидуальные достижения - поле: 'Оценка'");
  }

  @Test(priority = 20)
  @Description("Проверка соответсвия полей шага 7")
  @Severity(SeverityLevel.CRITICAL)
  public void examinationStep_8() throws InterruptedException {
    // Переход на таб Родитель (Законный представитель)
    driver.findElement(By.id("custom-content-above-view-legal-representative-tab")).click();
    Thread.sleep(5000);
    // ФИО
    WebElement LegalRepresentativeFioFIO = driver.findElement(By.xpath("//*[@id=\"w23\"]/tbody/tr[1]/td/div[1]"));
    String actualFio = LegalRepresentativeFioFIO.getText();
    Assert.assertEquals(actualFio, expectedLegalRepresentativeFio, "Ошибка соответствия - Законный представитель - поле: 'ФИО'");
    // Телефон
    WebElement LegalRepresentativeFioPhone = driver.findElement(By.xpath("//*[@id=\"w23\"]/tbody/tr[2]/td/div[1]"));
    String actualLegalRepresentativeFioPhone = LegalRepresentativeFioPhone.getText();
    Assert.assertEquals(
      actualLegalRepresentativeFioPhone,
      "+7 " + expectedLegalRepresentativePhone,
      "Ошибка соответствия - Законный представитель - поле: 'Телефон'");
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




