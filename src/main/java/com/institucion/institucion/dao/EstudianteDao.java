package com.institucion.institucion.dao;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;

import java.util.List;
import java.util.Map;

public interface EstudianteDao {
    public List<EstudianteDto> orderAge() throws DaoException;
}
