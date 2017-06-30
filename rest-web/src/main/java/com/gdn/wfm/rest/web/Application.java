package com.gdn.wfm.rest.web;

import com.gdn.wfm.LevelRegistrationService;
import com.gdn.wfm.dao.api.LevelDetailsRepository;
import com.gdn.wfm.dao.api.LevelHierarchyRepository;
import com.gdn.wfm.dao.api.ParamDetailsRepository;
import com.gdn.wfm.rest.web.controller.api.TeamConfigController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gdn.wfm.model.entity.Level;

@SpringBootApplication(scanBasePackages = "com.gdn.wfm")
@EnableJpaRepositories("com.gdn.wfm.dao.api")
@EntityScan("com.gdn.wfm.model.entity")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }

  @Bean
  public CommandLineRunner runner(LevelHierarchyRepository levelHierarchyRepository, LevelDetailsRepository
          levelDetailsRepository, ParamDetailsRepository paramDetailsRepository, LevelRegistrationService service) {
    return new CommandLineRunner() {

      @Override
      public void run(String... args) throws Exception {
        System.err.println(levelHierarchyRepository.getLevelInfo("Ceper","BES"));
        System.err.println(levelDetailsRepository.findAll());
      }

    };
  }
}

