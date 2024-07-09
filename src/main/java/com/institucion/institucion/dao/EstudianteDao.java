package com.institucion.institucion.dao;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;

import java.util.List;
import java.util.Map;

public interface EstudianteDao {
    public List<Map<String, Object>> selectAll() throws DaoException;
    public void InsertEstudiante(EstudianteDto estudianteDto) throws DaoException;
    public void DeleteEstudiante(EstudianteDto estudianteDto) throws DaoException;
}
