package controller;

import view.View;
import model.*;
import java.util.Scanner;

import exception.GroupDoesNotExistException;
import exception.LoginIsNotAvailableException;

public class Controller {
	Model model;
	View view;
	
	public Controller (Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	public void processUser() throws GroupDoesNotExistException, LoginIsNotAvailableException{
		Note note = new Note();
		
		new UtilityController().inputUserInfo(note);
		model.setNote(note);
		view.printAllUserData(note);
	}
}
