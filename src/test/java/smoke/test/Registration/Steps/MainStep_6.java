package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainStep_6 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedMathematicsScore;
  private final String expectedComputerScienceScore;
  private final String expectedPhysicsScore;
  private final String expectedGeographyScore;
  private final String expectedChineseScore;
  private final String expectedLiteratureScore;
  private final String expectedSpanishScore;
  private final String expectedGermanScore;

  public MainStep_6(WebDriver driver, WebDriverWait wait,
                    String expectedMathematicsScore,
                    String expectedComputerScienceScore,
                    String expectedPhysicsScore,
                    String expectedGeographyScore,
                    String expectedChineseScore,
                    String expectedLiteratureScore,
                    String expectedSpanishScore,
                    String expectedGermanScore) {
    this.driver = driver;
    this.wait = wait;

    this.expectedMathematicsScore = expectedMathematicsScore;
    this.expectedComputerScienceScore =expectedComputerScienceScore;
    this.expectedPhysicsScore = expectedPhysicsScore;
    this.expectedGeographyScore = expectedGeographyScore;
    this.expectedChineseScore = expectedChineseScore;
    this.expectedLiteratureScore = expectedLiteratureScore;
    this.expectedSpanishScore = expectedSpanishScore;
    this.expectedGermanScore = expectedGermanScore;
  }

  public void step_6() {
    wait.until(ExpectedConditions.elementToBeClickable(By.id("statementspecialitydisciplineform-specialties-755-0-score"))).sendKeys(expectedMathematicsScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-1-score")).sendKeys(expectedComputerScienceScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-2-score")).sendKeys(expectedPhysicsScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-3-score")).sendKeys(expectedGeographyScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-4-score")).sendKeys(expectedChineseScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-5-score")).sendKeys(expectedLiteratureScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-6-score")).sendKeys(expectedSpanishScore);
    driver.findElement(By.id("statementspecialitydisciplineform-specialties-755-7-score")).sendKeys(expectedGermanScore);
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div/div[2]/button")).click();
  }
}
