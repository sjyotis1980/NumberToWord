/**
 * 
 */
package com.test.virtusa.NumberToWord.numberConveter;

/**
 * @author JyotiKumar
 *
 */
public class UnitsConvertMethod implements IConveterMethod {

	private static final String[] SINGLE_WORDS = {
			"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	
	/* (non-Javadoc)
	 * @see com.test.virtusa.NumberToWord.numberConveter.IConveterMethod#convertNumber(int)
	 */
	@Override
	public String convertNumber(int number) {
		if (number < 0 || number > 19) throw new IllegalArgumentException("Please provide a number between 0 and 19");
		return SINGLE_WORDS[number];
	}

}
