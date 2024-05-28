package io.tora.fitapiv2.controllers;

import io.tora.fitapiv2.entities.Exercise;
import java.util.List;

public interface IExerciseController {

  Exercise create(Exercise data);

  List<Exercise> list();
}
