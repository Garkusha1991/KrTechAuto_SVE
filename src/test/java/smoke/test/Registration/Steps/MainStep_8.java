package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainStep_8 {

  private final WebDriver driver;
  private final WebDriverWait wait;

  private final String expectedLegalRepresentativeFio;
  private final String expectedLegalRepresentativePhone;
  private final String expectedLegalRepresentativeEmail;

  public MainStep_8(WebDriver driver, WebDriverWait wait,
                    String expectedLegalRepresentativeFio,
                    String expectedLegalRepresentativePhone,
                    String expectedLegalRepresentativeEmail) {
    this.driver = driver;
    this.wait = wait;
    this.expectedLegalRepresentativeFio = expectedLegalRepresentativeFio;
    this.expectedLegalRepresentativePhone = expectedLegalRepresentativePhone;
    this.expectedLegalRepresentativeEmail = expectedLegalRepresentativeEmail;
  }

  public void step_8() throws InterruptedException {
    wait.until(ExpectedConditions.elementToBeClickable(By.id("legalrepresentative-fio")))
      .sendKeys(expectedLegalRepresentativeFio);
    driver.findElement(By.id("legalrepresentative-phone"))
      .sendKeys(expectedLegalRepresentativePhone);
    driver.findElement(By.id("legalrepresentative-email"))
      .sendKeys(expectedLegalRepresentativeEmail);
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[4]/div[2]/button"))
      .click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }
}