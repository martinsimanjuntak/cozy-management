package com.id.cozy.home.cozymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = {
        "com.id.cozy.home.security",
        "com.id.cozy.home.cozymanagement"} )
@EntityScan(basePackages = {
        "com.id.cozy.home.cozymanagement.entity",
        "com.id.cozy.home.security.entity"
})
public class CozyManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CozyManagementApplication.class, args);
    }

}
