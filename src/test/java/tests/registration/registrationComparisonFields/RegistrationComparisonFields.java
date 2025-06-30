/**
 * Тест сравнения полей при заполнении регистрации
 * с полями внутри заявления
 */

package tests.registration.registrationComparisonFields;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import setup.BaseRegistration;
import tests.registration.registrationClassic.steps.step_8.MainStep;
import tests.registration.registrationComparisonFields.AssertSteps.*;

public class RegistrationComparisonFields extends BaseRegistration {

  @Test(priority = 4)
  @Description("Шаг-1")
  @Severity(SeverityLevel.CRITICAL)
  public void step_1() {
    tests.registration.registrationClassic.steps.step_1.MainStep step_1 = new tests.registration.registrationClassic.steps.step_1.MainStep(driver, wait);
    step_1.fillSteps_1();
  }

  @Test(priority = 5)
  @Description("Шаг-2 Тип документа")
  @Severity(SeverityLevel.CRITICAL)
  public void step_2() {
    tests.registration.registrationClassic.steps.step_2.MainStep step_2 = new tests.registration.registrationClassic.steps.step_2.MainStep(driver, wait);
    step_2.fillStep_2();
  }

  @Test(priority = 6)
  @Description("Шаг-3 Документ об образовании")
  @Severity(SeverityLevel.CRITICAL)
  public void step_3() {
    tests.registration.registrationClassic.steps.step_3.MainStep step_3 = new tests.registration.registrationClassic.steps.step_3.MainStep(driver, wait);
    step_3.fillStep_3();
  }

  @Test(priority = 7)
  @Description("Шаг-4 Параметры специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void step_4() {
    tests.registration.registrationClassic.steps.step_4.MainStep step_4 = new tests.registration.registrationClassic.steps.step_4.MainStep(driver, wait);
    step_4.fillStep_4();
  }

  @Test(priority = 8)
  @Description("Шаг-5")
  @Severity(SeverityLevel.CRITICAL)
  public void step_5() {
    tests.registration.registrationClassic.steps.step_5.MainStep step_5 = new tests.registration.registrationClassic.steps.step_5.MainStep(driver, wait);
    step_5.fillStep_5();
  }

  @Test(priority = 9)
  @Description("Шаг-6 Специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void step_6() {
    tests.registration.registrationClassic.steps.step_6.MainStep step_6 = new tests.registration.registrationClassic.steps.step_6.MainStep(driver, wait);
    step_6.fillStep_6();
  }

  @Test(priority = 10)
  @Description("Шаг-7 Особые условия при поступлении")
  @Severity(SeverityLevel.CRITICAL)
  public void step_7() throws InterruptedException {
    tests.registration.registrationClassic.steps.step_7.MainStep step_7 = new tests.registration.registrationClassic.steps.step_7.MainStep(driver, wait);
    step_7.fillStep_7();
  }

  @Test(priority = 11)
  @Description("Шаг-8 Данные о законном представителе")
  @Severity(SeverityLevel.CRITICAL)
  public void step_8() throws InterruptedException {
    MainStep step_8 = new MainStep(driver, wait);
    step_8.fillStep_8();
  }

  @Test(priority = 12)
  @Description("Проверка соответствия полей шага - 1")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_1() throws InterruptedException {
    MainAssertStep_1 assertStep_1 = new MainAssertStep_1(driver, wait);
    assertStep_1.fillAssertStep_1();
  }

  @Test(priority = 13)
  @Description("Проверка соответсвия полей шага 2")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_2() throws InterruptedException {
    MainAssertStep_2 assertStep_2 = new MainAssertStep_2(driver, wait);
    assertStep_2.fillAssertStep_2();
  }

  @Test(priority = 14)
  @Description("Проверка соответсвия полей шага 3")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_3() throws InterruptedException {
    MainAssertStep_3 assertStep_3 = new MainAssertStep_3(driver, wait);
    assertStep_3.fillAssertStep_3();
  }

  @Test(priority = 15)
  @Description("Проверка соответсвия полей шага 4")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_4() throws InterruptedException {
    MainAssertStep_4 assertStep_4 = new MainAssertStep_4(driver, wait);
    assertStep_4.fillAssertStep_4();
  }

  @Test(priority = 16)
  @Description("Проверка соответсвия полей шага 5")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_5() {
    MainAssertStep_5 assertStep_5 = new MainAssertStep_5(driver, wait);
    assertStep_5.fillAssertStep_5();
  }

  @Test(priority = 17)
  @Description("Проверка соответсвия полей шага 6")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_6() throws InterruptedException {
    MainAssertStep_6 assertStep_6 = new MainAssertStep_6(driver, wait);
    assertStep_6.fillAssertStep_6();
  }

  @Test(priority = 18)
  @Description("Проверка соответсвия полей шага 7")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_7() throws InterruptedException {
    MainAssertStep_7 assertStep_7 = new MainAssertStep_7(driver, wait);
    assertStep_7.fillAssertStep_7();
  }

  @Test(priority = 19)
  @Description("Проверка соответствия полей шага 8")
  @Severity(SeverityLevel.CRITICAL)
  public void assertStep_8() throws InterruptedException {
    MainAssertStep_8 assertStep_8 = new MainAssertStep_8(driver, wait);
    assertStep_8.fillAssertStep_8();
  }
}
сдуфк