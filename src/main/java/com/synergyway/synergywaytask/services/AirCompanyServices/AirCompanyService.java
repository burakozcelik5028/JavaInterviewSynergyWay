package com.synergyway.synergywaytask.services.AirCompanyServices;

import com.synergyway.synergywaytask.entities.AirCompany;

import java.util.List;
import java.util.Optional;

public interface AirCompanyService {
    public AirCompany saveAirCompany(AirCompany airCompany);
    public AirCompany updateAirCompany(AirCompany airCompany);
    public boolean deleteAirCompany(Long airCompanyID);
    public Optional<AirCompany> getAirCompanyByID(Long airCompanyID);
    public List<AirCompany> getAllAirCompanies();

}
