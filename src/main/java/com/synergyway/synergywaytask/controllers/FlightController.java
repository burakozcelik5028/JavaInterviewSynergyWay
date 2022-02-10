package com.synergyway.synergywaytask.controllers;

import com.synergyway.synergywaytask.entities.Flight;
import com.synergyway.synergywaytask.enums.FlightStatus;
import com.synergyway.synergywaytask.services.FlightServices.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/save")
    public Flight createFlight(@RequestBody Flight flight){
        return flightService.createFlight(flight);
    }

    @PutMapping("/update")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @GetMapping("/getbystatus/{status}")
    public ArrayList<Flight> getFlightsByStatus(@PathVariable FlightStatus status){
        return flightService.getFlightsByStatus(status);
    }

    @GetMapping("/getspecial")
    public ArrayList<Flight> getAllFlightsActiveStatusAndStartedMoreThan24HoursAgo(){
        return flightService.getAllFlightsActiveStatusAndStartedMoreThan24HoursAgo();
    }
}
