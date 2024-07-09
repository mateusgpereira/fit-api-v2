package io.tora.fitapiv2.services.impl;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.dtos.ExerciseResponseDTO;
import io.tora.fitapiv2.mappers.ExerciseMapper;
import io.tora.fitapiv2.repositories.ExerciseRepository;
import io.tora.fitapiv2.services.IExerciseService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExerciseService implements IExerciseService {

  private final ExerciseRepository repository;
  private final ExerciseMapper exerciseMapper;

  @Override
  public ExerciseResponseDTO create(ExerciseRequestDTO data) {
    var entity = exerciseMapper.toEntity(data);
    var newEntity = repository.save(entity);
    return exerciseMapper.toResponseDTO(newEntity);
  }

  @Override
  public List<ExerciseResponseDTO> list() {
    return repository.findAll().stream().map(exerciseMapper::toResponseDTO).toList();
  }
}
