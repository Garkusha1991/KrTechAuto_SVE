package setup;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.JsonUtils;

public class BaseSteps{

  protected WebDriver driver;
  protected WebDriverWait wait;

  protected TestData data = JsonUtils.readTestData("TestData.json");
}
