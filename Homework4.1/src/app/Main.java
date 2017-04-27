package app;

import controller.Controller;
import exception.GroupDoesNotExistException;
import exception.LoginIsNotAvailableException;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) throws GroupDoesNotExistException, LoginIsNotAvailableException{
		Model model = new Model();
		View view = new View();
		
		Controller controller = new Controller(model, view);
		controller.processUser();
	}
}
