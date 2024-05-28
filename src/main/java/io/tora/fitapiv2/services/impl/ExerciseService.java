package io.tora.fitapiv2.services.impl;

import io.tora.fitapiv2.entities.Exercise;
import io.tora.fitapiv2.repositories.ExerciseRepository;
import io.tora.fitapiv2.services.IExerciseService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExerciseService implements IExerciseService {

  private final ExerciseRepository repository;

  @Override
  public Exercise create(Exercise data) {
    return repository.save(data);
  }

  @Override
  public List<Exercise> list() {
    return repository.findAll();
  }
}
