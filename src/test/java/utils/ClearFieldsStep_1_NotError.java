package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearFieldsStep_1_NotError {

  WebDriver driver;
  WebDriverWait wait;

  public ClearFieldsStep_1_NotError(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public void clearFieldsStep_1_NotError() {
    wait.until(ExpectedConditions.elementToBeClickable(By.id("applicant-surname"))).clear();
    driver.findElement(By.id("applicant-name")).clear();
    driver.findElement(By.id("applicant-patronymic")).clear();
    driver.findElement(By.id("applicant-birthdate")).clear();
    driver.findElement(By.xpath("//*[@id=\"select2-applicant-gender_id-container\"]/span")).click();
    driver.findElement(By.id("applicant-email")).clear();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("applicant-birthplace"))).clear();

    // Клик по Body
    driver.findElement(By.xpath("//*[@id=\"msform\"]/div[7]/label")).click();

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='msform']/div[7]"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"msform\"]/div[7]/div")))
      .click();
    driver.findElement(By.id("applicant-address")).clear();
    driver.findElement(By.id("applicant-index")).clear();
    driver.findElement(By.id("applicant-snils")).clear();
    driver.findElement(By.id("applicant-phone")).clear();
  }
}




