package com.synergyway.synergywaytask.services.FlightServices;

import com.synergyway.synergywaytask.entities.Flight;
import com.synergyway.synergywaytask.enums.FlightStatus;
import com.synergyway.synergywaytask.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
@Service
public class FlightServiceImpl implements FlightService{

    private final FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight createFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }

    @Override
    public Flight updateFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }

    @Override
    public ArrayList<Flight> getFlightsByStatus(FlightStatus status) {
        ArrayList<Flight> flightArrayList = flightRepository.findAllByFlightStatus(status);
        return flightArrayList;
    }

    @Override
    public ArrayList<Flight> getAllFlightsActiveStatusAndStartedMoreThan24HoursAgo() {
        return null;
    }
}
