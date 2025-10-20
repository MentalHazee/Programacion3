package com.ge.demo.controller;

import com.ge.demo.entities.dtos.dni.DniCreate;
import com.ge.demo.service.DniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/dni")
public class DniController {

    @Autowired
    DniService dniService;

    @PostMapping
    public ResponseEntity<?> create (@RequestBody DniCreate dni){
        try{
            return ResponseEntity.ok(dniService.create(dni));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> findAll (){
        try{
            return ResponseEntity.ok(dniService.findAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById (@PathVariable Long id){
        try{
            return ResponseEntity.ok(dniService.findById(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ocurrio un error " + e.getMessage());
        }
    }
}
