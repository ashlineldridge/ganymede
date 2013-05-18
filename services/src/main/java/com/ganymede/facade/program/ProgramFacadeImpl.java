package com.ganymede.facade.program;

import com.ganymede.domain.program.Program;
import com.ganymede.domain.program.ProgramRepository;
import com.ganymede.facade.program.dto.ProgramDTO;
import com.ganymede.facade.transform.FacadeTransform;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 *
 */
@Service
public class ProgramFacadeImpl implements ProgramFacade {

    @Inject
    private ProgramRepository programRepository;

    @Inject
    private FacadeTransform facadeTransform;

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<ProgramDTO> findAll() {
        Iterable<Program> programs = programRepository.findAll();
        return facadeTransform.transform(programs, ProgramDTO.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramDTO findById(Long id) {
        Program program = programRepository.findById(id);
        return facadeTransform.transform(program, ProgramDTO.class);
    }
}
