package constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang.RandomStringUtils;

public enum TestData {
	
	
	MOBILITYX_PAGETITLE("MobilityX"),
	USERNAME("username"),
	PASSWORD("password"),
	FIRSTNAME("TestFirstVs"),
	LASTNAME("TestLastVs"),
	HOW_TO_CREATE_AUTHORIZATION("Manually input employee information"),
	MANUALLY_INPUT_EMPLOYEE_INFORMATION("Manually input employee information"),
	AUTHORIZATION_FORM("Default Auth Form"),
	
	RELOCATION_POLICY("Short Term Assignment"),
	ORIGIN_ADDRESS("Origin Address-"),
	ORIGIN_CITY("Origin City-"),
	ORIGIN_STATE("Illinois"),
	ORIGIN_ZIP("60007"),
	ORIGIN_COUNTRY("USA"),
	DESTINATION_ADDRESS("Destination Address-"),
	DESTINATION_CITY("Destination City-"),
	DESTINATION_STATE("Pennsylvania"),
	DESTINATION_ZIP("19019"),
	DESTINATION_COUNTRY("USA"),
	NEW_JOB_TITLE("Test Engineer"),
	OFFICETELEPHONE("9292929233"),
	FAX_NUMBER("9292929244"),
	MOBILE_TELEPHONE_NUMBER("9292929255"),
	EMAIL_TYPE("Employee Personal"),
	TRANSFER_TYPE("New Hire"),
	HOME_STATUS("Renter"),
	ASSIGNMENT_TYPE("Short-Term EE Only"),
	COMMENT_MODIFICATION("New hire assignment authorization"),
	MARRITAL_STATUS("maritalStatus"),
	SINGLE("Single"),
	MARRIED("Married"),
	SPOUSE_NAME("Spouse "),
	SPOUSE_IS_PRIMARY_CONTACT_FOR_RELOCATION("No"),
	FAMILY_SIZE("3"),
	CHILDREN_NAME_AND_AGES(""),
	ALTERNATE_EMAIL_PART1("xyz"),
	ALTERNATE_EMAIL_PART2("@1234.com"),
	EMPLOYEE_ID("V18"),
	DEPARTMENT("Testing"),
	COST_CENTER("test"),
	GRADELEVEL("C4"),
	PO_NUMBER("10"),
	BUSINESS_GROUP("Relocation"),
	DIVISION("E"),
	COMPANY_NUMBER("11"),
	FILE_UPLOAD_PATH("/src/test/resources/TestData/test.txt"),
	TYPE_OF_CONTRIBUTION("Contribute to the authorization"),
	CONTRIBUTE_TO_AUTORIZATION("Contribute to the authorization"),
	CONTRIBUTOR_NAME("Test One"),
	SUBMIT_INITIATION_SUCCESS_MESSAGE("is in the submission process. You will receive an email notification when the initiation has been successfully submitted"),
	
	;
	
	
	public static String randString = RandomStringUtils.randomAlphabetic(6);
	public static String randNum = RandomStringUtils.random(3);
	public String data;
	TestData(String data) {
		this.data = data;
	}

}
