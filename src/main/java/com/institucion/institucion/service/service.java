package com.institucion.institucion.service;
import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.exception.ServiceException;
import com.institucion.institucion.util.generic.CrudUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service implements CrudUtil<EstudianteDto, ServiceException> {
    @Autowired
    private CrudUtil<EstudianteDto, DaoException> CrudUtil;
    @Override
    public List<EstudianteDto> selectAll() throws ServiceException {
        try {
            return this.CrudUtil.selectAll();
        }catch (Exception exception){
            throw new ServiceException(exception);
        }
    }

    @Override
    public void insert(EstudianteDto estudianteDto) throws ServiceException {
        try {
            this.CrudUtil.insert(estudianteDto);
        }catch (Exception exception){
            throw new ServiceException(exception);
        }
    }

    @Override
    public void update(EstudianteDto estudianteDto) throws ServiceException {
        try {
            this.CrudUtil.update(estudianteDto);
        }catch (Exception exception){
            throw new ServiceException(exception);
        }
    }

    @Override
    public void delete(Integer id) throws ServiceException {
        try {
            this.CrudUtil.delete(id);
        }catch (Exception exception){
            throw new ServiceException(exception);
        }
    }

    @Override
    public EstudianteDto selectId(Integer id) throws ServiceException {
        try {
            return this.CrudUtil.selectId(id);
        }catch (Exception exception){
            throw new ServiceException(exception);
        }
    }
}


