package io.tora.fitapiv2.services;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.dtos.ExerciseResponseDTO;
import java.util.List;

public interface IExerciseService {

  ExerciseResponseDTO create(ExerciseRequestDTO data);

  List<ExerciseResponseDTO> list();
}
