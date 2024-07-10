package com.institucion.institucion.util.generic;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.FacadeExecption;

import java.util.List;

public interface CrudFaca<T> {
    public List<T> selectAll() throws FacadeExecption;
    public void insert(T t) throws FacadeExecption;
    public void update(T t) throws FacadeExecption;
    public void delete(Integer id) throws FacadeExecption;
    public T selectId(Integer id) throws FacadeExecption;
}
