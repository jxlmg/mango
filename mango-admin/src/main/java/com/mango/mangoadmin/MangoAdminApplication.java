package com.mango.mangoadmin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mango"})
@Slf4j
public class MangoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoAdminApplication.class, args);
        log.info("============================Mango Admin Application Started===================");
    }

}
