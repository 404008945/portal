package com.xishan.store.portal.portalweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PortalWebStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalWebStarterApplication.class, args);
    }

}
