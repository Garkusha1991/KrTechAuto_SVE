package smoke.test.Registration.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainStep_1 {

  org.openqa.selenium.WebDriver driver;

  public static String snilsUsedInStep1;

  // Данные для передачи через конструктор
  private final String expectedApplicantLastName;
  private final String expectedApplicantName;
  private final String expectedApplicantSurname;
  private final String expectedApplicantBirthDate;
  private final String expectedApplicantGender;
  private final String expectedApplicantEmail;
  private final String expectedApplicantBirthPlace;
  private final String expectedApplicantAddress;
  private final String expectedApplicantIndex;
  private final String expectedApplicantPhone;
  private final String expectedSnils;

  public MainStep_1(WebDriver driver,
                    String expectedApplicantLastName,
                    String expectedApplicantName,
                    String expectedApplicantSurname,
                    String expectedApplicantBirthDate,
                    String expectedApplicantGender,
                    String expectedApplicantEmail,
                    String expectedApplicantBirthPlace,
                    String expectedApplicantAddress,
                    String expectedApplicantIndex,
                    String expectedSnils,
                    String expectedApplicantPhone) {
    this.driver = driver;
    this.expectedApplicantLastName = expectedApplicantLastName;
    this.expectedApplicantName = expectedApplicantName;
    this.expectedApplicantSurname = expectedApplicantSurname;
    this.expectedApplicantBirthDate = expectedApplicantBirthDate;
    this.expectedApplicantGender = expectedApplicantGender;
    this.expectedApplicantEmail = expectedApplicantEmail;
    this.expectedApplicantBirthPlace = expectedApplicantBirthPlace;
    this.expectedApplicantAddress = expectedApplicantAddress;
    this.expectedApplicantIndex = expectedApplicantIndex;
    this.expectedApplicantPhone = expectedApplicantPhone;
    this.expectedSnils = expectedSnils;
    MainStep_1.snilsUsedInStep1 = expectedSnils;
  }

  public void step_1() {
    // Фамилия
    driver.findElement(By.id("applicant-surname")).sendKeys(expectedApplicantLastName);
    // Имя
    driver.findElement(By.id("applicant-name")).sendKeys(expectedApplicantName);
    // Отчество
    driver.findElement(By.id("applicant-patronymic")).sendKeys(expectedApplicantSurname);
    // Дата рождения
    driver.findElement(By.id("applicant-birthdate")).sendKeys(expectedApplicantBirthDate + Keys.ENTER);
    // Выбор гендера
    driver.findElement(By.id("select2-applicant-gender_id-container")).click();
    driver.findElement(By.xpath("//*[@id='select2-applicant-gender_id-results']/li[1]")).click();
    // E-mail
    driver.findElement(By.id("applicant-email")).sendKeys(expectedApplicantEmail);
    // Место рождения
    driver.findElement(By.id("applicant-birthplace")).sendKeys(expectedApplicantBirthPlace);
    // Адрес регистрации
    driver.findElement(By.id("applicant-address")).sendKeys(expectedApplicantAddress);
    // Индекс
    driver.findElement(By.id("applicant-index")).sendKeys(expectedApplicantIndex);
    // СНИЛС
    driver.findElement(By.id("applicant-snils")).sendKeys(expectedSnils);
    // Телефон
    driver.findElement(By.id("applicant-phone")).sendKeys(expectedApplicantPhone);
    // Далее
    driver.findElement(
      By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[12]/div/div/div/button"))
      .click();
  }
}
