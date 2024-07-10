package com.institucion.institucion.util.generic;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;

import java.util.List;

public interface CrudDao<T> {
    public List<T> selectAll() throws DaoException;
    public void insert(T t) throws DaoException;
    public void update(T t) throws DaoException;
    public void delete(Integer id) throws DaoException;
    public T selectId(Integer id) throws DaoException;
}
