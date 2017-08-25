package com.despegar.altovuelo.report;

import org.eclipse.jetty.util.annotation.Name;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfiguration {
    @Bean
    public CustomerReportFactory customerReportFactory(AgeCalculator ageCalculator
            , AgeRangeCalculator ageRangeCalculator
            , CustomerTypeResolver customerTypeResolver
            , ChineseZodiacResolver chineseZodiacResolver
            , VerificationValueResolver verificationValueResolver){
        CustomerReportFactory customer = new CustomerReportFactory(ageCalculator,ageRangeCalculator,customerTypeResolver,chineseZodiacResolver,verificationValueResolver);
        return customer;
    }




    @Bean
    public VerificationValueResolver verificationValueResolver(@Qualifier("binaryGap2") BinaryGap binaryGap){
        System.out.println(binaryGap);
        return  new VerificationValueResolver(binaryGap);
    }

    @Bean
    public AgeRangeCalculator ageRangeCalculator(){
        return new AgeRangeCalculator();
    }

    @Bean
    public AgeCalculator ageCalculator(){
        return  new AgeCalculator();
    }


    @Bean
    public CustomerTypeResolver customerTypeResolver(){
        return new CustomerTypeResolver();
    }

    @Bean
    public ChineseZodiacResolver chineseZodiacResolver(){
        return new ChineseZodiacResolver();
    }

    @Bean
    public BinaryGap binaryGap(){
        return new BinaryGap();
    }

    @Bean
    public BinaryGap binaryGap2(){
        return null;
    }
}
