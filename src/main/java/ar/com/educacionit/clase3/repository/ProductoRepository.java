package ar.com.educacionit.clase3.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.educacionit.clase3.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	
	List<Producto> findByStockLessThan(Integer stock);
	
	@Query (value = "SELECT * FROM productos WHERE precio > :precio", nativeQuery = true)
	List<Producto> buscarProductosPorPrecioMayor(@Param("precio") Double precio);
	
	@Query (value = "SELECT * FROM productos WHERE stock = 0", nativeQuery = true)
	List<Producto> buscarProductosSinStock();
	
	
	
}
