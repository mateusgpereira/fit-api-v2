package io.tora.fitapiv2.controllers;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.dtos.ExerciseResponseDTO;
import java.util.List;

public interface IExerciseController {

  ExerciseResponseDTO create(ExerciseRequestDTO data);

  List<ExerciseResponseDTO> list();
}
