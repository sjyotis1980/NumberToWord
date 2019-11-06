/**
 * 
 */
package com.test.virtusa.NumberToWord.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.virtusa.NumberToWord.exception.DataNotFoundException;
import com.test.virtusa.NumberToWord.service.IConverterService;
import org.apache.commons.lang3.StringUtils;

/**
 * @author JyotiKumar
 *
 */
@RestController
@RequestMapping("/api/test")
public class ConverterController {
	
	@Autowired
	IConverterService iConverterService;

	@GetMapping("/convertnumber/{number}")
	public ResponseEntity<String> candidateData(@PathVariable(name = "number") Integer number) 
			throws DataNotFoundException {
		String resultMsg = iConverterService.convertNumberToWord(number);
		if (StringUtils.isEmpty(resultMsg))
			throw new DataNotFoundException("Invalid Number");

		return new ResponseEntity<String>(resultMsg, HttpStatus.OK);

	}

}
