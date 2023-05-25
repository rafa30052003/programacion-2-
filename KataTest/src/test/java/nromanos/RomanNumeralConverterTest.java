package nromanos;


import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import model.RomanNumeralConverter;
class RomanNumeralConverterTest {
			
	@Test
	void testNromanos() { 
		assertEquals("I", RomanNumeralConverter.convertToRomanNumeral(1));
	}
	
}
