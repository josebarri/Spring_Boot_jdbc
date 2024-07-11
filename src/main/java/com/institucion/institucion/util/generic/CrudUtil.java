package com.institucion.institucion.util.generic;

import com.institucion.institucion.exception.DaoException;

import java.util.List;

public interface CrudUtil<T, E extends Exception> {
    public List<T> selectAll() throws E;
    public void insert(T t) throws E;
    public void update(T t) throws E;
    public void delete(Integer id) throws E;
    public T selectId(Integer id) throws E;
}
