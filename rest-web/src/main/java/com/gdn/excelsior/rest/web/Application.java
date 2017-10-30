package com.gdn.excelsior.rest.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.gdn.excelsior")
@EnableJpaRepositories("com.gdn.excelsior.dao.api")
@EntityScan("com.gdn.excelsior.model.entity")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }
}

