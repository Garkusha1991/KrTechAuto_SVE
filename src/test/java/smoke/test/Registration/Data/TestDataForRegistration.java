package smoke.test.Registration.Data;

import utils.GenerateRandomSnils;
import utils.GenerateRandomSeries;
import utils.GenerateRandomNumber;

import utils.GradeGenerator;

public class TestDataForRegistration {

  // Step 1
  public static String expectedApplicantLastName = "Test Фамилия";
  public static String expectedApplicantName = "Test Имя";
  public static String expectedApplicantSurname = "Test Отчество";
  public static String expectedApplicantBirthDate = "21.05.2020";
  public static String expectedApplicantGender = "мужской";
  public static String expectedApplicantEmail = "expected.email@ya.ru";
  public static String expectedApplicantBirthPlace = "Место-рождения";
  public static String expectedApplicantAddress = "Адрес регистрации";
  public static String expectedApplicantIndex = "111111";
  public static String getExpectedApplicantSnils() {
    return GenerateRandomSnils.generateRandomSnils();
  }
  public static String expectedApplicantPhone = "(888)-888-88-88";

  // Step 2
  public static String expectedApplicantTypeOfDocument = "Паспорт гражданина Российской Федерации";
  public static String getExpectedDocumentSeries() {
    return GenerateRandomSeries.generateRandomSeries();
  }
  public static String getExpectedDocumentNumber() { return GenerateRandomNumber.generateRandomNumber(); }
  public static String expectedDocumentIssued = "Кем выдан";
  public static String expectedDocumentIssueDate = "23.05.2020";
  public static String expectedDocumentDepartmentCode = "000001";

  // Step 3
  public static String expectedEducationDocumentIssued = "Документ выдан тестовой организацией";
  public static String expectedEducationDocumentSeries = "1234";
  public static String expectedEducationDocumentNumber = "123456";
  public static String expectedEducationDocumentIssueDate = "01.01.2025";
  public static String expectedEducationDocumentNumberFives = GradeGenerator.generateFives();
  public static String expectedEducationDocumentNumberFours= GradeGenerator.generateFours();
  public static String expectedEducationDocumentNumberThrees = GradeGenerator.generateThrees();

  // Step 4
  public static String expectedSPOOrganisation = "Государственное бюджетное профессиональное образовательное учреждение Республики Крым «Симферопольский автотранспортный техникум»";
  public static String expectedEducationLevel = "Основное общее (9 классов)";

  // Step 5
  public static String expectedListSpecialties = "08.02.12 Строительство и эксплуатация автомобильных дорог, аэродромов и городских путей сообщения";

  // Step 6
  public static String expectedMathematicsScore = "1";
  public static String expectedComputerScienceScore  = "2";
  public static String expectedPhysicsScore  = "3";
  public static String expectedGeographyScore  = "4";
  public static String expectedChineseScore  = "5";
  public static String expectedLiteratureScore  = "6";
  public static String expectedSpanishScore  = "7";
  public static String expectedGermanScore  = "8";

  // Step 7
  // ====== Справка об инвалидности ====
  public static String expectedSpecialConditionsFormSerial = "Серия-справки";
  public static String expectedSpecialConditionsFormNumber = "Номер-справки";
  public static String expectedSpecialConditionsFormGroup = "Группа-справки";
  public static String expectedSpecialConditionsFormReason = "Причина-справки";
  public static String expectedSpecialConditionsFormIssued = "Наименование организации, выдавшей справку";
  public static String expectedSpecialConditionsFormIssueDate= "01.01.2025";
  public static String expectedSpecialConditionsFormExpirationDate = "01.01.2050";
  // ======= Льгота ==========
  public static String expectedBenefit_1 = "Герои России и обладатели трёх орденов Мужества";
  public static String expectedBenefit_2 = "Участники боевых действий и служащие на территориях проведения специальной военной операции (СВО) и граничащих с ними, а также их дети";
  public static String expectedBenefit_3 = "Ветераны и участники боевых действий — кроме участников СВО";
  public static String expectedBenefit_4 = "Военнослужащие и сотрудники силовых ведомств — кроме участников СВО";
  public static String expectedBenefit_5 = "Дети военнослужащих и сотрудников силовых ведомств — кроме детей участников СВО";
  public static String expectedBenefit_6 = "Дети участников боевых действий за границей";
  public static String expectedBenefit_7 = "Дети умерших от COVID-19 медработников";
  public static String expectedBenefit_8 = "Дети-сироты и дети, оставшиеся без попечения родителей";
  public static String expectedBenefit_9 = "Дети-инвалиды";
  public static String expectedBenefit_10 = "Люди с инвалидностью I или II группы";
  // ====== Справка по форме 086/у ===========
  public static String expectedReference_086USeries = "Серия-справки 086у";
  public static String expectedReference_086UNumber = "Номер-справки 086у";
  public static String expectedReference_086UDate = "01.01.2025";
  // ====== Специальные условия ВИ ====
  public static String expectedSpecialConditionsVI = "Для слепых";
  // ====== Индивидуальные достижения ====
  public static String expectedIndividualAchievements = "Победа в олимпиадах или иных конкурсах";
  public static String expectedIndividualAchievementsScore = "777";

  // Step 8
  public static String expectedLegalRepresentativeFio = "Фамилия Имя Отчество";
  public static String expectedLegalRepresentativePhone = "(978)-555-88-77";
  public static String expectedLegalRepresentativeEmail = "Example@ya.ru";
}


