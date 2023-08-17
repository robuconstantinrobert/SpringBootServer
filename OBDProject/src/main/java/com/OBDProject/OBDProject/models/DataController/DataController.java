package com.OBDProject.OBDProject.models.DataController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OBDProject.OBDProject.models.AbsBarPressure.AbsBarPressure;
import com.OBDProject.OBDProject.models.AbsBarPressure.AbsBarPressureDAO;
import com.OBDProject.OBDProject.models.BoostPressure.BoostPressure;
import com.OBDProject.OBDProject.models.BoostPressure.BoostPressureDAO;
import com.OBDProject.OBDProject.models.CoolantTemp.CoolantTemp;
import com.OBDProject.OBDProject.models.CoolantTemp.CoolantTempDAO;
import com.OBDProject.OBDProject.models.EngineLoad.EngineLoad;
import com.OBDProject.OBDProject.models.EngineLoad.EngineLoadDAO;
import com.OBDProject.OBDProject.models.FuelLevel.FuelLevel;
import com.OBDProject.OBDProject.models.FuelLevel.FuelLevelDAO;
import com.OBDProject.OBDProject.models.IntakeTemp.IntakeTemp;
import com.OBDProject.OBDProject.models.IntakeTemp.IntakeTempDAO;
import com.OBDProject.OBDProject.models.O2Sensor.O2Sensor;
import com.OBDProject.OBDProject.models.O2Sensor.O2SensorDAO;
import com.OBDProject.OBDProject.models.Odometer.Odometer;
import com.OBDProject.OBDProject.models.Odometer.OdometerDAO;
import com.OBDProject.OBDProject.models.OilTemp.OilTemp;
import com.OBDProject.OBDProject.models.OilTemp.OilTempDAO;
import com.OBDProject.OBDProject.models.RPM.RPM;
import com.OBDProject.OBDProject.models.RPM.RPMDAO;
import com.OBDProject.OBDProject.models.Speed.Speed;
import com.OBDProject.OBDProject.models.Speed.SpeedDAO;
import com.OBDProject.OBDProject.models.ThrottlePos.ThrottlePos;
import com.OBDProject.OBDProject.models.ThrottlePos.ThrottlePosDAO;
import com.OBDProject.OBDProject.models.TimingAdvance.TimingAdvance;
import com.OBDProject.OBDProject.models.TimingAdvance.TimingAdvanceDAO;
import com.OBDProject.OBDProject.models.UserInfo.UserInfo;
import com.OBDProject.OBDProject.models.UserInfo.UserInfoDAO;


@RequestMapping("/api")
@RestController
public class DataController {
    private final AbsBarPressureDAO absBarPressureDAO;
    private final RPMDAO rpmDAO;
    private final BoostPressureDAO boostDAO;
    private final CoolantTempDAO coolantDAO;
    private final EngineLoadDAO loadDAO;
    private final FuelLevelDAO fuelDAO;
    private final IntakeTempDAO intakeDAO;
    private final O2SensorDAO sensorDAO;
    private final OdometerDAO odometerDAO;
    private final OilTempDAO oilDAO;
    private final SpeedDAO speedDAO;
    private final ThrottlePosDAO throttleDAO;
    private final TimingAdvanceDAO timingDAO;
    private final UserInfoDAO userDAO;
    @Autowired
    public DataController(AbsBarPressureDAO absBarPressureDAO, RPMDAO rpmDAO, BoostPressureDAO boostDAO, 
    		CoolantTempDAO coolantDAO, EngineLoadDAO loadDAO, FuelLevelDAO fuelDAO, 
    		IntakeTempDAO intakeDAO, O2SensorDAO sensorDAO, OdometerDAO odometerDAO, OilTempDAO oilDAO, 
    		SpeedDAO speedDAO, ThrottlePosDAO throttleDAO, TimingAdvanceDAO timingDAO, UserInfoDAO userDAO) {
        this.absBarPressureDAO = absBarPressureDAO;
        this.rpmDAO = rpmDAO;
        this.boostDAO = boostDAO;
        this.coolantDAO = coolantDAO;
        this.loadDAO = loadDAO;
        this.fuelDAO = fuelDAO;
        this.intakeDAO = intakeDAO;
        this.sensorDAO = sensorDAO;
        this.odometerDAO = odometerDAO;
        this.oilDAO = oilDAO;
        this.speedDAO = speedDAO;
        this.throttleDAO = throttleDAO;
        this.timingDAO = timingDAO;
        this.userDAO = userDAO;
    }
    
    @GetMapping("/abs-bar-press")
    public List<AbsBarPressure> getAllAbsBarPress() {
        return absBarPressureDAO.getAllAbsBarPress();
    }
    
    @GetMapping("/rpm")
    public List<RPM> getAllRPM() {
        return rpmDAO.getAllRPMValues();
    }
    
    @GetMapping("/boost")
    public List<BoostPressure> getAllBoost() {
        return boostDAO.getAllBoostValues();
    }
    
    @GetMapping("/coolant-temp")
    public List<CoolantTemp> getAllCoolant() {
        return coolantDAO.getAllCoolantValues();
    }
    
    @GetMapping("/engine-load")
    public List<EngineLoad> getAllLoad() {
        return loadDAO.getAllLoadValues();
    }
    
    @GetMapping("/fuel-level")
    public List<FuelLevel> getAllFuel() {
        return fuelDAO.getAllFuelValues();
    }
    
    @GetMapping("/intake-temp")
    public List<IntakeTemp> getAllIntake() {
        return intakeDAO.getAllIntakeVaues();
    }
    
    @GetMapping("/o2sensor")
    public List<O2Sensor> getAllSensor() {
        return sensorDAO.getAllO2SensorValues();
    }
    
    @GetMapping("/odometer")
    public List<Odometer> getAllOdometer() {
        return odometerDAO.getAllOdometerValues();
    }
    
    @GetMapping("/oil-temp")
    public List<OilTemp> getAllOil() {
        return oilDAO.getAllOilValues();
    }
    
    @GetMapping("/speed")
    public List<Speed> getAllSpeed() {
        return speedDAO.getAllSpeedValues();
    }
    
    @GetMapping("/throttle")
    public List<ThrottlePos> getAllThrottle() {
        return throttleDAO.getAllThrottleValues();
    }
    
    @GetMapping("/timing")
    public List<TimingAdvance> getAllTiming() {
        return timingDAO.getAllTimingValues();
    }
    
    @GetMapping("/user-info")
    public List<UserInfo> getAllUsers() {
        return userDAO.getAllUserValues();
    }
    
}
