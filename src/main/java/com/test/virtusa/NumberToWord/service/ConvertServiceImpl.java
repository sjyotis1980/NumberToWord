/**
 * 
 */
package com.test.virtusa.NumberToWord.service;

import org.springframework.stereotype.Service;

import com.test.virtusa.NumberToWord.numberConveter.IConveterMethod;
import com.test.virtusa.NumberToWord.utility.UtilsConverter;

/**
 * @author JyotiKumar
 *
 */
@Service
public class ConvertServiceImpl implements IConverterService {

	
	/* (non-Javadoc)
	 * @see com.test.virtusa.NumberToWord.service.IConverterService#convertNumberToWord(int)
	 */
	@Override
	public String convertNumberToWord(int number) {
		if (number < 0) throw new IllegalArgumentException("Please provide a positive number");
		IConveterMethod converter=UtilsConverter.getConverter(number);
		return  converter.convertNumber(number);
	}

}
