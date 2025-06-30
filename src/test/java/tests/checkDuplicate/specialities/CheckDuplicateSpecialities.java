/**
 * Проверка на дубликат создания Специальности
 * Проверка реализована под ролью Супер-Администратор (В других ролях функционал заблокирован)
 */

package tests.checkDuplicate.specialities;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;

import org.testng.annotations.Test;
import setup.Auth;
import setup.Base;

import static tests.checkDuplicate.specialities.LocatorsCheckDuplicateSpecialities.MENU_RECEPTION_PLAN;
import static tests.checkDuplicate.specialities.LocatorsCheckDuplicateSpecialities.SUBMENU_ADD_SPECIALTIES;

public class CheckDuplicateSpecialities extends Base {

  @Test(priority = 2)
  @Description("Авторизация")
  @Severity(SeverityLevel.CRITICAL)
  public void auth() {
    Auth auth = new Auth(driver, wait);
    auth.login(
      "admin",
      "SKU46adm");
  }

  @Test(priority = 3)
  @Description("Переход в раздел специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void clickReceptionPlanMenu() {
    WebElement goToReceptionPlan = wait.until(ExpectedConditions.elementToBeClickable(MENU_RECEPTION_PLAN));
    goToReceptionPlan.click();
    WebElement goToAddSpecialties = wait.until(ExpectedConditions.elementToBeClickable(SUBMENU_ADD_SPECIALTIES));
    goToAddSpecialties.click();
  }

  @Test(priority = 4)
  @Description("Добавление специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void addSpecialty() {
    SpecialityPage specialityPage = new SpecialityPage(driver, wait);
    specialityPage.fillSpecialityPage();
  }

  @Test(priority = 5)
  @Description("Проверка специальности")
  @Severity(SeverityLevel.CRITICAL)
  public void specialtyCheck() throws InterruptedException {

    Thread.sleep(1000);

    String pageSource = driver.getPageSource();
    String expectedText = "В вашей организации уже создана специальность с такими параметрами.";

    Assert.assertNotNull(pageSource);
    if (!pageSource.contains(expectedText)) {
      Assert.fail("Проверка не пройдена: всплывающая подсказка -- '" + expectedText + "' не найдена");
    }
  }
}
