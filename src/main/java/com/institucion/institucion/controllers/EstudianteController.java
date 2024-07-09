package com.institucion.institucion.controllers;

import com.institucion.institucion.dto.EstudianteDto;
import com.institucion.institucion.facade.EstudianteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/institucion")
@RestController
public class EstudianteController {
    @Autowired
    private EstudianteFacade estudianteFacade;


    @GetMapping("estudiantes")
    public List<Map<String, Object>> selectAll() {
        List<Map<String, Object>> list = null;

        try {
            list = this.estudianteFacade.selectAll();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return list;
    }


    @PostMapping("estudiantes")
    public void InsertEstudiante(@RequestBody EstudianteDto estudianteDto) {
        try {
            this.estudianteFacade.InsertEstudiante(estudianteDto);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
    @DeleteMapping("estudiantes")
    public void deleteEstudiante(@RequestBody EstudianteDto estudianteDto) {
        try {
            this.estudianteFacade.EstudianteDelete(estudianteDto);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
}


