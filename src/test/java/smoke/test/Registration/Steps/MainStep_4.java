package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainStep_4 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedSPOOrganisation;
  private final String expectedEducationLevel;

  public MainStep_4(WebDriver driver, WebDriverWait wait,
      String expectedSPOOrganisation,
      String expectedEducationLevel) {
    this.driver = driver;
    this.wait = wait;
    this.expectedSPOOrganisation = expectedSPOOrganisation;
    this.expectedEducationLevel = expectedEducationLevel;
  }

  public void step_4() {
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"msform\"]/div[1]/div/span/span[1]/span")))
      .sendKeys(expectedSPOOrganisation + Keys.ENTER);
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"msform\"]/div[2]/div/span/span[1]/span")))
      .sendKeys(expectedEducationLevel + Keys.ENTER);
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[3]/div[2]/button"))
      .click();
  }
}
