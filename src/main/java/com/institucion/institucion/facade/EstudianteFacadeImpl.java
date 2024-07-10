package com.institucion.institucion.facade;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.FacadeExecption;
import com.institucion.institucion.manager.EstudianteManager;
import com.institucion.institucion.util.generic.CrudFaca;
import com.institucion.institucion.util.generic.CrudMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class EstudianteFacadeImpl implements CrudFaca<EstudianteDto>, EstudianteFacade {
    @Autowired
    private EstudianteManager estudianteManager;
    @Autowired
    private CrudMan<EstudianteDto> crudaMan;
    @Override
    public List<EstudianteDto> selectAll() throws FacadeExecption {
        try {
            return this.crudaMan.selectAll();
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public void insert(EstudianteDto estudianteDto) throws FacadeExecption {
        try {
            this.crudaMan.insert(estudianteDto);
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public void delete(Integer identidad) throws FacadeExecption {
        try {
            this.crudaMan.delete(identidad);
        }catch (Exception exception){
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public EstudianteDto selectId(Integer identidad) throws FacadeExecption {
        try {
           return this.crudaMan.selectId(identidad);

        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }


    }

    @Override
    public void update(EstudianteDto estudianteDto) throws FacadeExecption {
        try {
            this.crudaMan.update(estudianteDto);
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }

    @Override
    public List<EstudianteDto> orderAge() throws FacadeExecption {
        try {
            return this.estudianteManager.orderAge();
        } catch (Exception exception) {
            throw new FacadeExecption(exception);
        }
    }
}

