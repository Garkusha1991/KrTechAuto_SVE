/** Тест создания ВИ для роли Администратор ОО*/

package tests.adminOO.addEntranceExams;

import data.data_popUp.PopUpMessages;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import setup.Base;
import utils.PopUpUtils;
import utils.random.GenerateRandomNumberEntranceExam;

import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.*;

public class AddEntranceExams extends Base {

  @Test(priority = 2)
  @Description("Переход к добавлению ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void goToAddEntranceExams() {
    wait.until(ExpectedConditions.elementToBeClickable(SCHEDULE_ENTRANCE_TEST_MENU)).click();
    wait.until(ExpectedConditions.elementToBeClickable(ADD_ENTRANCE_TEST)).click();
  }

  @Test(priority = 3)
  @Description("Переход к добавлению ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void addEntranceExams() {
    String number = GenerateRandomNumberEntranceExam.generateRandomEntranceExam();

    wait.until(ExpectedConditions.elementToBeClickable(NAME_ENTRANCE_TEST)).sendKeys(data.addEntranceExams.name + " " + "+" + " " + number);

    wait.until(ExpectedConditions.elementToBeClickable(SPO_INSTITUTION_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(SPO_INSTITUTION)).click();

    wait.until(ExpectedConditions.elementToBeClickable(FORM_STUDY_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(FORM_STUDY)).click();

    wait.until(ExpectedConditions.elementToBeClickable(BASIC_EDUCATION_LEVEL_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(BASIC_EDUCATION_LEVEL)).click();

    wait.until(ExpectedConditions.elementToBeClickable(FORM_PAYMENT_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(FORM_PAYMENT)).click();

    wait.until(ExpectedConditions.elementToBeClickable(SPECIALITY_PROFESSION_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(SPECIALITY_PROFESSION)).click();

    wait.until(ExpectedConditions.elementToBeClickable(SYSTEM_ENTRANCE_EXAM_DROPDOWN)).click();
    wait.until(ExpectedConditions.elementToBeClickable(SYSTEM_ENTRANCE_EXAM)).click();

    wait.until(ExpectedConditions.elementToBeClickable(THRESHOLD_SCORE_ENTRANCE_EXAM)).sendKeys(data.addEntranceExams.score);

    wait.until(ExpectedConditions.elementToBeClickable(ADD_ENTRANCE_TEST_BTN_SAVE)).click();
  }

  @Test(priority = 4)
  @Description("Проверка всплывающего окна")
  @Severity(SeverityLevel.CRITICAL)
  public void popUp() throws InterruptedException {
    Thread.sleep(3000);

    PopUpUtils popUpUtils = new PopUpUtils(driver,wait);
    popUpUtils.assertPopUpContainsText(PopUpMessages.ENTRANCE_EXAM_CREATED);
  }
}
