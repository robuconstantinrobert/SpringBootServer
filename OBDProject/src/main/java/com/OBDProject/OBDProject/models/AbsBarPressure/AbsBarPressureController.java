//package com.OBDProject.OBDProject.models.AbsBarPressure;
//
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RequestMapping("/api")
//@RestController
//public class AbsBarPressureController {
//    private final AbsBarPressureDAO repository;
//    @Autowired
//    public AbsBarPressureController(AbsBarPressureDAO repository) {
//        this.repository = repository;
//    }
//    
//    @GetMapping("/abs-bar-press")
//    public Iterable<AbsBarPressure> getAllAbsBarPress() {
//        return repository.getAllAbsBarPress();
//    }
//}