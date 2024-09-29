package ar.com.educacionit.clase1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="apellido", nullable=false)
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefono")
	private String telefono;
	
	// Un cliente puede tener muchos productos
	// mappedBy: nombre del atributo en la clase Producto que mapea la relación
	// cascade: indica que las operaciones de persistencia en Cliente se propagan a los productos
	// fetch: indica que se carguen los productos cuando se cargue el cliente
	// orphanRemoval: indica que si se elimina un producto de la lista de productos de un cliente, se elimine de la base de datos
	@OneToMany(mappedBy="cliente", cascade=CascadeType.ALL, fetch=FetchType.EAGER, orphanRemoval=true)
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Cliente() {
	}
	
	public Cliente(Long id, String nombre, String apellido, String email, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		producto.setCliente(this);
	}
	
	

}
