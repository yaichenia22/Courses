package org.ua.kpi.app;

import java.util.ArrayList;
import java.util.Random;

public class Model {
	//Fields
	private final int thinkedNumeric;
	private ArrayList<Integer> numerics;
	boolean playerWon;
	int minValue;
	int maxValue;
	
	//Constructors
	public Model (){
		thinkedNumeric = rand(Constants.FIRST_MIN_VALUE, Constants.FIRST_MAX_VALUE);
		numerics = new ArrayList<Integer>();
		playerWon = false;
		minValue = Constants.FIRST_MIN_VALUE;
		maxValue = Constants.FIRST_MAX_VALUE;
	}
	
	//Getters and Setters
	public void setMinValue(int number){
		minValue = number;
	}
	public int getMinValue(){
		return minValue;
	}
	
	public void setMaxValue(int number){
		maxValue = number;
	}
	public int getMaxValue(){
		return maxValue;
	}
	
	public void setPlayerWon(boolean expression){
		playerWon = expression;
	}
	public boolean getPlayerWon(){
		return playerWon;
	}
	
	public ArrayList<Integer> getNumerics(){
		return numerics;
	}
	
	public void addToEndOfNumerics(int number){
		numerics.add(new Integer(number));
	}
	
	public int getThinkedNumeric(){
		return thinkedNumeric;
	}
	
	//Rand function
	public int rand(){
		return new Random().nextInt(Integer.MAX_VALUE + 1);
	}
	public int rand(int min, int max){
		return (new Random().nextInt(max + 1) + min);
	}
	
	//Game logic
	public void checkNumeric(int numeric){
		int thinkedNum = getThinkedNumeric();
		
		if(numeric == thinkedNum)
			setPlayerWon(true);
		else{
			if(numeric > thinkedNum)
				setMaxValue(numeric - 1);
			else
				setMinValue(numeric + 1);
		}
		addToEndOfNumerics(numeric);
	}
}