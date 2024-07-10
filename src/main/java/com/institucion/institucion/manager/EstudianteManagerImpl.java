package com.institucion.institucion.manager;

import com.institucion.institucion.dao.EstudianteDao;
import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ManagerException;
import com.institucion.institucion.util.generic.CrudDao;
import com.institucion.institucion.util.generic.CrudMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EstudianteManagerImpl implements CrudMan<EstudianteDto>, EstudianteManager {
    @Autowired
    private EstudianteDao estudianteDao;
    @Autowired
    private CrudDao<EstudianteDto> crudDao;
    @Override
    public List<EstudianteDto> selectAll() throws ManagerException {
        try {
            return this.crudDao.selectAll();
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }

    @Override
    public void insert(EstudianteDto estudianteDto) throws ManagerException {
        try {
            this.crudDao.insert(estudianteDto);
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }

    @Override
    public void delete(Integer identidad) throws ManagerException {
        try {
            this.crudDao.delete(identidad);
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }

    @Override
    public EstudianteDto selectId(Integer identidad) throws ManagerException {
        try {
            return this.crudDao.selectId(identidad);
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }

    @Override
    public void update(EstudianteDto estudianteDto) throws ManagerException {
        try {
            this.crudDao.update(estudianteDto);
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }

    @Override
    public List<EstudianteDto> orderAge() throws ManagerException {
        try {
            return this.estudianteDao.orderAge();
        }catch (Exception exception){
            throw new ManagerException(exception);
        }
    }
}
