/**
 * 
 */
package com.test.virtusa.NumberToWord.model;

/**
 * @author JyotiKumar
 *
 */
public enum Position {
	
	TENS(10,"Tens"), HUNDREDS(100," Hundred"), THOUSANDS(1000," Thousand"), MILLIONS(1000000," Million");

	private String name;
	private int value;
	
	
	/**
	 * @param name
	 * @param value
	 */
	Position(final int value, String name) {
		this.setValue(value);
		this.setName(name);
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	
	
}
