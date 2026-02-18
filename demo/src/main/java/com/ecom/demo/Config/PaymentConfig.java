package com.ecom.demo.Config;

import com.ecom.demo.Service.GPayService;
import com.ecom.demo.Service.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
     @Bean
     Payment GPayService(){
          return new GPayService();
     }

}
