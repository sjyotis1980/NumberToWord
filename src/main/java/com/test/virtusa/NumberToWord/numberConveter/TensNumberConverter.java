/**
 * 
 */
package com.test.virtusa.NumberToWord.numberConveter;

import com.test.virtusa.NumberToWord.model.Position;
import com.test.virtusa.NumberToWord.utility.UtilsConverter;

/**
 * @author JyotiKumar
 *
 */
public class TensNumberConverter implements IConveterMethod {

	//Starts from Index 2 (20/10).
		//Hence filling 0 and 1 with ""
		private final String[] TENS_WORDS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		
		private static final Position POSITION = Position.TENS;
		
	
	/* (non-Javadoc)
	 * @see com.test.virtusa.NumberToWord.numberConveter.IConveterMethod#convertNumber(int)
	 */
	@Override
	public String convertNumber(int number) {
		
		StringBuilder word = new StringBuilder(TENS_WORDS[number/POSITION.getValue()]);
		if (number % POSITION.getValue() > 0)
		{
			word.append(" ").append(UtilsConverter.convertRemainder(number,POSITION.getValue()));
		}
		return word.toString();
	}

}
