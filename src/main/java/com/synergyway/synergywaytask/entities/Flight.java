package com.synergyway.synergywaytask.entities;

import com.synergyway.synergywaytask.enums.FlightStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private FlightStatus flightStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "air_company_id", referencedColumnName = "id")
    private AirCompany airCompany;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    private String departureCountry;
    private String destinationCountry;
    private Long distance;
    private LocalDateTime estimatedFlightTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private LocalDateTime delayStartedAt;
    private LocalDate createdAt;

}
