package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.*;
import static data.ExpectedData.expectedBenefit_1;
import static data.ExpectedData.expectedBenefit_10;
import static data.ExpectedData.expectedBenefit_2;
import static data.ExpectedData.expectedBenefit_3;
import static data.ExpectedData.expectedBenefit_4;
import static data.ExpectedData.expectedBenefit_5;
import static data.ExpectedData.expectedBenefit_6;
import static data.ExpectedData.expectedBenefit_7;
import static data.ExpectedData.expectedBenefit_8;
import static data.ExpectedData.expectedBenefit_9;
import static data.ExpectedData.expectedConditions;
import static data.ExpectedData.expectedIndividualAchievements;
import static data.ExpectedData.expectedIndividualAchievementsScore_1;
import static data.ExpectedData.expectedReference_086UDate;
import static data.ExpectedData.expectedReference_086UNumber;
import static data.ExpectedData.expectedReference_086USeries;
import static data.ExpectedData.expectedSpecialConditionsFormExpirationDate;
import static data.ExpectedData.expectedSpecialConditionsFormIssueDate;
import static data.ExpectedData.expectedSpecialConditionsFormIssued;
import static data.ExpectedData.expectedSpecialConditionsFormReason;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;

public class MainAssertStep_7 extends BaseSteps {

  public MainAssertStep_7(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_7() throws InterruptedException {
    // Переход по вкладке  Документ, подтверждающий инвалидность
    driver.findElement(By.id("custom-content-above-view-certificate-disability-tab")).click();
    Thread.sleep(3000);
    // =============== Справка об инвалидности ===========
    WebElement SpecialConditionsFormSerial = driver.findElement(SPECIAL_CONDITIONS_FORM_SERIAL_FIELD);
    String actualSpecialConditionsFormSerial = SpecialConditionsFormSerial.getText();
    Assert.assertEquals(
      actualSpecialConditionsFormSerial,
      expectedSpecialConditionsFormSerial,
      "Ошибка соответствия - Справка об инвалидности - поле: 'Серия'"
    );

    WebElement SpecialConditionsFormNumber = driver.findElement(SPECIAL_CONDITIONS_FORM_NUMBER_FIELD);
    String actualSpecialConditionsFormNumber = SpecialConditionsFormNumber.getText();
    Assert.assertEquals(actualSpecialConditionsFormNumber,
      expectedSpecialConditionsFormNumber,
      "Ошибка соответствия - Справка об инвалидности - поле: 'Номер'"
    );

    WebElement SpecialSpecialConditionsFormGroup = driver.findElement(SPECIAL_CONDITIONS_FORM_GROUP_FIELD);
    String actualSpecialConditionsFormGroup = SpecialSpecialConditionsFormGroup.getText();
    Assert.assertEquals(
      actualSpecialConditionsFormGroup,
      expectedSpecialConditionsFormGroup,
      "Ошибка соответствия - Справка об инвалидности - поле: 'Группа инвалидности'"
    );

    WebElement SpecialConditionsFormReason = driver.findElement(SPECIAL_CONDITIONS_FORM_REASON_FIELD);
    String actualSpecialConditionsFormReason = SpecialConditionsFormReason.getText();
    Assert.assertEquals(
      actualSpecialConditionsFormReason,
      expectedSpecialConditionsFormReason,
      "Ошибка соответствия - Справка об инвалидности - поле: 'Причина'"
    );

    WebElement SpecialConditionsDFormIssued = driver.findElement(SPECIAL_CONDITIONS_FORM_ORGANIZATION_FIELD);
    String actualSpecialConditionsDFormIssued = SpecialConditionsDFormIssued.getText();
    Assert.assertEquals(
      actualSpecialConditionsDFormIssued,
      expectedSpecialConditionsFormIssued,
      "Ошибка соответствия - Справка об инвалидности - поле: 'Наименование организации'"
    );

    WebElement SpecialConditionsFormDateStart = driver.findElement(SPECIAL_CONDITIONS_FORM_DATE_START_FIELD);
    String actualSpecialConditionsFormDateStart = SpecialConditionsFormDateStart.getText();
    Assert.assertEquals(
      actualSpecialConditionsFormDateStart,
      expectedSpecialConditionsFormIssueDate, "Ошибка соответствия - Справка об инвалидности - поле: 'дата выдачи'"
    );

    // Дата окончания срока действия
    WebElement SpecialConditionsFormExpirationDate = driver.findElement(SPECIAL_CONDITIONS_FORM_EXPIRATION_DATE_FIELD);
    String actualSpecialConditionsFormExpirationDate = SpecialConditionsFormExpirationDate.getText();
    Assert.assertEquals(
      actualSpecialConditionsFormExpirationDate,
      expectedSpecialConditionsFormExpirationDate,
      "Ошибка соответствия - Справка об инвалидности - поле: 'дата окончания'"
    );

    // ==================Имеется преимущественное право (льгота) ================
    // Переход к табу "Документ, подтверждающий инвалидность
    wait.until(ExpectedConditions.elementToBeClickable(By.id("custom-content-above-view-benefits-tab"))).click();

    WebElement Benefit_1 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_1_FIELD));
    String actualBenefit_1 = Benefit_1.getText();
    Assert.assertEquals(actualBenefit_1, expectedBenefit_1, "Ошибка соответствия - Льгота - поле: 'Льгота 1'");

