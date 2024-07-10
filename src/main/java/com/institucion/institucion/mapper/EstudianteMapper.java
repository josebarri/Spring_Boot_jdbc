package com.institucion.institucion.mapper;

import com.institucion.institucion.dto.EstudianteDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudianteMapper implements RowMapper<EstudianteDto> {

    @Override
    public EstudianteDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        EstudianteDto estudianteDto = new EstudianteDto();
        estudianteDto.setIdentidad(rs.getInt("identidad"));
        estudianteDto.setTipo_documento(rs.getString("tipo_documento"));
        estudianteDto.setNombres(rs.getString("nombres"));
        estudianteDto.setApellidos(rs.getString("apellidos"));
        estudianteDto.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
        estudianteDto.setEdad(rs.getInt("edad"));
        estudianteDto.setGrado(rs.getInt("grado"));
        estudianteDto.setEmail(rs.getString("email"));
        estudianteDto.setTelefono_fijo(rs.getString("telefono_fijo"));
        estudianteDto.setCelular(rs.getString("celular"));
        return estudianteDto;
    }
}
