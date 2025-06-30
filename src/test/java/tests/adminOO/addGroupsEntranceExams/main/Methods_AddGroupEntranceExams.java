package tests.adminOO.addGroupsEntranceExams.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.Base;

import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.*;
import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.ENTRANCE_EXAMS_GROUP_BTN_SAVE;
import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.ENTRANCE_EXAMS_GROUP_DATE_TIME;
import static tests.adminOO.addGroupsEntranceExams.main.LocatorsAddGroupEntranceExams.ENTRANCE_EXAMS_GROUP_NUMBER_SEATS;

public class Methods_AddGroupEntranceExams extends Base {

  public Methods_AddGroupEntranceExams(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void clickBtnAddEntranceGroup() {
    wait.until(ExpectedConditions.elementToBeClickable(ADD_ENTRANCE_GROUP_BUTTON)).click();
  }

  public void fillEntranceGroupName(String name){
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_GROUP_NAME)).sendKeys(name);
  }

  public void fillEntranceGroupLocation(String location){
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_GROUP_LOCATION)).sendKeys(location);
  }

  public void fillEntranceGroupNumberSeats(String number){
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_GROUP_NUMBER_SEATS)).sendKeys(number);
  }

  public void fillEntranceGroupDateTime(String dateTime){
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_GROUP_DATE_TIME)).sendKeys(dateTime);

  }

  public void ClickBtnSave() {
    wait.until(ExpectedConditions.elementToBeClickable(ENTRANCE_EXAMS_GROUP_BTN_SAVE)).click();
  }
}
