package com.despegar.altovuelo.report;

import org.springframework.stereotype.Component;

/**
 * 
 * @author draffaeli
 *
 */
@Component
public class CustomerTypeResolver {

    public String resolve(Customer customer) {
    	
    	int n = customer.getName().length() + customer.getLastName().length();
    	
        String ret = "";
        
        if (n % 3 == 0) {
            ret += "Wind";
        }
        
        if (n % 5 == 0) {
            ret += "Son";
        }
        
        if (n % 7 == 0) {
            ret += "God";
        }
        
        if (ret == "") {
            ret = "Cann";
        }
        
        return ret;
    }
	
}
