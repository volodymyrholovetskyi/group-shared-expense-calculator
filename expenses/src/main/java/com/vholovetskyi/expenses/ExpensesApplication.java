package com.vholovetskyi.expenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExpensesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpensesApplication.class, args);
    }

}
