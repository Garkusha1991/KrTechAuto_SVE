/** Запуск страницы https://beta.rkspo.ru/user/login*/

package setup;

import org.openqa.selenium.WebDriver;

public class LoadPage {
  private final WebDriver driver;

  public LoadPage(WebDriver driver) {
    this.driver = driver;
  }

  public void loadPage() {
    driver.get("https://beta.rkspo.ru/user/login");
  }
}
