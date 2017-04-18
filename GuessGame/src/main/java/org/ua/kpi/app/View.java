package org.ua.kpi.app;

import java.util.ArrayList;

public class View {
	//String constants
	private final String INPUT_INTEGER = "Please, input Integer in range ";
	private final String WRONG_INPUT = "Wrong input!";
	private final String CONGRATULATION = "Congratulations! You won!";
	
	//Methods for printing messages
	public void printMessageOfInputInteger(int min, int max){
		System.out.println(INPUT_INTEGER + rangeOfNumber(min, max) + ":");
	}
	public void printMessageOfWrongInput(int min, int max){
		System.out.println(WRONG_INPUT + " " +INPUT_INTEGER + rangeOfNumber(min, max) + ":");
	}
	
	public String rangeOfNumber(int min, int max){
		return ("from " + min + " to " + max);
	}
	
	public void printCongratulationAndStatistic(ArrayList<Integer> numbers){
		System.out.print(CONGRATULATION + " You inputted next numbers:");
		for (int i = 0; i <= numbers.size() - 1; i++)
			System.out.print(" " + numbers.get(i).toString());
		System.out.print(";");
	}
}