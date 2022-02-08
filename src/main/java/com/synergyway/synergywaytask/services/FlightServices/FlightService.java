package com.synergyway.synergywaytask.services.FlightServices;

import com.synergyway.synergywaytask.entities.Flight;
import com.synergyway.synergywaytask.enums.FlightStatus;

import java.util.ArrayList;

public interface FlightService {
    public Flight createFlight(Flight flight);
    public Flight updateFlight(Flight flight);
    public ArrayList<Flight> getFlightsByStatus(FlightStatus status);
    public ArrayList<Flight> getAllFlightsActiveStatusAndStartedMoreThan24HoursAgo();
}
