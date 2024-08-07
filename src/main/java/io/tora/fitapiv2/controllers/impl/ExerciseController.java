package io.tora.fitapiv2.controllers.impl;

import io.tora.fitapiv2.controllers.IExerciseController;
import io.tora.fitapiv2.dtos.ExerciseRequestDTO;
import io.tora.fitapiv2.dtos.ExerciseResponseDTO;
import io.tora.fitapiv2.services.IExerciseService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
@RequiredArgsConstructor
public class ExerciseController implements IExerciseController {

  private final IExerciseService service;

  @Override
  @PostMapping
  public ExerciseResponseDTO create(@RequestBody ExerciseRequestDTO data) {
    return this.service.create(data);
  }

  @Override
  @GetMapping
  public List<ExerciseResponseDTO> list() {
    return this.service.list();
  }

}
