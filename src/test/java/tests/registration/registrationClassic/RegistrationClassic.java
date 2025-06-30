 /**
 * (Добавить в Intellij Idea Плагин - TestNG)
 * Позитивный тест регистрации заявления
 * Проходится по всем полям.
 * В методе auth, в классе Base, в "@Test - Авторизация" -  логин и пароль для авторизации.
 */

package tests.registration.registrationClassic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import setup.BaseRegistration;
import tests.registration.registrationClassic.steps.step_8.MainStep;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static data.data_popUp.LocatorsPopUp.ADD_ENTRANCE_EXAMS_POP_UP;

 public class RegistrationClassic extends BaseRegistration {


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
  public void step_7() {
    tests.registration.registrationClassic.steps.step_7.MainStep step_7 = new tests.registration.registrationClassic.steps.step_7.MainStep(driver, wait);
    step_7.fillStep_7();
  }

  @Test(priority = 11)
  @Description("Шаг-8 Данные о законном представителе")
  @Severity(SeverityLevel.CRITICAL)
  public void step_8() {
    MainStep step_8 = new MainStep(driver, wait);
    step_8.fillStep_8();
  }

  @Test(priority = 12)
  @Description("Проверка на всплывающий popUp")
  @Severity(SeverityLevel.CRITICAL)
  public void popUp() {
    WebElement addEntranceExamsPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(ADD_ENTRANCE_EXAMS_POP_UP));

    String hint = "Объект «Вступительные испытания» был создан";

    Assert.assertTrue(addEntranceExamsPopUp.isDisplayed(), "Всплывающее окно с сообщением не появилось");
    Assert.assertTrue(addEntranceExamsPopUp.getText().contains(hint), "Ожидалась подсказка: " + hint);
  }
}

