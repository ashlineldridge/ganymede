package com.ganymede.persistence.program;

import com.ganymede.domain.program.Program;
import com.ganymede.domain.program.ProgramRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 */
public interface ProgramMongoRepository extends ProgramRepository, MongoRepository<Program, Long> {
}
