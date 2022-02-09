package com.synergyway.synergywaytask.controllers;

import com.synergyway.synergywaytask.entities.Airplane;
import com.synergyway.synergywaytask.services.AirplaneServices.AirplaneService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airplanes")
public class AirplaneController {

    private final AirplaneService airplaneService;

    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @PostMapping("/save")
    public Airplane saveAirPlane(@RequestBody Airplane airplane){
        return airplaneService.saveAirPlane(airplane);
    }

    @PutMapping("/update")
    public Airplane updateAirPlane(@RequestBody Airplane airplane){
        return airplaneService.updateAirPlane(airplane);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAirPlane(@PathVariable("id") Long airplaneID){
        return airplaneService.deleteAirPlane(airplaneID);
    }

    @PutMapping("/updateaircompany/{airplaneID}/{aircompanyID}")
    public boolean updateAirCompanyID(@PathVariable Long airplaneID, @PathVariable Long airCompanyID){
        return airplaneService.updateAirCompanyID(airplaneID, airCompanyID);
    }
}
