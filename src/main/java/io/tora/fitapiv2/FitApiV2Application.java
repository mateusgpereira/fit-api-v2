package io.tora.fitapiv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class FitApiV2Application {

  public static void main(String[] args) {
    SpringApplication.run(FitApiV2Application.class, args);
  }

}
