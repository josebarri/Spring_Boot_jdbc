package com.institucion.institucion.util.generic;

import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;

public interface CrudMan<T> {
    public List<T> selectAll() throws ManagerException;
    public void insert(T t) throws ManagerException;
    public void update(T t) throws ManagerException;
    public void delete(Integer id) throws ManagerException;
    public T selectId(Integer id) throws ManagerException;
}
