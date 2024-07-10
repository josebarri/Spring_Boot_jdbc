package com.institucion.institucion.dao;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.exception.DaoException;
import com.institucion.institucion.mapper.EstudianteMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class EsrudianteDaoImpl implements EstudianteDao{
private JdbcTemplate jdbcTemplate;
private  final String estudiantesAll = "SELECT * FROM estudiante";
private final String estudianteDelete = "DELETE FROM estudiante where identidad = ?";
private final String estudianteInsert = "INSERT INTO estudiante(identidad, tipo_documento, nombres, apellidos, fecha_nacimiento, edad, grado, email, telefono_fijo, celular) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private  final String estudiantesID = "SELECT * FROM estudiante where identidad = ?";
private final String estudianteEdit = "UPDATE estudiante SET tipo_documento=?, nombres=?, apellidos=?, fecha_nacimiento=?, edad=?, grado=?, email=?, telefono_fijo=?, celular=? where identidad=?";
public EsrudianteDaoImpl(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}
    @Override
    public List<EstudianteDto> selectAll() throws DaoException {
       try {
           return this.jdbcTemplate.query(estudiantesAll, new EstudianteMapper());
       }catch (Exception exception){
           throw new DaoException(exception);
       }
    }

    @Override
    public void InsertEstudiante(EstudianteDto estudianteDto) throws DaoException {
        try {
            this.jdbcTemplate.update(estudianteInsert,
                                        estudianteDto.getIdentidad(),
                                        estudianteDto.getTipo_documento(),
                                        estudianteDto.getNombres(),
                                        estudianteDto.getApellidos(),
                                        estudianteDto.getFecha_nacimiento(),
                                        estudianteDto.getEdad(),
                                        estudianteDto.getGrado(),
                                        estudianteDto.getEmail(),
                                        estudianteDto.getTelefono_fijo(),
                                        estudianteDto.getCelular());
        }catch (Exception exception){
            throw new DaoException(exception);
        }
    }

    @Override
    public void EditEstudiante(EstudianteDto estudianteDto) throws DaoException {
        try {
            this.jdbcTemplate.update(estudianteEdit,
                    estudianteDto.getTipo_documento(),
                    estudianteDto.getNombres(),
                    estudianteDto.getApellidos(),
                    estudianteDto.getFecha_nacimiento(),
                    estudianteDto.getEdad(),
                    estudianteDto.getGrado(),
                    estudianteDto.getEmail(),
                    estudianteDto.getTelefono_fijo(),
                    estudianteDto.getCelular(),
                    estudianteDto.getIdentidad());
        }catch (Exception exception){
            throw new DaoException(exception);
        }
    }

    @Override
    public void DeleteEstudiante(Integer identidad) throws DaoException {
        try {
            this.jdbcTemplate.update(estudianteDelete, identidad);
        }catch (Exception exception){
            throw new DaoException(exception);
        }
    }

    @Override
    public EstudianteDto EstudianteID(Integer identidad) throws DaoException {
        try {
            return this.jdbcTemplate.queryForObject(estudiantesID, new EstudianteMapper(), identidad);
        }catch (EmptyResultDataAccessException e){
            return null;
        }catch (Exception exception){
            throw new DaoException(exception);
        }
    }
}
