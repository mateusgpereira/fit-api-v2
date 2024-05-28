package io.tora.fitapiv2.services;

import io.tora.fitapiv2.entities.Exercise;
import java.util.List;

public interface IExerciseService {

  Exercise create(Exercise data);

  List<Exercise> list();
}
