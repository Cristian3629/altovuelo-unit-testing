package com.despegar.altovuelo.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * 
 * @author draffaeli
 *
 */
@Component
public class VerificationValueResolver {

	private BinaryGap binaryGap;

	public VerificationValueResolver(BinaryGap binaryGap) {
		this.binaryGap = binaryGap;
	}

	public int resolve(Customer customer) {
		LocalDate birthDate = customer.getBirthDate();
		int value = birthDate.getDayOfMonth() + birthDate.getMonthValue() + birthDate.getYear();
		
		return binaryGap.perform(value)*value;
	}

	@Autowired
	public void setBinaryGap(BinaryGap binaryGap) {
		this.binaryGap = binaryGap;
	}
}
