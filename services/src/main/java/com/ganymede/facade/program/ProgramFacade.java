package com.ganymede.facade.program;

import com.ganymede.facade.program.dto.ProgramDTO;

/**
 * Is there a way to create a generic facade? They all seem to do the same things at the moment.
 */
public interface ProgramFacade {

    Iterable<ProgramDTO> findAll();

    /**
     *
     * @param id
     * @return
     */
    ProgramDTO findById(Long id);
}
