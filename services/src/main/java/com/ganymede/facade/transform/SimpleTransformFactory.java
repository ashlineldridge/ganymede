package com.ganymede.facade.transform;

import com.google.common.base.Function;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SimpleTransformFactory {

    @Inject
    private ObjectMapper mapper;

    public <F, T> Function<F, T> get(final Class<F> fromClass, final Class<T> toClass) {
        return new Function<F, T>() {
            @Override
            public T apply(@Nullable F from) {
                if (from != null) {
                    return mapper.map(from, toClass);
                }
                return null;
            }
        };
    }
}
