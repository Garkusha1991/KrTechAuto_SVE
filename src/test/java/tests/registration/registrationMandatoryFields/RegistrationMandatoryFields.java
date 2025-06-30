/**
 * Тест проверки обязательных полей
 * при регистрации заявления
 * Доработать проверку полей, после добавления разработчиком подсказок.
 * 1. Специальные условия
 * 2. Индивидуальные достижения
 * 3. Оценка
 */

package tests.registration.registrationMandatoryFields;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import setup.BaseRegistration;
import tests.registration.registrationClassic.steps.step_8.MainStep;

import static tests.registration.registrationClassic.steps.step_1.Locators.NEXT_BUTTON_STEP_1;
import static tests.registration.registrationClassic.steps.step_2.Locators.NEXT_BUTTON_STEP_2;
import static tests.registration.registrationClassic.steps.step_3.Locators.NEXT_BUTTON_STEP_3;
import static tests.registration.registrationClassic.steps.step_4.Locators.NEXT_BUTTON_STEP_4;
import static tests.registration.registrationClassic.steps.step_5.Locators.NEXT_BUTTON_STEP_5;
import static tests.registration.registrationClassic.steps.step_6.Locators.NEXT_BUTTON_STEP_6;
import static tests.registration.registrationClassic.steps.step_7.Locators.*;
import static tests.registration.registrationClassic.steps.step_8.Locators.NEXT_BUTTON_STEP_FINISH;

public class RegistrationMandatoryFields extends BaseRegistration {

  @Test(priority = 4)
  @Description("Шаг 1й - Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_1() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_1)).click();

    Thread.sleep(2000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_1)).click();

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

  @Test(priority = 5)
  @Description("Шаг-1")
  @Severity(SeverityLevel.CRITICAL)
  public void step_1() {
    tests.registration.registrationClassic.steps.step_1.MainStep step_1 = new tests.registration.registrationClassic.steps.step_1.MainStep(driver, wait);
    step_1.fillSteps_1();
  }

