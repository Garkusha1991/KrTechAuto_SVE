/** Тест создания группы ВИ */

package tests.adminOO.addGroupsEntranceExams;

import data.data_popUp.PopUpMessages;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import setup.Base;
import tests.adminOO.addGroupsEntranceExams.main.MainStep_AddGroupEntranceExam;
import utils.PopUpUtils;

import static tests.adminOO.addEntranceExams.locators.LocatorsAddEntranceExams.SCHEDULE_ENTRANCE_TEST_MENU;
import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.*;

public class AddGroupEntranceExams extends Base {

  @Test(priority = 2)
  @Description("Переход к реестру ВИ и карточке ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void goToRegistryEntranceExams() {
    wait.until(ExpectedConditions.elementToBeClickable(SCHEDULE_ENTRANCE_TEST_MENU)).click();
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_MENU)).click();
    wait.until(ExpectedConditions.elementToBeClickable(VIEW_CARD_ENTRANCE_EXAMS)).click();
  }

  @Test(priority = 3)
  @Description("Добавление группы ВИ")
  @Severity(SeverityLevel.CRITICAL)
  public void addGroupEntranceExams() {
    MainStep_AddGroupEntranceExam mainStep_addGroupEntranceExam = new MainStep_AddGroupEntranceExam(driver, wait);
    mainStep_addGroupEntranceExam.fillFieldsGroupEntranceExam();
  }

  @Test(priority = 20)
  @Description("Проверка на всплывающий popUp")
  @Severity(SeverityLevel.CRITICAL)
  public void popUp() throws InterruptedException {
    PopUpUtils popUpUtils = new PopUpUtils(driver,wait);
    popUpUtils.assertPopUpContainsText(PopUpMessages.EXAM_GROUP_CREATED);
  }
}
