package ar.com.educacionit.clase3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.educacionit.clase3.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	List<Cliente> findByNombre(String nombre);
	List<Cliente> findByApellido(String apellido);
	List<Cliente> findByNombreAndApellido(String nombre, String apellido);
	List<Cliente> findByNombreOrApellido(String nombre, String apellido);
	List<Cliente> findByEmailIsNotNull();
	List<Cliente> findByEmailIsNull();
	List<Cliente> findByApellidoOrderByNombreDesc(String apellido);
	List<Cliente> findByNombreStartingWith(String nombre);
	List<Cliente> findDistinctByProductosNombre(String nombre);
	
	@Query(value = "SELECT * FROM cliente WHERE apellido = :apellido", nativeQuery = true)
	List<Cliente> buscarPorApellido(@Param("apellido") String apellido);
	
	boolean existsByEmail(String email);
	
}
