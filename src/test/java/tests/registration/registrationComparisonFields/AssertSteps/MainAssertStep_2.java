package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import setup.BaseSteps;
import tests.registration.registrationClassic.steps.step_2.MainStep;

import static data.ExpectedData.*;
import static data.ExpectedData.expectedDocumentDepartmentCode;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.APPLICANT_DOCUMENT_DEPARTMENT_CODE;

public class MainAssertStep_2 extends BaseSteps {

  public MainAssertStep_2(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_2() throws InterruptedException {
    // Корректность отображения поля - Тип документа
    WebElement ApplicantTypeOfDocument = driver.findElement(APPLICANT_TYPE_DOCUMENT_FIELD);
    String actualApplicantTypeOfDocument = ApplicantTypeOfDocument.getText();
    Assert.assertEquals(
      actualApplicantTypeOfDocument,
      expectedApplicantTypeOfDocument,
      "Поле 'Тип документа' - введено неверно"
    );

    WebElement ApplicantDocumentSeries = driver.findElement(APPLICANT_SERIES_DOCUMENT_FIELD);
    String actualDocumentSeries = ApplicantDocumentSeries.getText();
    Assert.assertEquals(
      actualDocumentSeries,
      MainStep.applicantDocumentSeries,
      "Поле 'Серия документа' - введено неверно"
    );

    WebElement ApplicantDocumentNumber = driver.findElement(APPLICANT_NUMBER_DOCUMENT_FIELD);
    String actualApplicantDocumentNumber = ApplicantDocumentNumber.getText();
    Assert.assertEquals(
      actualApplicantDocumentNumber,
      MainStep.applicantDocumentNumber,
      "Поле 'Номер документа' - введено неверно"
    );

    WebElement ApplicantDocumentIssued = driver.findElement(APPLICANT_DOCUMENT_ISSUED_FIELD);
    String actualApplicantDocumentIssued = ApplicantDocumentIssued.getText();
    Assert.assertEquals(
      actualApplicantDocumentIssued,
      expectedDocumentIssued,
      "Поле 'Кем выдан' - введено неверно"
    );

    WebElement ApplicantDocumentIssueDate = driver.findElement(APPLICANT_DOCUMENT_ISSUE_DATE);
    String actualApplicantDocumentIssueDate = ApplicantDocumentIssueDate.getText();
    Assert.assertEquals(
      actualApplicantDocumentIssueDate,
      expectedDocumentIssueDate,
      "Поле 'Дата выдачи' - введено неверно"
    );

    WebElement ApplicantDocumentDepartmentCode = driver.findElement(APPLICANT_DOCUMENT_DEPARTMENT_CODE);
    String actualApplicantDocumentDepartmentCode = ApplicantDocumentDepartmentCode.getText();
    Assert.assertEquals(
      actualApplicantDocumentDepartmentCode,
      expectedDocumentDepartmentCode,
      "Поле 'Код подразделения' - введено неверно"
    );
  }
}
