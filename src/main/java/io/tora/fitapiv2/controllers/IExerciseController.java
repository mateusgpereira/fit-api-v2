package io.tora.fitapiv2.controllers;

import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.entities.Exercise;
import java.util.List;

public interface IExerciseController {

  Exercise create(ExerciseRequestDTO data);

  List<Exercise> list();
}
