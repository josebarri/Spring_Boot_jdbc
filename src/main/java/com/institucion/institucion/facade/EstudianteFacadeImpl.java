package com.institucion.institucion.facade;

import com.institucion.institucion.dao.EstudianteDao;
import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.FacadeExecption;
import com.institucion.institucion.exception.ManagerException;
import com.institucion.institucion.manager.EstudianteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Component
@Transactional
public class EstudianteFacadeImpl implements EstudianteFacade {
    @Autowired
    private EstudianteManager estudianteManager;

    @Override
    public List<Map<String, Object>> selectAll() throws FacadeExecption {
        try {
            return this.estudianteManager.selectAll();
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public void InsertEstudiante(EstudianteDto estudianteDto) throws FacadeExecption {
        try {
            this.estudianteManager.InsertEstudiante(estudianteDto);
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public void EstudianteDelete(EstudianteDto estudianteDto) throws FacadeExecption {
        try {
            this.estudianteManager.deleteestudiante(estudianteDto);
        }catch (Exception exception){
            throw new FacadeExecption(exception);
        }
    }
}

