package com.institucion.institucion.facade;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.FacadeExecption;
import com.institucion.institucion.exception.ManagerException;

import java.util.List;
import java.util.Map;

public interface EstudianteFacade {
    public List<EstudianteDto> orderAge() throws FacadeExecption;
}
