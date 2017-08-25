package com.despegar.altovuelo.report;

import org.springframework.stereotype.Component;

/**
 * 
 * @author draffaeli
 *
 */
@Component
public class ChineseZodiacResolver {

	private String[] chineseZodiac = new String[] {
        "Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon",
        "Snake","Horse","Sheep"
    };
	
	public String resolve(int year) {
		return chineseZodiac[year%12];
	}
}
