package ar.com.educacionit.clase3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.educacionit.clase3.mapeo.claseconcreta.Vehiculo;
import ar.com.educacionit.clase3.mapeo.subclase.VehiculoB;

public interface VehiculoBRepositorio extends JpaRepository<VehiculoB, Long> {

}