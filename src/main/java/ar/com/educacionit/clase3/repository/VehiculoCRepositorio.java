package ar.com.educacionit.clase3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.educacionit.clase3.mapeo.jerarquia.VehiculoC;

public interface VehiculoCRepositorio extends JpaRepository<VehiculoC, Long> {

}