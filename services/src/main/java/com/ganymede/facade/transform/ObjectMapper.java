package com.ganymede.facade.transform;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import javax.inject.Named;

@Named
public class ObjectMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ObjectMapper() {
        mapper.getConfiguration().enableFieldMatching(true);
        mapper.getConfiguration().setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
    }

    public <T> T map(Object source, Class<T> clazz) {
        return mapper.map(source, clazz);
    }
}
