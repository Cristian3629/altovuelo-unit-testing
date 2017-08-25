package com.despegar.altovuelo.report;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CustomerReportFactoryTest {
    @Test
    public void testApplicationContext() {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        CustomerReportFactory customerReportFactory = ctx.getBean(CustomerReportFactory.class);
        CustomerReport customerReport = customerReportFactory.create(Arrays.asList(new Customer("name"
                , "lastName"
                , LocalDate.now())));
        assertEquals("", customerReport);

    }
  /*  @Test
    public void createWithOneCustomer(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName("pepe");
        customer.setLastName("gonza");
        LocalDate date1 = LocalDate.of(2011, 11, 11);
        customer.setBirthDate(date1);

        AgeCalculator ageCalculator = mock(AgeCalculator.class);
        when(ageCalculator.calculate(date1)).thenReturn(11);

        AgeRangeCalculator ageRangeCalculator = mock(AgeRangeCalculator.class);
        when(ageRangeCalculator.calculate(11)).thenReturn("niño");
        when(ageRangeCalculator.calculate(40)).thenReturn("adulto");


        ChineseZodiacResolver chineseZodiacResolver = mock(ChineseZodiacResolver.class);
        when(chineseZodiacResolver.resolve(2011)).thenReturn("perro");

        CustomerTypeResolver customerTypeResolver = mock(CustomerTypeResolver.class);
        when(customerTypeResolver.resolve(customer)).thenReturn("gold");

        VerificationValueResolver verificationValueResolver = mock(VerificationValueResolver.class);
        when(verificationValueResolver.resolve(customer)).thenReturn(11);


        CustomerReportFactory customerReportFactory = new CustomerReportFactory(ageCalculator
        ,ageRangeCalculator
        ,chineseZodiacResolver
        ,customerTypeResolver
        ,verificationValueResolver);
        customers.add(customer);


        CustomerReport customerReport = customerReportFactory.create(customers);
        List<CustomerReportLine> reportLines = customerReport.getLines();




        assertTrue(reportLines.size() == 1);

        CustomerReportLine customerReportLine = reportLines.get(0);


        assertTrue(customerReportLine.getAgeRange() == "niño");
        assertTrue(customerReportLine.getAge() == 11);
        assertTrue(customerReportLine.getChineseZodiacSign() == "perro");
        assertTrue(customerReportLine.getVerificationValue() == 11);
        assertTrue(customerReportLine.getCustomerType() == "gold");


    }*/

    }