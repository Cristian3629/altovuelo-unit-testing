package com.despegar.altovuelo.report;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author draffaeli
 *
 */
@Component
public class AgeCalculator {

	public int calculate(LocalDate birthdate) {
		return Period.between(birthdate, LocalDate.now()).getYears();
	}
	
}
