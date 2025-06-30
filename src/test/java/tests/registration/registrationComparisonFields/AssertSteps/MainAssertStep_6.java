package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.*;
import static data.ExpectedData.expectedChineseScore;
import static data.ExpectedData.expectedGeographyScore;
import static data.ExpectedData.expectedGermanScore;
import static data.ExpectedData.expectedLiteratureScore;
import static data.ExpectedData.expectedSpanishScore;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.GERMAN_SCORE_FIELD;

public class MainAssertStep_6 extends BaseSteps {

  public MainAssertStep_6(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_6() throws InterruptedException {

    // Раскрытие списка специальностей
    driver.findElement(By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[1]/div/div[1]/span")).click();

    WebElement MathematicScore = wait.until(ExpectedConditions.elementToBeClickable(MATHEMATIC_SCORE_FIELD));
    String actualMathematicScore = MathematicScore.getText();
    Assert.assertEquals(
      actualMathematicScore,
      expectedMathematicsScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Математика'"
    );

    WebElement ComputerScienceScore = driver.findElement(COMPUTER_SCIENCE_SCORE_FIELD);
    String actualComputerScienceScore = ComputerScienceScore.getText();
    Assert.assertEquals(
      actualComputerScienceScore,
      expectedComputerScienceScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Информатика'"
    );

    WebElement PhysicsScoreScore = driver.findElement(PHYSICS_SCORE_FIELD);
    String actualPhysicsScoreScore = PhysicsScoreScore.getText();
    Assert.assertEquals(
      actualPhysicsScoreScore,
      expectedPhysicsScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Физика'"
    );

    WebElement GeographyScore = driver.findElement(GEOGRAPHY_SCORE_FIELD);
    String actualGeographyScore = GeographyScore.getText();
    Assert.assertEquals(
      actualGeographyScore,
      expectedGeographyScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'География'"
    );

    WebElement ChineseScore = driver.findElement(CHINESE_SCORE_FIELD);
    String actualChineseScore = ChineseScore.getText();
    Assert.assertEquals(
      actualChineseScore,
      expectedChineseScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Китайский язык'"
    );

    WebElement LiteratureScore = driver.findElement(LITERATURE_SCORE_FIELD);
    String actualLiteratureScore = LiteratureScore.getText();
    Assert.assertEquals(
      actualLiteratureScore,
      expectedLiteratureScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Литература'"
    );

    WebElement SpanishScore = driver.findElement(SPANISH_SCORE_FIELD);
    String actualSpanishScore = SpanishScore.getText();
    Assert.assertEquals(
      actualSpanishScore,
      expectedSpanishScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Испанский язык'"
    );

    WebElement GermanScore = driver.findElement(GERMAN_SCORE_FIELD);
    String actualGermanScore = GermanScore.getText();
    Assert.assertEquals(
      actualGermanScore,
      expectedGermanScore,
      "Ошибка соответствия - Оценки по специальности - поле: 'Немецкий язык'"
    );
  }
}
