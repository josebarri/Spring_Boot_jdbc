package com.institucion.institucion.manager;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;
import java.util.Map;

public interface EstudianteManager {
    public List<EstudianteDto> selectAll() throws ManagerException;
    public void InsertEstudiante(EstudianteDto estudianteDto) throws ManagerException;
    public void deleteestudiante(Integer identidad) throws ManagerException;
    public EstudianteDto EstudianteId(Integer identidad) throws ManagerException;
    public void EditEstudiante(EstudianteDto estudianteDto) throws ManagerException;
}
