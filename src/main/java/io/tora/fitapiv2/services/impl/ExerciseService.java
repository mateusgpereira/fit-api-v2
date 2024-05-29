package io.tora.fitapiv2.services.impl;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.entities.Exercise;
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
  public Exercise create(ExerciseRequestDTO data) {
    var entity = exerciseMapper.toEntity(data);
    return repository.save(entity);
  }

  @Override
  public List<Exercise> list() {
    return repository.findAll();
  }
}
