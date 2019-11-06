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
public class MillionsNumberConverter implements IConveterMethod {
	
	private static final Position POSITION = Position.MILLIONS;

	/* (non-Javadoc)
	 * @see com.test.virtusa.NumberToWord.numberConveter.IConveterMethod#convertNumber(int)
	 */
	@Override
	public String convertNumber(int number) {
		StringBuilder stringBuilder = new StringBuilder();


		stringBuilder.append(UtilsConverter.convertQuotient(number, POSITION.getValue()));

		stringBuilder.append(POSITION.getName());

		if (number % POSITION.getValue() > 0)
		{
			stringBuilder.append(" and ").append(UtilsConverter.convertRemainder(number, POSITION.getValue()));
		}
		return stringBuilder.toString();
	}

}
