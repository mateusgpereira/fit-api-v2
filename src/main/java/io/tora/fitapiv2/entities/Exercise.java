package io.tora.fitapiv2.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Exercise {

  @Id private String id;

  private String title;

  private String description;

  private Integer reps;

  private Integer sets;

}
