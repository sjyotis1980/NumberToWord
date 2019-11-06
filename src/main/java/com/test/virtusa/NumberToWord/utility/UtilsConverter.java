/**
 * 
 */
package com.test.virtusa.NumberToWord.utility;

import com.test.virtusa.NumberToWord.numberConveter.*;

/**
 * @author JyotiKumar
 *
 */
public class UtilsConverter {
	
	private static final IConveterMethod UNITS_CONVERTER     = new UnitsConvertMethod();
	private static final IConveterMethod TENS_CONVERTER      = new TensNumberConverter();
	private static final IConveterMethod HUNDREDS_CONVERTER  = new HundredsNumberConverter();
	private static final IConveterMethod THOUSANDS_CONVERTER = new ThousandsNumberConverter();
	private static final IConveterMethod MILLIONS_CONVERTER  = new MillionsNumberConverter();
	
	/**
	 * This method returns the converter based on the number
	 *
	 * @return @link{IConveterMethod}
	 */
	public static IConveterMethod getConverter(int number)
	{
		if (number < 20) return UNITS_CONVERTER;
		else if (number < 100) return TENS_CONVERTER;
		else if (number < 1000) return HUNDREDS_CONVERTER;
		else if (number < 1000000) return THOUSANDS_CONVERTER;
		else if (number < 1000000000) return MILLIONS_CONVERTER;
		throw new IllegalArgumentException("maximum number supported is 999999999");
	}

	public static String convertRemainder(int number, int value) {

		int remainder=number%value;
		return getConverter(remainder).convertNumber(remainder);
	}

	public static String convertQuotient(int number, int value) {

		int quotient=number/value;
		IConveterMethod converter=getConverter(quotient);
		return converter.convertNumber(quotient);
	}

}
