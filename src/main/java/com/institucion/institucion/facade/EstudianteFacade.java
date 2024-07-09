package com.institucion.institucion.facade;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.FacadeExecption;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;
import java.util.Map;

public interface EstudianteFacade {
    public List<Map<String, Object>> selectAll() throws FacadeExecption;
    public void InsertEstudiante(EstudianteDto estudianteDto) throws FacadeExecption;
    public void EstudianteDelete(EstudianteDto estudianteDto) throws FacadeExecption;
}
