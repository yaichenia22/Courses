package ua.kpi;

import java.util.Scanner;

public class Controller {
	// The Constants
	public static final String WORD_1 = "Hello";
	public static final String WORD_2 = "world!";
	
	// Constructor
	Model model;
	View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	// The Work method
	public void processUser(){
		Scanner sc = new Scanner(System.in);
		
		model.setSentence(inputWord1WithScanner(sc) + " " + inputWord2WithScanner(sc));
		
		view.printSentence(model.getSentence());
	}
	
	// The Utility methods
	public String inputWord1WithScanner(Scanner sc){
		view.printMessage(View.INPUT_WORD_1);
		String str = sc.nextLine();
		while ( !str.equals(WORD_1)) {
			view.printMessage(View.WRONG_INPUT + View.INPUT_WORD_1);
			str = sc.nextLine();
		}
		return str;
	}
	
	public String inputWord2WithScanner(Scanner sc){
		view.printMessage(View.INPUT_WORD_2);
		String str = sc.nextLine();
		while ( !str.equals(WORD_2)) {
			view.printMessage(View.WRONG_INPUT + View.INPUT_WORD_2);
			str = sc.nextLine();
		}
		return str;
	}
}
