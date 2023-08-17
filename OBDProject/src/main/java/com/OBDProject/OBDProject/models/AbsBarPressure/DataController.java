//package com.OBDProject.OBDProject.models.AbsBarPressure;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.OBDProject.OBDProject.models.RPM.RPM;
//import com.OBDProject.OBDProject.models.RPM.RPMDAO;
//
//
//@RequestMapping("/api")
//@RestController
//public class DataController {
//    private final AbsBarPressureDAO absBarPressureDAO;
//    private final RPMDAO rpmDAO;
//    
//    @Autowired
//    public DataController(AbsBarPressureDAO absBarPressureDAO, RPMDAO rpmDAO) {
//        this.absBarPressureDAO = absBarPressureDAO;
//        this.rpmDAO = rpmDAO;
//    }
//    
//    @GetMapping("/abs-bar-press")
//    public List<AbsBarPressure> getAllAbsBarPress() {
//        return absBarPressureDAO.getAllAbsBarPress();
//    }
//    
//    @GetMapping("/rpm")
//    public List<RPM> getAllRPM() {
//        return rpmDAO.getAllRPMValues();
//    }
//}
