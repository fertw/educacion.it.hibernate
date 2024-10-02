package ar.com.educacionit.clase3.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.educacionit.clase3.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	
	List<Producto> findByStockLessThan(Integer stock);
	
	
}
