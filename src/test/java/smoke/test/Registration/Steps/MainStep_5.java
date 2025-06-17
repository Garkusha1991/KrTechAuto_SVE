package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainStep_5 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedListSpecialties;

  public MainStep_5(WebDriver driver, WebDriverWait wait,
                    String expectedListSpecialties) {
    this.driver = driver;
    this.wait = wait;

    this.expectedListSpecialties = expectedListSpecialties;
  }

  public void step_5() {
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"row{multiple_index}\"]/td[1]/div/span/span[1]/span")))
      .sendKeys(expectedListSpecialties + Keys.ENTER);
    wait.until(ExpectedConditions.elementToBeClickable(
      By.xpath("//*[@id=\"row{multiple_index}\"]/td[2]/div/div[1]/div/div/span[2]")))
      .click();
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[2]/div[2]/button"))
      .click();
  }
}
