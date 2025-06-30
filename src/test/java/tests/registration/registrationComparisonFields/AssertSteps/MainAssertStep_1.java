package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import setup.BaseSteps;
import tests.registration.registrationClassic.steps.step_1.MainStep;

import static data.ExpectedData.*;
import static data.ExpectedData.expectedApplicantAddress;
import static data.ExpectedData.expectedApplicantBirthDate;
import static data.ExpectedData.expectedApplicantBirthPlace;
import static data.ExpectedData.expectedApplicantEmail;
import static data.ExpectedData.expectedApplicantGender;
import static data.ExpectedData.expectedApplicantIndex;
import static data.ExpectedData.expectedApplicantPhone;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;

public class MainAssertStep_1 extends BaseSteps {

  public MainAssertStep_1(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_1() throws InterruptedException {
    Thread.sleep(3000);

    WebElement ApplicantLastName = driver.findElement(APPLICANT_LAST_NAME_FIELD);
    String actualApplicantLastName = ApplicantLastName.getText();
    Assert.assertEquals(actualApplicantLastName, expectedApplicantLastName, "Фамилия - введена неверно");

    WebElement ApplicantName = driver.findElement(APPLICANT_NAME_FIELD);
    String actualApplicantName = ApplicantName.getText();
    Assert.assertEquals(actualApplicantName, expectedApplicantName, "Имя - введено неверно");

    WebElement ApplicantSurname = driver.findElement(APPLICANT_SURNAME_FIELD);
    String actualApplicantSurname = ApplicantSurname.getText();
    Assert.assertEquals(actualApplicantSurname, expectedApplicantSurname, "Отчество - введено неверно");

    WebElement ApplicantBirthDate = driver.findElement(APPLICANT_BIRTHDAY_DATE_FIELD);
    String actualApplicantBirthDate = ApplicantBirthDate.getText();
    Assert.assertEquals(actualApplicantBirthDate, expectedApplicantBirthDate, "Дата рождения - введена неверно");

    WebElement ApplicantGender = driver.findElement(APPLICANT_GENDER_FIELD);
    String actualApplicantGender = ApplicantGender.getText();
    Assert.assertEquals(actualApplicantGender, expectedApplicantGender, "Пол - введено неверно");

    WebElement ApplicantEmail = driver.findElement(APPLICANT_EMAIL_FIELD);
    String actualApplicantEmail = ApplicantEmail.getText();
    Assert.assertEquals(actualApplicantEmail, expectedApplicantEmail, "email - введено неверно");

    WebElement ApplicantBirthPlace = driver.findElement(APPLICANT_BIRTH_PLACE_FIELD);
    String actualBirthPlace = ApplicantBirthPlace.getText();
    Assert.assertEquals(actualBirthPlace, expectedApplicantBirthPlace, "Место рождения - введено неверно");

    WebElement ApplicantIndex = driver.findElement(APPLICANT_INDEX_FIELD);
    String actualApplicantIndex = ApplicantIndex.getText();
    Assert.assertEquals(actualApplicantIndex, expectedApplicantIndex, "Индекс - введено неверно");

    WebElement ApplicantAddress = driver.findElement(APPLICANT_ADDRESS_FIELD);
    String actualApplicantAddress = ApplicantAddress.getText();
    Assert.assertEquals(actualApplicantAddress, expectedApplicantAddress, "Адрес регистрации - введено неверно");

    WebElement ApplicantSnils = driver.findElement(APPLICANT_SNILS_FIELD);
    String actualApplicantSnils = ApplicantSnils.getText();
    Assert.assertEquals(actualApplicantSnils,
      MainStep.Snils,
      "Снилс - введено неверно");

    WebElement ApplicantPhone = driver.findElement(APPLICANT_PHONE_FIELD);
    String actualApplicantPhone = ApplicantPhone.getText();
    Assert.assertEquals(actualApplicantPhone, "+7 " + expectedApplicantPhone, "Телефон - введено неверно");
  }
}
