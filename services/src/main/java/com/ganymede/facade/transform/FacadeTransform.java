package com.ganymede.facade.transform;

import com.google.common.collect.Lists;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

/**
 *
 */
@Named
public class FacadeTransform {

    @Inject
    private ObjectMapper mapper;

    /**
     *
     * @param from
     * @param toClass
     * @param <F>
     * @param <T>
     * @return
     */
    public <F, T> T transform(F from, final Class<T> toClass) {
        if (from != null) {
            return mapper.map(from, toClass);
        }
        return null;
    }

    /**
     *
     * @param fromList
     * @param toClass
     * @param <F>
     * @param <T>
     * @return
     */
    public <F, T> Iterable<T> transform(Iterable<F> fromList, final Class<T> toClass) {
        if (fromList != null) {
            Collection<T> toList = Lists.newArrayList();
            for (F from: fromList) {
                toList.add(transform(from, toClass));
            }
            return toList;
        }
        return null;
    }
}
