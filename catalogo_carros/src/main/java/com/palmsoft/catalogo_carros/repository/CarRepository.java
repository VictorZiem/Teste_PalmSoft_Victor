package com.palmsoft.catalogo_carros.repository;

import com.palmsoft.catalogo_carros.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car,Long> {
}
