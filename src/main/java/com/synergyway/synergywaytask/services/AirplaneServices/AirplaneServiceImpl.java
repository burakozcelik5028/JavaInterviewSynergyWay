package com.synergyway.synergywaytask.services.AirplaneServices;

import com.synergyway.synergywaytask.entities.AirCompany;
import com.synergyway.synergywaytask.entities.Airplane;
import com.synergyway.synergywaytask.repositories.AirplaneRepository;
import com.synergyway.synergywaytask.services.AirCompanyServices.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class AirplaneServiceImpl implements AirplaneService{

    private final AirplaneRepository airplaneRepository;
    private final AirCompanyService airCompanyService;

    @Autowired
    public AirplaneServiceImpl(AirplaneRepository airplaneRepository, AirCompanyService airCompanyService) {
        this.airplaneRepository = airplaneRepository;
        this.airCompanyService = airCompanyService;
    }

    @Override
    public Airplane saveAirPlane(Airplane airplane) {
        airplaneRepository.save(airplane);
        return airplane;
    }

    @Override
    public Airplane updateAirPlane(Airplane airplane) {
        airplaneRepository.save(airplane);
        return airplane;
    }

    @Override
    public boolean deleteAirPlane(Long airplaneID) {
        Optional<Airplane> airplane = airplaneRepository.findById(airplaneID);
        if (airplane.isPresent()){
            airplaneRepository.delete(airplane.get());
            return true;
        } else {
            throw new RuntimeException("Airplane not found for the id: " + airplaneID);
        }

    }

    @Override
    public boolean updateAirCompanyID(Long airplaneID, Long airCompanyID) {
        Optional<Airplane> airplane = airplaneRepository.findById(airplaneID);
        Optional<AirCompany> airCompany = airCompanyService.getAirCompanyByID(airCompanyID);
        if (airplane.isPresent() && airCompany.isPresent()){
            airplane.get().setAirCompany(airCompany.get());
            airplaneRepository.save(airplane.get());
            return true;
        } else {
            throw new RuntimeException("Airplane or Air Company not found for the id: " + airplaneID);
        }
    }
}
