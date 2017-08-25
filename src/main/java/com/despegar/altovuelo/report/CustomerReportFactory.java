package com.despegar.altovuelo.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @author draffaeli
 *
 */
@Component("customerReportFactory")
public class CustomerReportFactory {


	private AgeCalculator ageCalculator;
	private AgeRangeCalculator ageRangeCalculator;
	private CustomerTypeResolver customerTypeResolver;
	private ChineseZodiacResolver chineseZodiacResolver;
	private VerificationValueResolver verificationValueResolver;

	public CustomerReportFactory(AgeCalculator ageCalculator
			, AgeRangeCalculator ageRangeCalculator
			, CustomerTypeResolver customerTypeResolver
			, ChineseZodiacResolver chineseZodiacResolver
			, VerificationValueResolver verificationValueResolver) {
		this.ageCalculator = ageCalculator;
		this.ageRangeCalculator = ageRangeCalculator;
		this.customerTypeResolver = customerTypeResolver;
		this.chineseZodiacResolver = chineseZodiacResolver;
		this.verificationValueResolver = verificationValueResolver;
	}

	public CustomerReport create(List<Customer> customers) {

		CustomerReport report = new CustomerReport();
		for (Customer customer : customers) {
			CustomerReportLine line = new CustomerReportLine();

			line.setName(customer.getName().toUpperCase());
			line.setSurname(customer.getLastName().toUpperCase());
			int age = ageCalculator.calculate(customer.getBirthDate());
			line.setAge(age);
			line.setAgeRange(ageRangeCalculator.calculate(age));
			line.setCustomerType(customerTypeResolver.resolve(customer));
			line.setChineseZodiacSign(this.chineseZodiacResolver.resolve(customer.getBirthDate().getYear()));
			line.setVerificationValue(this.verificationValueResolver.resolve(customer));

			report.addLine(line);
		}

		return report;
	}
}
