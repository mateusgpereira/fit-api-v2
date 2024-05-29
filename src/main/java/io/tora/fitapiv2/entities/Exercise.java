package io.tora.fitapiv2.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Exercise {

  @Id private String id;

  private String title;

  private String description;

  private Integer reps;

  private Integer sets;

  private Double weight;

  private Integer time;

  private String equipment;

  @CreatedDate
  private LocalDate createdAt;

  @LastModifiedDate
  private LocalDateTime updatedAt;

}
