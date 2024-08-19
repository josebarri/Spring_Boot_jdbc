package com.institucion.institucion.manager;

import com.institucion.institucion.dao.EstudianteDao;
import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EstudianteManagerImpl implements EstudianteManager {
    @Autowired
    private EstudianteDao estudianteDao;

    @Override
    public List<Map<String, Object>> selectAll() throws ManagerException {
        try {
            return this.estudianteDao.selectAll();
        } catch (Exception exception) {
            throw new ManagerException(exception);
        }
    }

    @Override
    public void InsertEstudiante(EstudianteDto estudianteDto) throws ManagerException {
        try {
            this.estudianteDao.InsertEstudiante(estudianteDto);
        } catch (Exception exception) {
            throw new ManagerException(exception);
        }
    }

    @Override
    public void deleteestudiante(EstudianteDto estudianteDto) throws ManagerException {
        try {
            this.estudianteDao.DeleteEstudiante(estudianteDto);
        } catch (Exception exception) {
            throw new ManagerException(exception);
        }

    }

    @Override
    public void EditEstudiante(EstudianteDto estudianteDto) throws ManagerException {
        try {
            this.estudianteDao.EditEstudiante(estudianteDto);
        } catch (Exception exception) {
            throw new ManagerException(exception);
        }
    }
}
