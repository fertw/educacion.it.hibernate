package ar.com.educacionit.clase1.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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
    
    @Column(name="fecha_alta")
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
