package com.institucion.institucion.facade;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.FacadeExecption;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;
import java.util.Map;

public interface EstudianteFacade {
    public List<EstudianteDto> selectAll() throws FacadeExecption;
    public void InsertEstudiante(EstudianteDto estudianteDto) throws FacadeExecption;
    public void EstudianteDelete(Integer identidad) throws FacadeExecption;
    public EstudianteDto EstudianteID(Integer identidad) throws FacadeExecption;
    public void EditEstudiante(EstudianteDto estudianteDto) throws FacadeExecption;
}
