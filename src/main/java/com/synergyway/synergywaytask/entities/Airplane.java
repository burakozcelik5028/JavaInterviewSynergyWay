package com.synergyway.synergywaytask.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String factorySerialNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "air_company_id", referencedColumnName = "id")
    private AirCompany airCompany;

    private int numberOfFlights;
    private Long flightDistance;
    private Long fuelCapacity;
    private String type;
    private LocalDate createdAt;
}
