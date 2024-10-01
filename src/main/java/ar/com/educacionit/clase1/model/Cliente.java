package ar.com.educacionit.clase1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
    @OneToMany(mappedBy="cliente", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    // Agregar producto y sincronizar la relación bidireccional
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        producto.setCliente(this); // Sincroniza la relación con el producto
    }
    
    // Eliminar producto y sincronizar la relación bidireccional
    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
        producto.setCliente(null); // Rompe la relación en el producto
    }
}
