package org.ua.kpi.test;

import org.junit.Assert;
import org.junit.Test;
import org.ua.kpi.app.Model;

public class TestModel {

	@Test
	public void testRand(){
		int minValue = 0;
        int maxValue = 100;
        Model model = new Model();
        int result = model.rand(minValue, maxValue);
        Assert.assertTrue(result < maxValue && result >= minValue);
	}
	
	@Test
	public void testAddingToArray(){
		Model model = new Model();
		int firstSize = model.getNumerics().size();
		model.addToEndOfNumerics(100);
		int secondSize = model.getNumerics().size();
		Assert.assertEquals(firstSize + 1, secondSize);
	}
	
	@Test
	public void testCheckingForEquals(){
		Model model = new Model();
		int expected = model.getThinkedNumeric();
		model.checkNumeric(expected);
		Assert.assertTrue(model.getPlayerWon());
	}
}
