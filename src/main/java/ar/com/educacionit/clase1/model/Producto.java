package ar.com.educacionit.clase1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombre", length=50, nullable=false)
	private String nombre;
	
	@Column(name="precio", nullable=false)
	private Double precio;
	
	@Column(name="fecha_alta", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;
	
	@Column(name="stock", nullable=false)
	private Integer stock;
	
	// Un producto pertenece a un cliente
	@ManyToOne
	@JoinColumn(name="cliente_id", nullable=false)
	private Cliente cliente;
	
	public Producto() {
		super();
	}
	
	public Producto(Integer id, String nombre, Double precio, Date fechaAlta, Integer stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}	
	
}
