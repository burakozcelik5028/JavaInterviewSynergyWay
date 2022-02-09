package com.synergyway.synergywaytask.controllers;

import com.synergyway.synergywaytask.entities.AirCompany;
import com.synergyway.synergywaytask.services.AirCompanyServices.AirCompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aircompanies")
public class AirCompanyController {

    private final AirCompanyService airCompanyService;

    public AirCompanyController(AirCompanyService airCompanyService) {
        this.airCompanyService = airCompanyService;
    }

    @GetMapping("/get/{id}")
    public Optional<AirCompany> getAirCompanyByID(@PathVariable Long airCompanyID){
        return airCompanyService.getAirCompanyByID(airCompanyID);
    }

    @GetMapping("/getall")
    public List<AirCompany> getAllAirCompanies(){
        return airCompanyService.getAllAirCompanies();
    }

    @PostMapping("/save")
    public AirCompany saveAirCompany(@RequestBody AirCompany airCompany){
        return airCompanyService.saveAirCompany(airCompany);
    }

    @PutMapping("/update")
    public AirCompany updateAirCompany(@RequestBody AirCompany airCompany){
        return airCompanyService.updateAirCompany(airCompany);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAirCompany(@PathVariable Long airCompanyID){
        return airCompanyService.deleteAirCompany(airCompanyID);
    }

}
