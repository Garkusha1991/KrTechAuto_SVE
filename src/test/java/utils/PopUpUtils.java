/** Переиспользуемая функция для проверки найденных pop-UP по тексту */

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.BaseSteps;

import java.time.Duration;
import java.util.List;
public class PopUpUtils extends BaseSteps {

  public PopUpUtils(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void assertPopUpContainsText(String expectedPopUp) throws InterruptedException {

    boolean found = wait
      .withTimeout(Duration.ofSeconds(20))
      .until(driver -> {
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), '" + expectedPopUp + "')]"));
        for (WebElement el : elements) {
          if (el.isDisplayed()) {
            return true;
          }
        }
        return false;
      });

    Assert.assertTrue(found, "Подсказка с текстом '" + expectedPopUp + "' не найдена на странице");
  }
}
