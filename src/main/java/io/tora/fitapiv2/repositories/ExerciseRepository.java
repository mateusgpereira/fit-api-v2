package io.tora.fitapiv2.repositories;


import io.tora.fitapiv2.entities.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {}