  @Test(priority = 6)
  @Description("Шаг 2й - Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_2() throws InterruptedException {
    Thread.sleep(1000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_2)).click();

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

  }

  @Test(priority = 7)
  @Description("Шаг 2 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_2() {
    tests.registration.registrationClassic.steps.step_2.MainStep step_2 = new tests.registration.registrationClassic.steps.step_2.MainStep(driver, wait);
    step_2.fillStep_2();
  }

  @Test(priority = 8)
  @Description("Шаг-3 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_3() throws InterruptedException {
    Thread.sleep(1000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_3)).click();

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
    Thread.sleep(2000);

    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 9)
  @Description("Шаг 3 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_3() {
    tests.registration.registrationClassic.steps.step_3.MainStep step_3 = new tests.registration.registrationClassic.steps.step_3.MainStep(driver, wait);
    step_3.fillStep_3();
  }

  @Test(priority = 10)
  @Description("Шаг-4 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_4() throws InterruptedException {
    Thread.sleep(2000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_4)).click();

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

  @Test(priority = 11)
  @Description("Шаг 4 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_4() {
    tests.registration.registrationClassic.steps.step_4.MainStep step_4 = new tests.registration.registrationClassic.steps.step_4.MainStep(driver, wait);
    step_4.fillStep_4();
  }

  @Test(priority = 12)
  @Description("Шаг-5 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_5() throws InterruptedException {
    Thread.sleep(2000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_5)).click();

    Thread.sleep(2000);

    String[] fieldHints = {"Необходимо заполнить «Код и наименование специальности/профессии»."};
    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 13)
  @Description("Шаг 5 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_5() {
    tests.registration.registrationClassic.steps.step_5.MainStep step_5 = new tests.registration.registrationClassic.steps.step_5.MainStep(driver, wait);
    step_5.fillStep_5();
  }

  @Test(priority = 14)
  @Description("Шаг-6 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_6() throws InterruptedException {

    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.PAGE_DOWN).perform();

    Thread.sleep(2000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_6)).click();

    Thread.sleep(2000);

    String[] fieldHints = {"Необходимо заполнить «Оценка»."};
    String pageSource = driver.getPageSource();

    for (String hint : fieldHints) {
      Assert.assertNotNull(pageSource);
      Assert.assertTrue(
        pageSource.contains(hint),
        "Ожидалась подсказка: " + hint
      );
    }
  }

  @Test(priority = 15)
  @Description("Шаг 6 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_6() {
    tests.registration.registrationClassic.steps.step_6.MainStep step_6 = new tests.registration.registrationClassic.steps.step_6.MainStep(driver, wait);
    step_6.fillStep_6();
  }

  @Test(priority = 16)
  @Description("Шаг-7 Обязательные поля")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_7() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(SELECT_SPECIAL_CONDITIONS_FORM_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(SELECT_BENEFITS)).click();
    driver.findElement(SELECT_REFERENCE_086U).click();
    driver.findElement(SPECIAL_CONDITIONS).click();
    wait.until(ExpectedConditions.elementToBeClickable(ADD_INDIVIDUAL_ACHIEVEMENTS)).click();

    Thread.sleep(2000);

    driver.findElement(NEXT_BUTTON_STEP_7).click();

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

  @Test(priority = 17)
  @Description("Шаг 7 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_7() throws InterruptedException {
    tests.registration.registrationClassic.steps.step_7.MainStep step_7 = new tests.registration.registrationClassic.steps.step_7.MainStep(driver, wait);

    step_7.methodsStep_7.fillSpecialConditionsFormSerial(data.step_7.disabilityCertificate.series);
    step_7.methodsStep_7.fillSpecialConditionsFormNumber(data.step_7.disabilityCertificate.number);
    step_7.methodsStep_7.fillSpecialConditionsFormGroup(data.step_7.disabilityCertificate.group);
    step_7.methodsStep_7.fillSpecialConditionsFormReason(data.step_7.disabilityCertificate.reason);
    step_7.methodsStep_7.fillSpecialConditionsFormIssued(data.step_7.disabilityCertificate.issued);
    step_7.methodsStep_7.fillSpecialConditionsFormIssueDate(data.step_7.disabilityCertificate.issueDate);
    step_7.methodsStep_7.fillSpecialConditionsFormExpirationDate(data.step_7.disabilityCertificate.expirationDate);

    step_7.methodsStep_7.fillBenefit_1();
    step_7.methodsStep_7.fillBenefit_2();
    step_7.methodsStep_7.fillBenefit_3();
    step_7.methodsStep_7.fillBenefit_4();
    step_7.methodsStep_7.fillBenefit_5();
    step_7.methodsStep_7.fillBenefit_6();
    step_7.methodsStep_7.fillBenefit_7();
    step_7.methodsStep_7.fillBenefit_8();
    step_7.methodsStep_7.fillBenefit_9();
    step_7.methodsStep_7.fillBenefit_10();

    step_7.methodsStep_7.fillReferenceSeries(data.step_7.reference086u.o86uSeries);
    step_7.methodsStep_7.fillReferenceNumber(data.step_7.reference086u.o86uNumber);
    step_7.methodsStep_7.fillReferenceDate(data.step_7.reference086u.o86uDate);

    step_7.methodsStep_7.addExtendedMedicalCertificate();

    step_7.methodsStep_7.addConclusion_PMPK();

    step_7.methodsStep_7.fillSpecialConditions_1();
    step_7.methodsStep_7.fillSpecialConditions_2();
    step_7.methodsStep_7.fillSpecialConditions_3();
    step_7.methodsStep_7.fillSpecialConditions_4();
    step_7.methodsStep_7.fillSpecialConditions_5();
    step_7.methodsStep_7.fillSpecialConditions_6();

    step_7.methodsStep_7.fillIndividualAchievement_1();
    step_7.methodsStep_7.fillIndividualAchievement_1_score(data.step_7.individualAchievements.score_1);

    step_7.methodsStep_7.clickNext();
  }

  @Test(priority = 18)
  @Description("Шаг-8 Данные о законном представителе")
  @Severity(SeverityLevel.CRITICAL)
  public void hintsOnStep_8() throws InterruptedException {
    Thread.sleep(2000);

    wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_STEP_FINISH)).click();

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

  @Test(priority = 19)
  @Description("Шаг 8 - Выполнение")
  @Severity(SeverityLevel.CRITICAL)
  public void step_8() throws InterruptedException {
    MainStep step_8 = new MainStep(driver, wait);
    step_8.fillStep_8();
  }
}
