package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class MainStep_7 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedSpecialConditionsFormSerial;
  private final String expectedSpecialConditionsFormNumber;
  private final String expectedSpecialConditionsFormGroup;
  private final String expectedSpecialConditionsFormReason;
  private final String expectedSpecialConditionsFormIssued;
  private final String expectedSpecialConditionsFormIssueDate;
  private final String expectedSpecialConditionsFormExpirationDate;
  private final String expectedBenefit_1;
  private final String expectedBenefit_2;
  private final String expectedBenefit_3;
  private final String expectedBenefit_4;
  private final String expectedBenefit_5;
  private final String expectedBenefit_6;
  private final String expectedBenefit_7;
  private final String expectedBenefit_8;
  private final String expectedBenefit_9;
  private final String expectedBenefit_10;
  private final String expectedReference_086USeries;
  private final String expectedReference_086UNumber;
  private final String expectedReference_086UDate;
  private final String expectedIndividualAchievementsScore;

  public MainStep_7(WebDriver driver, WebDriverWait wait,
                    String expectedSpecialConditionsFormSerial,
                    String expectedSpecialConditionsFormNumber,
                    String expectedSpecialConditionsFormGroup,
                    String expectedSpecialConditionsFormReason,
                    String expectedSpecialConditionsFormIssued,
                    String expectedSpecialConditionsFormIssueDate,
                    String expectedSpecialConditionsFormExpirationDate,
                    String expectedBenefit_1,
                    String expectedBenefit_2,
                    String expectedBenefit_3,
                    String expectedBenefit_4,
                    String expectedBenefit_5,
                    String expectedBenefit_6,
                    String expectedBenefit_7,
                    String expectedBenefit_8,
                    String expectedBenefit_9,
                    String expectedBenefit_10,
                    String expectedReference_086USeries,
                    String expectedReference_086UNumber,
                    String expectedReference_086UDate,
                    String expectedIndividualAchievementsScore) {
    this.driver = driver;
    this.wait = wait;

    this.expectedSpecialConditionsFormSerial = expectedSpecialConditionsFormSerial;
    this.expectedSpecialConditionsFormNumber = expectedSpecialConditionsFormNumber;
    this.expectedSpecialConditionsFormGroup = expectedSpecialConditionsFormGroup;
    this.expectedSpecialConditionsFormReason = expectedSpecialConditionsFormReason;
    this.expectedSpecialConditionsFormIssued = expectedSpecialConditionsFormIssued;
    this.expectedSpecialConditionsFormIssueDate = expectedSpecialConditionsFormIssueDate;
    this.expectedBenefit_1 = expectedBenefit_1;
    this.expectedBenefit_2 = expectedBenefit_2;
    this.expectedBenefit_3 = expectedBenefit_3;
    this.expectedBenefit_4 = expectedBenefit_4;
    this.expectedBenefit_5 = expectedBenefit_5;
    this.expectedBenefit_6 = expectedBenefit_6;
    this.expectedBenefit_7 = expectedBenefit_7;
    this.expectedBenefit_8 = expectedBenefit_8;
    this.expectedBenefit_9 = expectedBenefit_9;
    this.expectedBenefit_10 = expectedBenefit_10;
    this.expectedReference_086USeries = expectedReference_086USeries;
    this.expectedReference_086UNumber = expectedReference_086UNumber;
    this.expectedReference_086UDate = expectedReference_086UDate;
    this.expectedSpecialConditionsFormExpirationDate = expectedSpecialConditionsFormExpirationDate;
    this.expectedIndividualAchievementsScore = expectedIndividualAchievementsScore;
  }

  public void step_7() throws InterruptedException {
    // == Справка об инвалидности ==
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[1]/div/div[1]/div/div/span[2]")))
      .click();
    driver.findElement(By.id("specialconditionsform-serial")).sendKeys(expectedSpecialConditionsFormSerial);
    driver.findElement(By.id("specialconditionsform-number")).sendKeys(expectedSpecialConditionsFormNumber);
    driver.findElement(By.id("specialconditionsform-group")).sendKeys(expectedSpecialConditionsFormGroup);
    driver.findElement(By.id("specialconditionsform-reason")).sendKeys(expectedSpecialConditionsFormReason);
    driver.findElement(By.id("specialconditionsform-issued")).sendKeys(expectedSpecialConditionsFormIssued);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-issue_date")))
      .sendKeys(expectedSpecialConditionsFormIssueDate + Keys.ENTER);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-expiration_date")))
      .sendKeys(expectedSpecialConditionsFormExpirationDate + Keys.ENTER);

    // == Льгота ==
    // Клик по бинарной кнопке
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/div[3]/div/div[1]/div/div/span[2]")))
      .click();
    // 1
    // Клик по выпадающему кастомному-меню
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"benefits{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .click();
    // Клик по li - 1
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id='select2-specialconditionsform-benefits-0-results']/li[1]")))
      .click();

    // 2
    // Добавление льготы, кнопка "+"
    WebElement AddBenefit = wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"benefits{multiple_index}\"]/td[2]/div")));
    AddBenefit.click();
    // Клик по выпадающему кастомному-меню 2
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[2]/td[1]/div/span/span[1]/span")))
      .click();
    // Клик по li - 2
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-1-results']/li[2]")))
      .click();

    // 3
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[3]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-2-results']/li[3]")))
      .click();

    // 4
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[4]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-3-results']/li[4]")))
      .click();

    // 5
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[5]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-4-results']/li[5]")))
      .click();

    // 6
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[6]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-5-results']/li[6]")))
      .click();

    // 7
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[7]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-6-results']/li[7]")))
      .click();

    // 8
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[8]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-7-results']/li[8]")))
      .click();

    // 9
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[9]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-8-results']/li[9]")))
      .click();

    // 10
    AddBenefit.click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[1]/div/div[1]/table/tbody/tr[10]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='select2-specialconditionsform-benefits-9-results']/li[10]")))
      .click();

    // == Справка по форме 086/у ==
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[5]/div/div[1]/div/div/span[2]")).click();
    driver.findElement(By.id("specialconditionsform-reference_086u_series"))
      .sendKeys(expectedReference_086USeries);
    driver.findElement(By.id("specialconditionsform-reference_086u_number"))
      .sendKeys(expectedReference_086UNumber);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("specialconditionsform-reference_086u_creation_date"))).sendKeys(expectedReference_086UDate + Keys.ENTER);

    // == Расширенная медицинская справка ==
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[7]/div/div[1]/div/div/span[2]")).click();
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"msform\"]/div[8]/div/div[1]/div/div/span[2]")))
      .click();

    // == Имеется потребность в специальных условиях при прохождении ВИ ==
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[9]/div/div[1]/div/div/span[2]"))
      .click();

    // Специальные условия при прохождении ВИ
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"special_condition{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .click();
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id='select2-specialconditionsform-special_condition-0-results']/li[1]")))
      .click();

    // Имеется потребность в общежитии
    driver.findElement(
      By.xpath("//*[@id=\"msform\"]/div[11]/div/div[1]/div/div/span[3]"))
      .click();

    // Имеются индивидуальные достижения
    // Клик по бинарной отметке
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"msform\"]/div[12]/div/div[1]/div/div/span[3]")))
      .click();
    // Клик по списку
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[13]/div[1]/div/div[1]/table/tbody/tr/td[1]/div/span/span[1]/span")))
      .click();
    // выбор из списка
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id='select2-specialconditionsform-personal_achievement-0-personal_achievement-results']/li[1]")))
      .click();

    // Оценка ИД (проверка если нет оценки)
    List<WebElement> achievementScore = driver.findElements(By.id("specialconditionsform-personal_achievement-0-personal_achievement_score"));
    if (!achievementScore.isEmpty()) {
      WebElement input = achievementScore.get(0);
      input.sendKeys(expectedIndividualAchievementsScore);
    }
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[14]/div[2]/button")).click();
  }
}