    WebElement Benefit_2 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_2_FIELD));
    String actualBenefit_2 = Benefit_2.getText();
    Assert.assertEquals(actualBenefit_2, expectedBenefit_2, "Ошибка соответствия - Льгота - поле: 'Льгота 2'");

    WebElement Benefit_3 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_3_FIELD));
    String actualBenefit_3 = Benefit_3.getText();
    Assert.assertEquals(actualBenefit_3, expectedBenefit_3, "Ошибка соответствия - Льгота - поле: 'Льгота 3'");

    WebElement Benefit_4 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_4_FIELD));
    String actualBenefit_4 = Benefit_4.getText();
    Assert.assertEquals(actualBenefit_4, expectedBenefit_4, "Ошибка соответствия - Льгота - поле: 'Льгота 4'");

    WebElement Benefit_5 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_5_FIELD));
    String actualBenefit_5 = Benefit_5.getText();
    Assert.assertEquals(actualBenefit_5, expectedBenefit_5, "Ошибка соответствия - Льгота - поле: 'Льгота 5'");

    WebElement Benefit_6 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_6_FIELD));
    String actualBenefit_6 = Benefit_6.getText();
    Assert.assertEquals(actualBenefit_6, expectedBenefit_6, "Ошибка соответствия - Льгота - поле: 'Льгота 6'");

    WebElement Benefit_7 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_7_FIELD));
    String actualBenefit_7 = Benefit_7.getText();
    Assert.assertEquals(actualBenefit_7, expectedBenefit_7, "Ошибка соответствия - Льгота - поле: 'Льгота 7'");

    WebElement Benefit_8 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_8_FIELD));
    String actualBenefit_8 = Benefit_8.getText();
    Assert.assertEquals(actualBenefit_8, expectedBenefit_8, "Ошибка соответствия - Льгота - поле: 'Льгота 8'");

    WebElement Benefit_9 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_9_FIELD));
    String actualBenefit_9 = Benefit_9.getText();
    Assert.assertEquals(actualBenefit_9, expectedBenefit_9, "Ошибка соответствия - Льгота - поле: 'Льгота 9'");

    WebElement Benefit_10 = wait.until(ExpectedConditions.elementToBeClickable(BENEFIT_10_FIELD));
    String actualBenefit_10 = Benefit_10.getText();
    Assert.assertEquals(actualBenefit_10, expectedBenefit_10, "Ошибка соответствия - Льгота - поле: 'Льгота 10'");

    // ==  Справка 086У ==
    // Переход на вкладку "Информация об учреждении СПО"
    driver.findElement(By.id("custom-content-above-view-statement-tab")).click();

    WebElement Reference_086USeries = wait.until(ExpectedConditions.elementToBeClickable(REFERENCE_086U_SERIES_FIELD));
    String actualReference_086USeries = Reference_086USeries.getText();
    Assert.assertEquals(actualReference_086USeries, expectedReference_086USeries, "Ошибка соответствия - Справка 086У - поле: 'Серия'");

    WebElement Reference_086UNumber = wait.until(ExpectedConditions.elementToBeClickable(REFERENCE_086U_NUMBER_FIELD));
    String actualReference_086UNumber = Reference_086UNumber.getText();
    Assert.assertEquals(actualReference_086UNumber, expectedReference_086UNumber, "Ошибка соответствия - Справка 086У - поле: 'Номер'");

    WebElement Reference_086UDate = wait.until(ExpectedConditions.elementToBeClickable(REFERENCE_086U_DATE_FIELD));
    String actualReference_086UDate = Reference_086UDate.getText();
    Assert.assertEquals(
      actualReference_086UDate,
      expectedReference_086UDate + " 00:00",
      "Ошибка соответствия - Справка 086У - поле: 'Дата'"
    );

    // == Специальные условия для ВИ ==
    driver.findElement(By.id("custom-content-above-view-statement-tab")).click();

    WebElement SpecialConditionsVI = wait.until(ExpectedConditions.elementToBeClickable(SPECIAL_CONDITIONS_VI_FIELD));
    String actualSpecialConditionsVI = SpecialConditionsVI.getText();
    Assert.assertEquals(
      "[" + actualSpecialConditionsVI + "]",
      expectedConditions,
      "Ошибка соответствия - Специальные условия ВИ - поле: 'условия'"
    );

    // ИД
    driver.findElement(By.id("custom-content-above-view-personal-achievement-tab")).click();

    WebElement IndividualAchievements = wait.until(ExpectedConditions.elementToBeClickable(INDIVIDUAL_ACHIEVEMENTS_FIELD));
    String actualIndividualAchievements = IndividualAchievements.getText();
    Assert.assertEquals(
      actualIndividualAchievements,
      expectedIndividualAchievements,
      "Ошибка соответствия - Индивидуальные достижения - поле: 'ИД'"
    );

    WebElement IndividualAchievementsScore = driver.findElement(INDIVIDUAL_ACHIEVEMENTS_SCORE_FIELD);
    String actualIndividualAchievementsScore = IndividualAchievementsScore.getText();
    Assert.assertEquals(
      actualIndividualAchievementsScore,
      expectedIndividualAchievementsScore_1,
      "Ошибка соответствия - Индивидуальные достижения - поле: 'Оценка'"
    );
  }
}
