package tests.checkDuplicate.statement;

import data.data_popUp.PopUpMessages;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseRegistration;
import tests.registration.registrationClassic.steps.step_1.MethodsStep_1;
import tests.registration.registrationClassic.steps.step_2.MethodsStep_2;
import tests.registration.registrationClassic.steps.step_8.Main;
import utils.ClearFieldsStep_1;

import utils.PopUpUtils;
import utils.random.GenerateRandomNumber;
import utils.random.GenerateRandomSeries;
import utils.random.GenerateRandomSnils;

import static tests.registration.registrationClassic.steps.step_1.Locators.APPLICANT_SNILS;
import static tests.registration.registrationClassic.steps.step_2.Locators.ocators.DOCUMENT_NUMBER;
import static tests.registration.registrationClassic.steps.step_2.Locators.DOCUMENT_SERIES;

public class CheckDuplicateStatement extends BaseRegistration {

  public static final String snils = GenerateRandomSnils.generateRandomSnils();
  public static final String series = GenerateRandomSeries.generateRandomSeries();
  public static final String number = GenerateRandomNumber.generateRandomNumber();

  @Test(priority = 3)
  @Description("Очистка полей")
  @Severity(SeverityLevel.TRIVIAL)
  public void clearFields() {
    ClearFieldsStep_1 clearFields = new ClearFieldsStep_1(driver, wait);
    clearFields.clearFieldsStep_1();
  }

  @Test(priority = 4)
  @Description("Шаг-1")
  @Severity(SeverityLevel.CRITICAL)
  public void step_1() {
    MethodsStep_1 methodsStep_1 = new MethodsStep_1(driver,wait);

    methodsStep_1.fillApplicantLastname(data.step_1.lastName);
    methodsStep_1.fillApplicantName(data.step_1.name);
    methodsStep_1.fillApplicantPatronymic(data.step_1.patronymic);
    methodsStep_1.fillApplicantBirthdate(data.step_1.birthDate);
    methodsStep_1.fillApplicantGender();
    methodsStep_1.fillApplicantBirthPlace(data.step_1.birthPlace);
    methodsStep_1.fillApplicantBirthAddress(data.step_1.address);
    methodsStep_1.fillApplicantIndex(data.step_1.index);
    driver.findElement(APPLICANT_SNILS).sendKeys(CheckDuplicateStatement.snils);
    methodsStep_1.fillApplicantPhone(data.step_1.phone);
    methodsStep_1.clickNext();
  }

  @Test(priority = 5)
  @Description("Шаг-2 Тип документа")
  @Severity(SeverityLevel.CRITICAL)
  public void step_2() {
    MethodsStep_2 methodsStep_2 = new MethodsStep_2(driver,wait);
    methodsStep_2.fillTypeOfDocument();
    wait.until(ExpectedConditions.elementToBeClickable(DOCUMENT_SERIES)).sendKeys(CheckDuplicateStatement.series);
    wait.until(ExpectedConditions.elementToBeClickable(DOCUMENT_NUMBER)).sendKeys(CheckDuplicateStatement.number);
    methodsStep_2.fillDocumentIssued(data.step_2.documentIssued);
    methodsStep_2.fillDocumentIssueDate(data.step_2.documentIssueDate + Keys.ENTER);
    methodsStep_2.fillDocumentDepartmentCode(data.step_2.documentDepartmentCode);
    methodsStep_2.clickNext();
  }

  @Test(priority = 6)
  @Description("Шаг-3 Документ об образовании")
  @Severity(SeverityLevel.CRITICAL)
  public void step_3() {
    tests.registration.registrationClassic.steps.step_3.Main step_3 = new tests.registration.registrationClassic.steps.step_3.Main(driver, wait);
    step_3.fillStep_3();
  }

  @Test(priority = 7)
  @Description("Шаг-4 Параметры специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void step_4() {
    tests.registration.registrationClassic.steps.step_4.Main step_4 = new tests.registration.registrationClassic.steps.step_4.Main(driver, wait);
    step_4.fillStep_4();
  }

  @Test(priority = 8)
  @Description("Шаг-5")
  @Severity(SeverityLevel.CRITICAL)
  public void step_5() {
    tests.registration.registrationClassic.steps.step_5.Main step_5 = new tests.registration.registrationClassic.steps.step_5.Main(driver, wait);
    step_5.fillStep_5();
  }

  @Test(priority = 9)
  @Description("Шаг-6 Специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void step_6() {
    tests.registration.registrationClassic.steps.step_6.Main step_6 = new tests.registration.registrationClassic.steps.step_6.Main(driver, wait);
    step_6.fillStep_6();
  }

