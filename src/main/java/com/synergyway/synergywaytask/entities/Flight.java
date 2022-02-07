package com.synergyway.synergywaytask.entities;

import com.synergyway.synergywaytask.enums.FlighStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private FlighStatus flighStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "air_company_id", referencedColumnName = "id")
    private AirCompany airCompany;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;


}
