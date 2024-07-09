package io.tora.fitapiv2.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ExerciseResponseDTO(
    String id,
    String title,
    String description,
    Integer reps,
    Integer sets,
    Double weight,
    Integer time,
    String equipment,
    LocalDate createdAt,
    LocalDateTime updatedAt) {}
