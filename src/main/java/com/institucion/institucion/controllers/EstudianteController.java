package com.institucion.institucion.controllers;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.dto.MensajeDto;
import com.institucion.institucion.facade.EstudianteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/institucion")
@CrossOrigin
@RestController
public class EstudianteController {
    @Autowired
    private EstudianteFacade estudianteFacade;


    @GetMapping("estudiantes")
    @ResponseStatus(HttpStatus.OK)
    public List<EstudianteDto> selectAll() {
        List<EstudianteDto> list = null;

        try {
            list = this.estudianteFacade.selectAll();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return list;
    }


    @PostMapping("estudiantes")
    @ResponseStatus(HttpStatus.CREATED)
    public void InsertEstudiante(@RequestBody EstudianteDto estudianteDto) {
        try {
            this.estudianteFacade.InsertEstudiante(estudianteDto);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteEstudiante(@PathVariable("id") Integer identidad) {
        try {
            this.estudianteFacade.EstudianteDelete(identidad);
            return ResponseEntity.status(HttpStatus.OK).body("El registro se eliminó exitosamente");
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el registro");
        }
    }

    @PutMapping("estudiantes")

    public ResponseEntity<MensajeDto> EditEstudiante(@RequestBody EstudianteDto estudianteDto) {
        MensajeDto mensajeDto = new MensajeDto();
        try {
            this.estudianteFacade.EditEstudiante(estudianteDto);
            mensajeDto.setStatus("200");
            mensajeDto.setMensaje("actualizado con exito");
        }catch (Exception exception){
            exception.printStackTrace();
            mensajeDto.setStatus("400");
            mensajeDto.setMensaje("algo fallo" + exception.getMessage());
        }
return ResponseEntity.ok(mensajeDto);
    }

    @GetMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EstudianteDto EstudianteID(@PathVariable("id") Integer identidad) {
        EstudianteDto estudiante = null ;
    try {
            estudiante = this.estudianteFacade.EstudianteID(identidad);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    return estudiante;
    }

}


