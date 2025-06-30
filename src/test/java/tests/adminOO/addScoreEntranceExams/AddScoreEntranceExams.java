/** Тест выставление баллов ВИ для роли Администратор ОО
 * Выполняется путём создания ВИ
 * А так же добавлением группы ВИ
 */

package tests.adminOO.addScoreEntranceExams;

import data.data_popUp.PopUpMessages;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Base;
import tests.adminOO.addGroupsEntranceExams.main.MainStep_AddGroupEntranceExam;
import utils.PopUpUtils;
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
import static tests.adminOO.addScoreEntranceExams.page.Locators.*;

public class AddScoreEntranceExams extends Base {

  @Test(priority = 2)
  @Description("Переход к добавлению ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void goToAddEntranceExams() {
    wait.until(ExpectedConditions.elementToBeClickable(SCHEDULE_ENTRANCE_TEST_MENU)).click();
    wait.until(ExpectedConditions.elementToBeClickable(ADD_ENTRANCE_TEST)).click();
  }

  @Test(priority = 3)
  @Description("Добавление ВИ")
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
  public void popUpEntranceExamCreated() throws InterruptedException {
    Thread.sleep(3000);

    PopUpUtils popUpUtils = new PopUpUtils(driver,wait);
    popUpUtils.assertPopUpContainsText(PopUpMessages.ENTRANCE_EXAM_CREATED);
  }

  @Test(priority = 5)
  @Description("Добавление группы ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void addGroupEntranceExams() throws InterruptedException {
    MainStep_AddGroupEntranceExam mainStep_addGroupEntranceExam = new MainStep_AddGroupEntranceExam(driver, wait);
    mainStep_addGroupEntranceExam.fillFieldsGroupEntranceExam();

    Thread.sleep(3000);
  }

  @Test(priority = 6)
  @Description("Проверка всплывающего окна")
  @Severity(SeverityLevel.CRITICAL)
  public void popUpGroupCreated() throws InterruptedException {
    PopUpUtils popUpUtils = new PopUpUtils(driver,wait);
    popUpUtils.assertPopUpContainsText(PopUpMessages.ENTRANCE_EXAM_GROUP_CREATED);
  }

  @Test(priority = 7)
  @Description("Переход к карточке специальности и укоплектование группы")
  @Severity(SeverityLevel.CRITICAL)
  public void staffingGroup() {
    wait.until(ExpectedConditions.elementToBeClickable(BREAD_CRUMBS_ENTRANCE_EXAMS)).click();
    // Комплектование группы
    wait.until(ExpectedConditions.elementToBeClickable(COMPLETE_GROUP_ENTRANCE_EXAMS)).click();
    wait.until(ExpectedConditions.elementToBeClickable(COMPLETE_GROUP_ENTRANCE_EXAMS_OK)).click();
  }

  @Test(priority = 8)
  @Description("Выставление оценок ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void grading() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(OPEN_SCORE_MODAL)).click();

    WebElement fillScore = wait.until(ExpectedConditions.elementToBeClickable(RESULT_ENTRANCE_EXAMS));
      fillScore.clear();
      fillScore.sendKeys(data.addScoreEntranceExams.score_1);

    wait.until(ExpectedConditions.elementToBeClickable(SAVE_SCORE_BTN)).click();

    Thread.sleep(2000);

    String expectedScore = data.addScoreEntranceExams.score_1;
    WebElement actualScore =  driver.findElement(By.xpath("//td[normalize-space(text())='70']"));
    Assert.assertEquals(actualScore.getText(), expectedScore, "Поле балл ВИ заполненно не корректно");
  }
}
