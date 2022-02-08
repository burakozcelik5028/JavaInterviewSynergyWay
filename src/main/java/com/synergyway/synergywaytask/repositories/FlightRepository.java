package com.synergyway.synergywaytask.repositories;

import com.synergyway.synergywaytask.entities.Flight;
import com.synergyway.synergywaytask.enums.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

    public ArrayList<Flight> findAllByFlightStatus(FlightStatus flightStatus);

    @Query(value = "select * From Flight as f where f.flightStatus = 'ACTIVE' AND f.startedAt > DATE_SUB(CURDATE(), INTERVAL 24 hour)",
            nativeQuery = true)
    public ArrayList<Flight> findAllByStartedAt_HoursGreaterThan();
}
