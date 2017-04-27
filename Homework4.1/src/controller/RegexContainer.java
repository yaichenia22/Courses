package controller;

public class RegexContainer {
	static String REG_NAME = "^[A-Z][a-z]+$";
	static String REG_LAST_NAME = "^[A-Z][a-z]+$";
	static String REG_EMAIL = "([A-Z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}";
	static String REG_LOGIN = "^[a-z0-9_]{3,15}$";
	static String REG_COMMENTS = "([A-Z](([A-z0-9]){0,}([\\,]){0,1}([\\s]){0,1})+((\\.|\\!|\\?)([\\s]){0,1}))+";
	static String REG_GROUP = "^[A-z0-9-\\s]+$";
	static String REG_MOBILE_FIRST_NUMBER = "^380([0-9]){9}$";
	static String REG_MOBILE_SECOND_NUMBER = "^((380([0-9]){9})|)$";
	static String REG_HOME_PHONE = "^([0-9]){3}-([0-9]){2}-([0-9]){2}$";
	static String REG_SKYPE = "^[a-z0-9_]{3,15}$";
	static String REG_INDEX = "^([0-9]){5}$";
	static String REG_STREET = "^[A-Z][a-z]+$";
	static String REG_CITY = "^[A-Z][a-z]+$";
	static String REG_FLAT = "^([0-9]){1,3}$";
	static String REG_HOME_NUMBER = "^([0-9]){1,3}$";
}
