package tests.registration.registrationComparisonFields.AssertSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import static data.ExpectedData.expectedListSpecialties;
import static tests.registration.registrationMandatoryFields.locators.LocatorsExpected.LIST_SPECIALTIES_FIELD;

public class MainAssertStep_5 extends BaseSteps {

  public MainAssertStep_5(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void fillAssertStep_5() {
    // Код и наименование специальностей
    WebElement ListSpecialties = driver.findElement(LIST_SPECIALTIES_FIELD);
    String actualListSpecialties = ListSpecialties.getText();

    Assert.assertEquals(
      actualListSpecialties,
      expectedListSpecialties,
      "Ошибка соответствия - Специальности - поле: 'Список специальностей/профессий'"
    );

    // Оригинал документа  - не реализована проверка т.к. неизвестно как проверять по картинке
  }

}
