package tests.adminOO.addGroupsEntranceExams.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.*;

public class MainStep_AddGroupEntranceExam extends BaseSteps {

  private final Methods_AddGroupEntranceExams methods_addGroupEntranceExams;

  public MainStep_AddGroupEntranceExam(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
    this.methods_addGroupEntranceExams = new Methods_AddGroupEntranceExams(driver, wait);
  }

  public void fillFieldsGroupEntranceExam() {
    String currentAction = "";

    try {
      currentAction = "нажатие кнопки добавить группу (+). Локатор " + ADD_ENTRANCE_GROUP_BUTTON;
      methods_addGroupEntranceExams.clickBtnAddEntranceGroup();

      currentAction = "ввод поля «Наименование группы ВИ». Локатор " + ENTRANCE_EXAMS_GROUP_NAME;
      methods_addGroupEntranceExams.fillEntranceGroupName(data.addGroupEntranceExams.groupName);

      currentAction = "ввод поля «Место проведения ВИ». Локатор " + ENTRANCE_EXAMS_GROUP_LOCATION;
      methods_addGroupEntranceExams.fillEntranceGroupLocation(data.addGroupEntranceExams.location);

      currentAction = "ввод поля «Количество мест в группе ВИ». Локатор " + ENTRANCE_EXAMS_GROUP_NUMBER_SEATS;
      methods_addGroupEntranceExams.fillEntranceGroupNumberSeats(data.addGroupEntranceExams.numberSeats);

      currentAction = "ввод поля «Дата и время проведения ВИ». Локатор " + ENTRANCE_EXAMS_GROUP_DATE_TIME;
      methods_addGroupEntranceExams.fillEntranceGroupDateTime(data.addGroupEntranceExams.dateTime);

      currentAction = "нажатие кнопки Сохранить. Локатор: " + ENTRANCE_EXAMS_GROUP_BTN_SAVE;
      methods_addGroupEntranceExams.ClickBtnSave();

    } catch (Exception e) {
     Assert.fail("Заполнение карточки добавление группы: ошибка при " + currentAction);
    }
  }
}
