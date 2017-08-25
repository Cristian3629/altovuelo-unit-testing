package com.despegar.altovuelo;


import com.despegar.altovuelo.report.AppConfiguration;
import com.despegar.altovuelo.report.Customer;
import com.despegar.altovuelo.report.CustomerReportFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;

public class App{
    public static void main(String[] args){
    ApplicationContext ctx =
         new AnnotationConfigApplicationContext(AppConfiguration.class);
        CustomerReportFactory customerReportFactory = ctx.getBean(CustomerReportFactory.class);
        customerReportFactory.create(Arrays.asList(new Customer("name"
                , "lastName"
                , LocalDate.now())));

    }
}
