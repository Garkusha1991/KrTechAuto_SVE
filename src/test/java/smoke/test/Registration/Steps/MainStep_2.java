package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainStep_2 {

  public static String documentSeriesUsedInStep2;
  public static String documentNumberUsedInStep2;

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedSeries;
  private final String expectedNumber;
  private final String expectedDocumentIssued;
  private final String expectedDocumentIssueDate;
  private final String expectedDocumentDepartmentCode;

  public MainStep_2(WebDriver driver, WebDriverWait wait,
                    String expectedApplicantTypeOfDocument,
                    String expectedSeries,
                    String expectedNumber,
                    String expectedDocumentIssued,
                    String expectedDocumentIssueDate,
                    String expectedDocumentDepartmentCode) {
    this.driver = driver;
    this.wait = wait;

    this.expectedDocumentIssued = expectedDocumentIssued;
    this.expectedDocumentIssueDate = expectedDocumentIssueDate;
    this.expectedDocumentDepartmentCode = expectedDocumentDepartmentCode;
    this.expectedSeries = expectedSeries;
    this.expectedNumber = expectedNumber;

    MainStep_2.documentSeriesUsedInStep2 = expectedSeries;
    MainStep_2.documentNumberUsedInStep2 = expectedNumber;
  }

  public void step_2() {
    // Тип документа (РФ)
    wait.until(ExpectedConditions.elementToBeClickable(
      By.id("select2-document-code-container")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id='select2-document-code-results']/li[1]")))
      .click();
    // Серия
    driver.findElement(By.id("document-series")).sendKeys(expectedSeries);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("document-number"))).sendKeys(expectedNumber);
    driver.findElement(By.id("document-issued")).sendKeys(expectedDocumentIssued);
    wait.until(ExpectedConditions.elementToBeClickable(
      By.id("document-issue_date")))
      .sendKeys(expectedDocumentIssueDate);
    driver.findElement(By.id("document-department_code"))
      .sendKeys(expectedDocumentDepartmentCode);
    driver.findElement(By.xpath("//*[@id=\"msform\"]/fieldset/div[7]/div[2]/button"))
      .click();
  }
}
