package com.institucion.institucion.controllers;

import com.institucion.institucion.util.Constant;
import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.dto.MensajeDto;
import com.institucion.institucion.facade.EstudianteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/institucion")
@CrossOrigin
@RestController
public class EstudianteController {
    @Autowired
    private EstudianteFacade estudianteFacade;


    @GetMapping("estudiantes")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MensajeDto> selectAll() {
        MensajeDto mensajeDto = new MensajeDto();

        try {
            List<EstudianteDto> estudiante = this.estudianteFacade.selectAll();
            mensajeDto.setStatus(Constant.Estatus_200);
            mensajeDto.setMensaje(Constant.mensajeEx);
            mensajeDto.setCode(Constant.query_ok);
            mensajeDto.setData(estudiante);
        }catch (Exception exception){
            mensajeDto.setStatus(Constant.Estatus_400);
            mensajeDto.setMensaje(exception.getMessage());
            mensajeDto.setCode(Constant.error);
        }
        return ResponseEntity.ok(mensajeDto);
    }


    @PostMapping("estudiantes")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MensajeDto> InsertEstudiante(@RequestBody EstudianteDto estudianteDto) {
        MensajeDto mensajeDto = new MensajeDto();
        try {
            this.estudianteFacade.InsertEstudiante(estudianteDto);
            mensajeDto.setStatus(Constant.Estatus_200);
            mensajeDto.setMensaje(Constant.mensajeCreate);
            mensajeDto.setCode(Constant.query_ok);
        }catch (Exception exception){
            mensajeDto.setStatus(Constant.Estatus_400);
            mensajeDto.setMensaje(exception.getMessage());
            mensajeDto.setCode(Constant.error);
        }
        return ResponseEntity.ok(mensajeDto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MensajeDto> deleteEstudiante(@PathVariable("id") Integer identidad) {
        MensajeDto mensajeDto = new MensajeDto();
        try {
            this.estudianteFacade.EstudianteDelete(identidad);
            mensajeDto.setStatus(Constant.Estatus_200);
            mensajeDto.setMensaje(Constant.mensajeDelete);
            mensajeDto.setCode(Constant.query_ok);
        } catch (Exception exception) {
            mensajeDto.setStatus(Constant.Estatus_400);
            mensajeDto.setMensaje(exception.getMessage());
            mensajeDto.setCode(Constant.error);
        }
        return ResponseEntity.ok(mensajeDto);
    }

    @PutMapping("estudiantes")

    public ResponseEntity<MensajeDto> EditEstudiante(@RequestBody EstudianteDto estudianteDto) {
        MensajeDto mensajeDto = new MensajeDto();
        try {
            this.estudianteFacade.EditEstudiante(estudianteDto);
            mensajeDto.setStatus(Constant.Estatus_200);
            mensajeDto.setMensaje(Constant.mensajeEdit);
            mensajeDto.setCode(Constant.query_ok);
        }catch (Exception exception){
            mensajeDto.setStatus(Constant.Estatus_400);
            mensajeDto.setMensaje(exception.getMessage());
            mensajeDto.setCode(Constant.error);
        }
        return ResponseEntity.ok(mensajeDto);
    }

    @GetMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MensajeDto> EstudianteID(@PathVariable("id") Integer identidad) {
        MensajeDto mensajeDto = new MensajeDto();

    try {
        EstudianteDto estudiante = this.estudianteFacade.EstudianteID(identidad);
        mensajeDto.setStatus(Constant.Estatus_200);
        mensajeDto.setMensaje(Constant.mensajeEx);
        mensajeDto.setCode(Constant.query_ok);
        mensajeDto.setData(estudiante);
        } catch (Exception exception) {
        mensajeDto.setStatus(Constant.Estatus_400);
        mensajeDto.setMensaje(exception.getMessage());
        mensajeDto.setCode(Constant.error);
        }
        return ResponseEntity.ok(mensajeDto);
    }

}


