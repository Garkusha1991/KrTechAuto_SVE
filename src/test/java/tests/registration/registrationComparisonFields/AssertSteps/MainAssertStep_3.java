package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.*;
import static data.ExpectedData.expectedEducationDocumentIssueDate;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.EDUCATION_DOCUMENT_AVERAGE_SCORE_FIELD;
import static utils.GradeCalculator.GradeGenerator;

public class MainAssertStep_3 extends BaseSteps {

  public MainAssertStep_3(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_3() throws InterruptedException {

    // Переход во вкладку "Заявление"
    driver.findElement(By.id("custom-content-above-view-application-tab")).click();

    Thread.sleep(2000);

    WebElement EducationDocumentIssued = driver.findElement(EDUCATION_DOCUMENT_ISSUED_FIELD);
    String actualEducationDocumentIssued = EducationDocumentIssued.getText();
    Assert.assertEquals(
      actualEducationDocumentIssued,
      expectedEducationDocumentIssued,
      "Ошибка соответствия - Документ об образовани -поле: 'Кем выдан'"
    );

    WebElement EducationDocumentSeries = driver.findElement(EDUCATION_DOCUMENT_SERIES_FIELD);
    String actualEducationDocumentSeries = EducationDocumentSeries.getText();
    Assert.assertEquals(
      actualEducationDocumentSeries,
      expectedEducationDocumentSeries,
      "Ошибка соответствия - Документ об образовани -поле:'Серия'"
    );

    WebElement EducationDocumentNumber = driver.findElement(EDUCATION_DOCUMENT_NUMBER_FIELD);
    String actualEducationDocumentNumber = EducationDocumentNumber.getText();
    Assert.assertEquals(
      actualEducationDocumentNumber,
      expectedEducationDocumentNumber,
      "Ошибка соответствия - Документ об образовани -поле:'Номер документа'"
    );

    WebElement EducationDocumentIssueDate = driver.findElement(EDUCATION_DOCUMENT_ISSUE_DATE_FIELD);
    String actualEducationDocumentIssueDate = EducationDocumentIssueDate.getText();
    Assert.assertEquals(
      actualEducationDocumentIssueDate,
      expectedEducationDocumentIssueDate,
      "Ошибка соответствия - Документ об образовани -поле: 'Дата выдачи'"
    );

    // -- С отличием - не реализована проверка т.к. неизвестно, как сделать проверку по картинке

    WebElement ReceivingDocumentFirst = driver.findElement(RECEIVING_DOCUMENT_FIRST_FIELD);
    String actualReceivingDocumentFirst = ReceivingDocumentFirst.getText();
    Assert.assertEquals(
      actualReceivingDocumentFirst,
      "Да",
      "Ошибка соответствия - Документ об образовани -поле: 'Получение СПО впервые'"
    );

    WebElement AverageScore = driver.findElement(EDUCATION_DOCUMENT_AVERAGE_SCORE_FIELD);
    String actualAverageScore = AverageScore.getText();
    String expectedAverageScore = GradeGenerator();
    Assert.assertEquals(
      actualAverageScore,
      expectedAverageScore,
      "Ошибка соответствия - Документ об образовани -поле: 'средний балл не соответствует'"
    );
  }

}
