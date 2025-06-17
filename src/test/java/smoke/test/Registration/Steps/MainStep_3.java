package smoke.test.Registration.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainStep_3 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedEducationDocumentIssued;
  private final String expectedEducationDocumentSeries;
  private final String expectedEducationDocumentNumber;
  private final String expectedEducationDocumentIssueDate;
  private final String expectedEducationDocumentNumberFives;
  private final String expectedEducationDocumentNumberFours;
  private final String expectedEducationDocumentNumberThrees;

  public MainStep_3(WebDriver driver, WebDriverWait wait,
          String expectedEducationDocumentIssued,
          String expectedEducationDocumentSeries,
          String expectedEducationDocumentNumber,
          String expectedEducationDocumentIssueDate,
          String expectedEducationDocumentNumberFives,
          String expectedEducationDocumentNumberFours,
          String expectedEducationDocumentNumberThrees) {

    this.driver = driver;
    this.wait = wait;
    this.expectedEducationDocumentIssued = expectedEducationDocumentIssued;
    this.expectedEducationDocumentSeries = expectedEducationDocumentSeries;
    this.expectedEducationDocumentNumber = expectedEducationDocumentNumber;
    this.expectedEducationDocumentIssueDate = expectedEducationDocumentIssueDate;
    this.expectedEducationDocumentNumberFives = expectedEducationDocumentNumberFives;
    this.expectedEducationDocumentNumberFours = expectedEducationDocumentNumberFours;
    this.expectedEducationDocumentNumberThrees = expectedEducationDocumentNumberThrees;
  }

  public void step_3() {
    wait.until(ExpectedConditions.elementToBeClickable(
      By.id("select2-educationdocument-code-container")))
      .click();
    driver.findElement(By.xpath("/html/body/span/span/span[2]")).click();
    // Кем выдан
    driver.findElement(By.id("educationdocument-issued"))
      .sendKeys(expectedEducationDocumentIssued);
    // Серия документа
    driver.findElement(By.id("educationdocument-series"))
      .sendKeys(expectedEducationDocumentSeries);
    // Номер документа
    driver.findElement(By.id("educationdocument-number"))
      .sendKeys(expectedEducationDocumentNumber);
    // Дата выдачи
    wait.until(ExpectedConditions.elementToBeClickable(By.id("educationdocument-issue_date")))
      .sendKeys(expectedEducationDocumentIssueDate);
    //   доработать   !!!!!!!
    driver.findElement(By.xpath("//*[@id=\"msform\"]/fieldset/div[7]/div/div[1]/div/div/span[2]"))
      .click();
    // Оценка - отлично
    driver.findElement(By.id("educationdocument-number_fives"))
      .sendKeys(expectedEducationDocumentNumberFives);
    // Оценка - хорошо
    driver.findElement(By.id("educationdocument-number_fours"))
      .sendKeys(expectedEducationDocumentNumberFours);
    // Оценка - удовлетворительно
    driver.findElement(By.id("educationdocument-number_threes"))
      .sendKeys(expectedEducationDocumentNumberThrees);
    driver.findElement(
      By.xpath("//*[@id=\"msform\"]/fieldset/div[10]/div[2]/button"))
      .click();
  }
}
