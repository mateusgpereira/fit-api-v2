package io.tora.fitapiv2.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ExerciseRequestDTO {

  @NotBlank(message = "title is mandatory")
  private String title;

  private String description;

  @Min(value = 1, message = "reps can not be lower than 1")
  private Integer reps;

  @Min(value = 1, message = "reps can not be lower than 1")
  private Integer sets;

  private Double weight;

  private Integer time;

  @NotBlank(message = "equipment is mandatory")
  private String equipment;

}
