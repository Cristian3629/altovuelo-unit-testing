package com.despegar.altovuelo.report;

import org.springframework.stereotype.Component;

/**
 * 
 * @author draffaeli
 *
 */
@Component
public class AgeRangeCalculator {

	public String calculate(int age) {
		
		if (age <= 10) {
			return "Niño";
		}
		
		if (age <= 25) {
			return "Adolescente";
		}
		
		if (age <= 40) {
			return "Joven";
		}
		
		if (age <= 65) {
			return "Adulto";
		}
		
		return "Viejo";
	}
}