  @Test(priority = 10)
  @Description("Шаг-7 Особые условия при поступлении")
  @Severity(SeverityLevel.CRITICAL)
  public void step_7() {
    tests.registration.registrationClassic.steps.step_7.Main step_7 = new tests.registration.registrationClassic.steps.step_7.Main(driver, wait);
    step_7.fillStep_7();
  }

  @Test(priority = 11)
  @Description("Шаг-8 Данные о законном представителе")
  @Severity(SeverityLevel.CRITICAL)
  public void step_8() {
    Main step_8 = new Main(driver, wait);
    step_8.fillStep_8();
  }

  @Test(priority = 12)
  @Description("Проверка на всплывающий popUp")
  @Severity(SeverityLevel.CRITICAL)
  public void popUp() throws InterruptedException {
    PopUpUtils popUpUtils = new PopUpUtils(driver,wait);
    popUpUtils.assertPopUpContainsText(PopUpMessages.STATEMENT_CREATED);

    Thread.sleep(5000);
  }

  @Test(priority = 13)
  @Description("Переход к регистрации заявления")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateRegistrationApplication() {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/a"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside[1]/div/nav/ul/li[3]/ul/li[1]/a"))).click();
  }

  @Test(priority = 14)
  @Description("Дубликат Шаг-1")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateStep_1() {
    MethodsStep_1 methodsStep_1 = new MethodsStep_1(driver,wait);

    methodsStep_1.fillApplicantLastname(data.step_1.lastName);
    methodsStep_1.fillApplicantName(data.step_1.name);
    methodsStep_1.fillApplicantPatronymic(data.step_1.patronymic);
    methodsStep_1.fillApplicantBirthdate(data.step_1.birthDate);
    methodsStep_1.fillApplicantGender();
    methodsStep_1.fillApplicantBirthPlace(data.step_1.birthPlace);
    methodsStep_1.fillApplicantBirthAddress(data.step_1.address);
    methodsStep_1.fillApplicantIndex(data.step_1.index);
    driver.findElement(APPLICANT_SNILS).sendKeys(CheckDuplicateStatement.snils);
    methodsStep_1.fillApplicantPhone(data.step_1.phone);
    methodsStep_1.clickNext();
  }

  @Test(priority = 15)
  @Description("Дубликат Шаг-2 Тип документа")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateStep_2() {
    MethodsStep_2 methodsStep_2 = new MethodsStep_2(driver,wait);
    methodsStep_2.fillTypeOfDocument();
    wait.until(ExpectedConditions.elementToBeClickable(DOCUMENT_SERIES)).sendKeys(CheckDuplicateStatement.series);
    wait.until(ExpectedConditions.elementToBeClickable(DOCUMENT_NUMBER)).sendKeys(CheckDuplicateStatement.number);
    methodsStep_2.fillDocumentIssued(data.step_2.documentIssued);
    methodsStep_2.fillDocumentIssueDate(data.step_2.documentIssueDate);
    methodsStep_2.fillDocumentDepartmentCode(data.step_2.documentDepartmentCode);
    methodsStep_2.clickNext();
  }

  @Test(priority = 16)
  @Description("Дубликат Шаг-3 Документ об образовании")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateStep_3() {
    tests.registration.registrationClassic.steps.step_3.Main step_3 = new tests.registration.registrationClassic.steps.step_3.Main(driver, wait);
    step_3.fillStep_3();
  }

  @Test(priority = 17)
  @Description("Дубликат Шаг-4 Параметры специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateStep_4() {
    tests.registration.registrationClassic.steps.step_4.Main step_4 = new tests.registration.registrationClassic.steps.step_4.Main(driver, wait);
    step_4.fillStep_4();
  }

  @Test(priority = 18)
  @Description("Дубликат Шаг-5")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicateStep_5() {
    tests.registration.registrationClassic.steps.step_5.Main step_5 = new tests.registration.registrationClassic.steps.step_5.Main(driver, wait);
    step_5.fillStep_5();
  }

  @Test(priority = 19)
  @Description("Проверка дубликата")
  @Severity(SeverityLevel.CRITICAL)
  public void duplicate() throws InterruptedException {
    String hint = "Найдено ранее поданное заявление на выбранную специальность. Вы можете перейти к дубликату для просмотра";

    WebElement hintElement =
      wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//div[@class='help-block help-block-error' and contains(text(), 'Найдено ранее поданное заявление')]")
      ));

    Assert.assertTrue(hintElement.getText().contains(hint), "Ожидалась подсказка: " + hint);
  }
}
