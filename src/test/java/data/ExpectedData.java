package data;

import utils.*;

import java.util.Arrays;

public class ExpectedData {
  static TestData data = JsonUtils.readTestData("TestData.json");

  // Step 1
  public static String expectedApplicantLastName = data.step_1.lastName;
  public static String expectedApplicantName = data.step_1.name;
  public static String expectedApplicantSurname = data.step_1.patronymic;
  public static String expectedApplicantBirthDate = data.step_1.birthDate;
  public static String expectedApplicantGender = data.step_1.gender;
  public static String expectedApplicantEmail = data.step_1.email;
  public static String expectedApplicantBirthPlace = data.step_1.birthPlace;
  public static String expectedApplicantAddress = data.step_1.address;
  public static String expectedApplicantIndex = data.step_1.index;
  public static String expectedApplicantPhone = data.step_1.phone;

  // Step 2
  public static String expectedApplicantTypeOfDocument = data.step_2.documentType;
  public static String expectedDocumentIssued = data.step_2.documentIssued;
  public static String expectedDocumentIssueDate = data.step_2.documentIssueDate;
  public static String expectedDocumentDepartmentCode = data.step_2.documentDepartmentCode;

  // Step 3
  public static String expectedEducationDocumentIssued = data.step_3.educationDocumentIssued;
  public static String expectedEducationDocumentSeries = data.step_3.educationDocumentSeries;
  public static String expectedEducationDocumentNumber = data.step_3.educationDocumentNumber;
  public static String expectedEducationDocumentIssueDate = data.step_3.educationDocumentIssueDate;

  // Step 4
  public static String expectedSPOOrganisation = data.step_4.spoOrganisation;
  public static String expectedEducationLevel = data.step_4.educationLevel;

  // Step 5
  public static String expectedListSpecialties = data.step_5.speciality;

  // Step 6
  public static String expectedMathematicsScore = data.step_6.mathematics;
  public static String expectedComputerScienceScore  = data.step_6.computerScience;
  public static String expectedPhysicsScore  = data.step_6.physics;
  public static String expectedGeographyScore  = data.step_6.geography;
  public static String expectedChineseScore  = data.step_6.chinese;
  public static String expectedLiteratureScore  = data.step_6.literature;
  public static String expectedSpanishScore  = data.step_6.spanish;
  public static String expectedGermanScore  = data.step_6.german;

  // Step 7
  // ====== Справка об инвалидности ====
  public static String expectedSpecialConditionsFormSerial = data.step_7.disabilityCertificate.series;
  public static String expectedSpecialConditionsFormNumber = data.step_7.disabilityCertificate.number;
  public static String expectedSpecialConditionsFormGroup = data.step_7.disabilityCertificate.group;
  public static String expectedSpecialConditionsFormReason = data.step_7.disabilityCertificate.reason;
  public static String expectedSpecialConditionsFormIssued = data.step_7.disabilityCertificate.issued;
  public static String expectedSpecialConditionsFormIssueDate = data.step_7.disabilityCertificate.issueDate;
  public static String expectedSpecialConditionsFormExpirationDate = data.step_7.disabilityCertificate.expirationDate;
  // ======= Льгота ==========
  public static String expectedBenefit_1 = data.step_7.benefits.benefit_1;
  public static String expectedBenefit_2 = data.step_7.benefits.benefit_2;
  public static String expectedBenefit_3 = data.step_7.benefits.benefit_3;
  public static String expectedBenefit_4 = data.step_7.benefits.benefit_4;
  public static String expectedBenefit_5 = data.step_7.benefits.benefit_5;
  public static String expectedBenefit_6 = data.step_7.benefits.benefit_6;
  public static String expectedBenefit_7 = data.step_7.benefits.benefit_7;
  public static String expectedBenefit_8 = data.step_7.benefits.benefit_8;
  public static String expectedBenefit_9 = data.step_7.benefits.benefit_9;
  public static String expectedBenefit_10 = data.step_7.benefits.benefit_10;
  // ====== Справка по форме 086/у ===========
  public static String expectedReference_086USeries = data.step_7.reference086u.o86uSeries;
  public static String expectedReference_086UNumber = data.step_7.reference086u.o86uNumber;
  public static String expectedReference_086UDate = data.step_7.reference086u.o86uDate;

  // ====== Специальные условия ВИ ====
  public static String getExpectedConditions(SpecialConditions cond) {
    return Arrays.toString(ConditionUtils.toArray(cond));
  }
  public static String expectedConditions =  ExpectedData.getExpectedConditions(data.step_7.specialConditions);;

  // ====== Индивидуальные достижения ====
  public static String expectedIndividualAchievements = data.step_7.individualAchievements.iAch_1;
  public static String expectedIndividualAchievementsScore_1 = data.step_7.individualAchievements.score_1;

  // Step 8
  public static String expectedLegalRepresentativeFio = data.step_8.legalRepresentative.fio;
  public static String expectedLegalRepresentativePhone = data.step_8.legalRepresentative.phone;
  public static String expectedLegalRepresentativeEmail = data.step_8.legalRepresentative.email;
}
