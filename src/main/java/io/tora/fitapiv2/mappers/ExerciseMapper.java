package io.tora.fitapiv2.mappers;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.dtos.ExerciseResponseDTO;
import io.tora.fitapiv2.entities.Exercise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

  ExerciseRequestDTO toDto(Exercise entity);

  Exercise toEntity(ExerciseRequestDTO dto);

  ExerciseResponseDTO toResponseDTO(Exercise entity);

}
