package com.ganymede.domain.program;

/**
 *
 */
public interface ProgramRepository {

    Iterable<Program> findAll();

    Program findById(Long id);
}
