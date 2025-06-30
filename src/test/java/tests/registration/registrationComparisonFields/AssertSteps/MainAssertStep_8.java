package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.*;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.*;

public class
MainAssertStep_8 extends BaseSteps {

  public MainAssertStep_8(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_8() throws InterruptedException {

    // Переход на таб Родитель (Законный представитель)
    driver.findElement(By.id("custom-content-above-view-legal-representative-tab")).click();

    Thread.sleep(5000);

    WebElement LegalRepresentativeFio = driver.findElement(LEGAL_REPRESENTATIVE_FIO_FIELD);
    String actualLegalRepresentativeFio = LegalRepresentativeFio.getText();
    Assert.assertEquals(
      actualLegalRepresentativeFio,
      expectedLegalRepresentativeFio,
      "Ошибка соответствия - Законный представитель - поле: 'ФИО'"
    );

    WebElement LegalRepresentativePhone = driver.findElement(LEGAL_REPRESENTATIVE_PHONE_FIELD);
    String actualLegalRepresentativePhone = LegalRepresentativePhone.getText();
    Assert.assertEquals(
      actualLegalRepresentativePhone,
      "+7 " + expectedLegalRepresentativePhone,
      "Ошибка соответствия - Законный представитель - поле: 'Телефон'"
    );

    WebElement LegalRepresentativeEmail = driver.findElement(LEGAL_REPRESENTATIVE_EMAIL_FIELD);
    String actualLegalRepresentativeEmail = LegalRepresentativeEmail.getText();
    Assert.assertEquals(
      actualLegalRepresentativeEmail,
      expectedLegalRepresentativeEmail,
      "Ошибка соответствия - Законный представитель - поле: 'Email'"
    );
  }
}
