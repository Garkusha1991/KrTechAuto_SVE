/** Тест проверки на дубликат ВИ */

package tests.checkDuplicate.entranceExam;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Base;
import utils.random.GenerateRandomNumberEntranceExam;

import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.*;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.ADD_ENTRANCE_TEST_BTN_SAVE;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.BASIC_EDUCATION_LEVEL;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.BASIC_EDUCATION_LEVEL_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.FORM_PAYMENT;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.FORM_PAYMENT_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.FORM_STUDY;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.FORM_STUDY_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SPECIALITY_PROFESSION;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SPECIALITY_PROFESSION_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SPO_INSTITUTION;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SPO_INSTITUTION_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SYSTEM_ENTRANCE_EXAM;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SYSTEM_ENTRANCE_EXAM_DROPDOWN;
import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.THRESHOLD_SCORE_ENTRANCE_EXAM;

public class CheckDuplicateAddEntranceExam extends Base {

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
  public void AddEntranceExams() {
    String number = GenerateRandomNumberEntranceExam.generateRandomEntranceExam();

    wait.until(ExpectedConditions.elementToBeClickable(NAME_ENTRANCE_TEST)).sendKeys(data.addEntranceExams.name);

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

    Thread.sleep(1000);

    String fieldHint = "Комбинация параметров СПО учреждение, Специальность/профессия и Система оценивания вступительного испытания уже существует.";

    String pageSource = driver.getPageSource();

    Assert.assertNotNull(pageSource);
    Assert.assertTrue(pageSource.contains(fieldHint),
      "Ожидалась подсказка: " + fieldHint
    );
  }
}
