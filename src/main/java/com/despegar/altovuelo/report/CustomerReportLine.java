package com.despegar.altovuelo.report;

/**
 * 
 * @author draffaeli
 *
 */
public class CustomerReportLine {

	private String name;
	private String surname;
	private int age;
	private String ageRange;
	private String customerType;
	private String chineseZodiacSign;
	private int verificationValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageCategory) {
		this.ageRange = ageCategory;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getChineseZodiacSign() {
		return chineseZodiacSign;
	}

	public void setChineseZodiacSign(String chineseZodiacSign) {
		this.chineseZodiacSign = chineseZodiacSign;
	}

	public int getVerificationValue() {
		return verificationValue;
	}

	public void setVerificationValue(int verificationValue) {
		this.verificationValue = verificationValue;
	}

	@Override
	public String toString() {
		return "CustomerReportLine [name=" + name + ", surname=" + surname
				+ ", age=" + age + ", ageCategory=" + ageRange
				+ ", customerType=" + customerType + ", chineseZodiacSign="
				+ chineseZodiacSign + ", verificationValue="
				+ verificationValue + "]";
	}

}
