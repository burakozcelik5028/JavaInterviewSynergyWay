package com.synergyway.synergywaytask.repositories;

import com.synergyway.synergywaytask.entities.AirCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirCompanyRepository extends JpaRepository<AirCompany, Long> {
}
