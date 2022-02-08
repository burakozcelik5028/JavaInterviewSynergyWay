package com.synergyway.synergywaytask.services.AirCompanyServices;

import com.synergyway.synergywaytask.entities.AirCompany;
import com.synergyway.synergywaytask.repositories.AirCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class AirCompanyServiceImpl implements AirCompanyService{

    private final AirCompanyRepository airCompanyRepository;

    @Autowired
    public AirCompanyServiceImpl(AirCompanyRepository airCompanyRepository) {
        this.airCompanyRepository = airCompanyRepository;
    }

    @Override
    public AirCompany saveAirCompany(AirCompany airCompany) {
        airCompanyRepository.save(airCompany);
        return airCompany;
    }

    @Override
    public AirCompany updateAirCompany(AirCompany airCompany) {
        airCompanyRepository.save(airCompany);
        return airCompany;
    }

    @Override
    public boolean deleteAirCompany(Long airCompanyID) {
        Optional<AirCompany> airCompany = airCompanyRepository.findById(airCompanyID);
        if (airCompany.isPresent()){
            airCompanyRepository.delete(airCompany.get());
            return true;
        } else {
            throw new RuntimeException("Air Company can not found with this id: " + airCompanyID);
        }
    }

    @Override
    public Optional<AirCompany> getAirCompanyByCode(Long airCompanyID) {
        Optional<AirCompany> airCompany = airCompanyRepository.findById(airCompanyID);
        if (airCompany.isPresent()){
            return airCompany;
        } else{
            throw new RuntimeException("Air Company can not found with this id: " + airCompanyID);
        }

    }
}
