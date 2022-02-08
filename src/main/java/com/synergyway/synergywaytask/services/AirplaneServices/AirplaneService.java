package com.synergyway.synergywaytask.services.AirplaneServices;

import com.synergyway.synergywaytask.entities.Airplane;

public interface AirplaneService {
    public Airplane saveAirPlane(Airplane airplane);
    public Airplane updateAirPlane(Airplane airplane);
    public boolean deleteAirPlane(Long airplaneID);
    public boolean updateAirCompanyID(Long airplaneID, Long airCompanyID);

}
