package org.example.jenkins;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JenkinsApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLazyInitialization(true);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
