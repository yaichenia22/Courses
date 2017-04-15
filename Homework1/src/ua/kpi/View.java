package ua.kpi;

public class View {
		//Text constants
		public static final String INPUT_WORD_1 = "Input WORD_1 =";
		public static final String INPUT_WORD_2 = "Input WORD_2 =";
		public static final String OUR_SENTENCE = "Sentence = ";
		public static final String WRONG_INPUT = "Wrong input! Repeat please!";
		
		public void printMessage(String message){
			System.out.println(message);
		}
		
		public void printMessageAndString(String message, String value){
			System.out.println(message + value);
		}
		
		public void printSentence (String sentence){
			System.out.println(View.OUR_SENTENCE + sentence);
		}
}
