/**
 * Авторизация
 * Логин и пароль указываются в документе, где используется эта функция. в Registration
 */

package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Auth {
  private final WebDriver driver;
  private final WebDriverWait wait;

  public Auth(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  public void login(String username, String password) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-form-login"))).sendKeys(username);
    driver.findElement(By.id("login-form-password")).sendKeys(password);
    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/div[2]/button")).click();
  }
}






