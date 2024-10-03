package ar.com.educacionit.clase3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.educacionit.clase3.mapeo.claseconcreta.Vehiculo;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

}