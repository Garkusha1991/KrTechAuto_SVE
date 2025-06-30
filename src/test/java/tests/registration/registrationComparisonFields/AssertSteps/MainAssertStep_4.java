package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.expectedEducationLevel;
import static data.ExpectedData.expectedSPOOrganisation;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.EDUCATION_LEVEL_FIELD;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.ORGANIZATION_SVE_FIELD;

public class MainAssertStep_4 extends BaseSteps {

  public MainAssertStep_4(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_4() throws InterruptedException {

    // Переход по вкладке "Информация об учреждении СПО и специальностях"
    WebElement TabInfoSVE = driver.findElement(By.id("custom-content-above-view-statement-tab")
    );
    TabInfoSVE.click();

    Thread.sleep(2000);

    WebElement OrganizationSVE = driver.findElement(ORGANIZATION_SVE_FIELD);
    Assert.assertEquals(
      OrganizationSVE.getText(),
      expectedSPOOrganisation,
      "Ошибка соответствия - Параметры специальности -поле: 'Наименование организации'"
    );

    WebElement EducationLevel = driver.findElement(EDUCATION_LEVEL_FIELD);
    String actualEducationLevel = EducationLevel.getText();
    Assert.assertEquals(
      actualEducationLevel,
      expectedEducationLevel,
      "Ошибка соответствия - Параметры специальности - поле: 'Наименование организации'"
    );
  }
}
