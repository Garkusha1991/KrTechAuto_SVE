package tests.registration.registrationMandatoryFields.locators;

import org.openqa.selenium.By;

public class LocatorsExpected {
  // Step 1
  public static final By APPLICANT_LAST_NAME_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[1]/td/div[1]");
  public static final By APPLICANT_NAME_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[2]/td/div[1]");
  public static final By APPLICANT_SURNAME_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[3]/td/div[1]");
  public static final By APPLICANT_BIRTHDAY_DATE_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[5]/td/div[1]");
  public static final By APPLICANT_GENDER_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[4]/td/div[1]");
  public static final By APPLICANT_BIRTH_PLACE_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[6]/td/div[1]");
  public static final By APPLICANT_INDEX_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[7]/td/div[1]");
  public static final By APPLICANT_ADDRESS_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[8]/td/div[1]");
  public static final By APPLICANT_SNILS_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[9]/td/div[1]");
  public static final By APPLICANT_EMAIL_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[10]/td/div[1]");
  public static final By APPLICANT_PHONE_FIELD  = By.xpath("//*[@id=\"w2\"]/tbody/tr[11]/td/div[1]");

  // Step 2
  public static final By APPLICANT_TYPE_DOCUMENT_FIELD  = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[1]");
  public static final By APPLICANT_SERIES_DOCUMENT_FIELD  = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[2]");
  public static final By APPLICANT_NUMBER_DOCUMENT_FIELD  = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[3]");
  public static final By APPLICANT_DOCUMENT_ISSUED_FIELD  = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[4]");
  public static final By APPLICANT_DOCUMENT_ISSUE_DATE = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[5]");
  public static final By APPLICANT_DOCUMENT_DEPARTMENT_CODE = By.xpath("//*[@id=\"document-index-container\"]/table/tbody/tr/td[6]");

  // Step 3
  public static final By EDUCATION_DOCUMENT_ISSUED_FIELD = By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[4]");
  public static final By EDUCATION_DOCUMENT_SERIES_FIELD = By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[2]");
  public static final By EDUCATION_DOCUMENT_NUMBER_FIELD = By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[3]");
  public static final By EDUCATION_DOCUMENT_ISSUE_DATE_FIELD = By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[10]");
  public static final By RECEIVING_DOCUMENT_FIRST_FIELD = By.xpath("//*[@id=\"w7\"]/tbody/tr[5]/td/div[1]");
  public static final By EDUCATION_DOCUMENT_AVERAGE_SCORE_FIELD = By.xpath("//*[@id=\"education-document-index-container\"]/table/tbody/tr/td[8]");

  // Step 4
  public static final By ORGANIZATION_SVE_FIELD = By.xpath("//*[@id=\"w11\"]/tbody/tr[1]/td/div[1]");
  public static final By EDUCATION_LEVEL_FIELD = By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[5]");

  // Step 5
  public static final By LIST_SPECIALTIES_FIELD = By.xpath("//*[@id=\"statement-speciality-index-container\"]/table/tbody/tr/td[2]");

  // Step 6
  public static final By MATHEMATIC_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[1]/td[3]");
  public static final By COMPUTER_SCIENCE_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[2]/td[3]");
  public static final By PHYSICS_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[3]/td[3]");
  public static final By GEOGRAPHY_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[4]/td[3]");
  public static final By CHINESE_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[5]/td[3]");
  public static final By LITERATURE_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[6]/td[3]");
  public static final By SPANISH_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[7]/td[3]");
  public static final By GERMAN_SCORE_FIELD = By.xpath("//*[@id=\"statement-speciality-discipline-index-container\"]/table/tbody/tr[8]/td[3]");

  // Step_7
  // =============== Справка об инвалидности ===========
  public static final By SPECIAL_CONDITIONS_FORM_SERIAL_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[1]");
  public static final By SPECIAL_CONDITIONS_FORM_NUMBER_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[2]");
  public static final By SPECIAL_CONDITIONS_FORM_GROUP_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[3]");
  public static final By SPECIAL_CONDITIONS_FORM_REASON_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[4]");
  public static final By SPECIAL_CONDITIONS_FORM_DATE_START_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[5]");
  public static final By SPECIAL_CONDITIONS_FORM_ORGANIZATION_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[6]");
  public static final By SPECIAL_CONDITIONS_FORM_EXPIRATION_DATE_FIELD = By.xpath("//*[@id=\"certificate-disability-index-container\"]/table/tbody/tr/td[7]");
  // ==================Имеется преимущественное право (льгота) ================
  public static final By BENEFIT_1_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[1]/td[1]");
  public static final By BENEFIT_2_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[2]/td[1]");
  public static final By BENEFIT_3_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[3]/td[1]");
  public static final By BENEFIT_4_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[4]/td[1]");
  public static final By BENEFIT_5_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[5]/td[1]");
  public static final By BENEFIT_6_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[6]/td[1]");
  public static final By BENEFIT_7_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[7]/td[1]");
  public static final By BENEFIT_8_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[8]/td[1]");
  public static final By BENEFIT_9_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[9]/td[1]");
  public static final By BENEFIT_10_FIELD = By.xpath("//*[@id=\"benefits-index-container\"]/table/tbody/tr[10]/td[1]");
  // ==  Справка 086У ==
  public static final By REFERENCE_086U_SERIES_FIELD = By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[2]");
  public static final By REFERENCE_086U_NUMBER_FIELD = By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[3]");
  public static final By REFERENCE_086U_DATE_FIELD = By.xpath("//*[@id=\"reference-086u-index-container\"]/table/tbody/tr/td[6]");
  // == Специальные условия для ВИ ==
  public static final By SPECIAL_CONDITIONS_VI_FIELD = By.xpath("//*[@id=\"w11\"]/tbody/tr[2]/td/div[1]");
  public static final By INDIVIDUAL_ACHIEVEMENTS_FIELD = By.xpath("//*[@id=\"personal-achievement-index-container\"]/table/tbody/tr/td[1]");
  public static final By INDIVIDUAL_ACHIEVEMENTS_SCORE_FIELD = By.xpath("//*[@id=\"personal-achievement-index-container\"]/table/tbody/tr/td[2]");

  // Step_8
  public static final By LEGAL_REPRESENTATIVE_FIO_FIELD = By.xpath("//*[@id=\"w23\"]/tbody/tr[1]/td/div[1]");
  public static final By LEGAL_REPRESENTATIVE_PHONE_FIELD = By.xpath("//*[@id=\"w23\"]/tbody/tr[2]/td/div[1]");
  public static final By LEGAL_REPRESENTATIVE_EMAIL_FIELD = By.xpath("//*[@id=\"w23\"]/tbody/tr[3]/td/div[1]");
}
