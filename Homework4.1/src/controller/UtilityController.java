package controller;

import java.util.Scanner;
import view.MessageConstants;
import view.View;
import java.util.regex.Pattern;

import exception.GroupDoesNotExistException;
import exception.LoginIsNotAvailableException;

import java.util.regex.Matcher;
import model.Note;
import java.util.Date;

public class UtilityController {
	
	public String inputCorrectDataWithScanner(String regex, String errorMessage){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        while(!checkDataWithRegex(str, regex)){
            View.printMessage(errorMessage);
            str = sc.nextLine();
        }
        return str;
    }
	
	public void inputCorrectGroupWithScanner(Note note){
		MessageConstants messages = new MessageConstants();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        while((!checkDataWithRegex(str, RegexContainer.REG_GROUP)) || checkOrSetGroup(note, str)){
            View.printMessage(messages.WRONG_GROUP_INPUT);
            str = sc.nextLine();
        }
    }
	
	public void inputCorrectLoginWithScanner(Note note){
		MessageConstants messages = new MessageConstants();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean exp1;
		boolean exp2 = false;
        while((exp1 = !checkDataWithRegex(str, RegexContainer.REG_LOGIN)) || (exp2 = checkOrSetLogin(note, str))){
            if (exp1)
        		View.printMessage(messages.WRONG_LOGIN_INPUT_ON_REGEX);
            if (exp2)
        		View.printMessage(messages.WRONG_LOGIN_INPUT_ON_EXCEPT);
            str = sc.nextLine();
            exp2 = false;
        }
    }

    public boolean checkDataWithRegex(String stringToCheck, String regex){
        Pattern pt = Pattern.compile(regex);
        Matcher m = pt.matcher(stringToCheck);
        return m.matches();
    }
    
    //If this method returns TRUE, it means that argument "group" was not founded
    //in Group list and Exception was caught, else "group" was founded.
    public boolean checkOrSetGroup(Note note, String group){
    	try{
    		note.setGroup(group);
        	return false;
    	} catch (GroupDoesNotExistException e){
    		return true;
    	}
    }
    
    //If this method returns TRUE, it means that argument "login" is not available
    //and Exception was caught, else "login" is available.
    public boolean checkOrSetLogin(Note note, String login){
    	try{
    		note.setNickName(login);
        	return false;
    	} catch (LoginIsNotAvailableException e){
    		return true;
    	}
    }
    
    public void inputUserInfo(Note note) throws GroupDoesNotExistException, LoginIsNotAvailableException{
    	MessageConstants messages = new MessageConstants();
    	
        View.printMessage(messages.INPUT_FIRST_NAME);
        note.setFirstName(inputCorrectDataWithScanner(RegexContainer.REG_NAME, messages.WRONG_NAME_INPUT));
        View.printMessage(messages.INPUT_LAST_NAME);
        note.setLastName(inputCorrectDataWithScanner(RegexContainer.REG_LAST_NAME, messages.WRONG_NAME_INPUT));
        View.printMessage(messages.INPUT_PATRONYMIC_NAME);
        note.setMiddleName(inputCorrectDataWithScanner(RegexContainer.REG_NAME, messages.WRONG_NAME_INPUT));
        View.printMessage(messages.INPUT_NICKNAME);
        inputCorrectLoginWithScanner(note);
        View.printMessage(messages.INPUT_COMMENTS);
        note.setComments(inputCorrectDataWithScanner(RegexContainer.REG_COMMENTS, messages.WRONG_COMMENT_INPUT));
        View.printMessage(messages.INPUT_GROUP);
        inputCorrectGroupWithScanner(note);
        View.printMessage(messages.INPUT_PHONE_NUMBER_HOME);
        note.setHomePhoneNumber(inputCorrectDataWithScanner(RegexContainer.REG_HOME_PHONE, messages.WRONG_HOME_NUMBER_INPUT));
        View.printMessage(messages.INPUT_PHONE_NUMBER_MOBILE);
        note.setFirstPhoneNumber(inputCorrectDataWithScanner(RegexContainer.REG_MOBILE_FIRST_NUMBER, messages.WRONG_NUMBER_INPUT));
        View.printMessage(messages.INPUT_PHONE_NUMBER_MOBILE_2);
        note.setSecondPhoneNimber(inputCorrectDataWithScanner(RegexContainer.REG_MOBILE_SECOND_NUMBER, messages.WRONG_NUMBER_INPUT));
        View.printMessage(messages.INPUT_EMAIL);
        note.setEmail(inputCorrectDataWithScanner(RegexContainer.REG_EMAIL, messages.WRONG_EMAIL_INPUT));
        View.printMessage(messages.INPUT_SKYPE);
        note.setSkypeID(inputCorrectDataWithScanner(RegexContainer.REG_SKYPE, messages.WRONG_LOGIN_INPUT_ON_REGEX));
        View.printMessage(messages.INPUT_ADDRESS);
        View.printMessage(messages.INPUT_INDEX);
        note.setZipCode(inputCorrectDataWithScanner(RegexContainer.REG_INDEX, messages.WRONG_INDEX));
        View.printMessage(messages.INPUT_CITY);
        note.setCity(inputCorrectDataWithScanner(RegexContainer.REG_CITY, messages.WRONG_CITY_INPUT));
        View.printMessage(messages.INPUT_STREET);
        note.setStreet(inputCorrectDataWithScanner(RegexContainer.REG_STREET, messages.WRONG_STREET_INPUT));
        View.printMessage(messages.INPUT_HOUSE_NUMBER);
        note.setHouseNumber(inputCorrectDataWithScanner(RegexContainer.REG_HOME_NUMBER, messages.WRONG_HOUSE_NUMBER));
        View.printMessage(messages.INPUT_FLAT_NUMBER);
        note.setFlatNumber(inputCorrectDataWithScanner(RegexContainer.REG_FLAT, messages.WRONG_FLAT_INPUT));
        
        Date date = new Date();
        note.setDateOfEntry(date.toString());
        note.setDateOfLastChange(date.toString());
    }
}
