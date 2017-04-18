package org.ua.kpi.app;

import java.util.Scanner;

import org.ua.kpi.app.Model;
import org.ua.kpi.app.View;

public class Controller {
	Model model;
	View view;

	// Constructor
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	// The Work method
	public void processUser(){
		Scanner sc = new Scanner(System.in);	
		
		while (!model.getPlayerWon())
			model.checkNumeric(inputNumericWithScanner(sc));
		view.printCongratulationAndStatistic(model.getNumerics());
	}
	
	// The Utility methods
	public int inputNumericWithScanner(Scanner sc){
		view.printMessageOfInputInteger(model.getMinValue(), model.getMaxValue());
		int num = 0;
		while (true) {
			if (!sc.hasNextInt()){
				view.printMessageOfWrongInput(model.getMinValue(), model.getMaxValue());
				sc.next();
			}
			else{
				num = sc.nextInt();
				if ((num > model.getMaxValue()) || (num < model.getMinValue())){
					view.printMessageOfWrongInput(model.getMinValue(), model.getMaxValue());
				}
				else
					break;
			}
		}
		return num;
	}
}