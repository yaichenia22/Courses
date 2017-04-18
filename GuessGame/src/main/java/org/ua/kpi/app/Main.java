package org.ua.kpi.app;

import org.ua.kpi.app.Controller;
import org.ua.kpi.app.Model;
import org.ua.kpi.app.View;

public class Main {

	public static void main(String[] args) {
		// Initialization
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
			
		//Run
		controller.processUser();
	}

}
