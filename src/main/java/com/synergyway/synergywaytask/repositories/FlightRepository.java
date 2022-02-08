package com.synergyway.synergywaytask.repositories;

import com.synergyway.synergywaytask.entities.Flight;
import com.synergyway.synergywaytask.enums.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
    public ArrayList<Flight> findAllByFlightStatus(FlightStatus flightStatus);
    public ArrayList<Flight> findAllBys
}
