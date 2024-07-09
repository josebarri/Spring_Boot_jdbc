package com.institucion.institucion.manager;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;
import java.util.Map;

public interface EstudianteManager {
    public List<Map<String, Object>> selectAll() throws ManagerException;
    public void InsertEstudiante(EstudianteDto estudianteDto) throws ManagerException;
    public void deleteestudiante(EstudianteDto estudianteDto) throws ManagerException;
}
