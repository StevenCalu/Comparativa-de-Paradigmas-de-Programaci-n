package com.espe.Autonomo_1P.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HardwareRepository
        extends JpaRepository<HardwareEntity, Long> {
}