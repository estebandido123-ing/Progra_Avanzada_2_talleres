package pa2_u2_p7_ec.Pedidos.Domain.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //indica que va ser administrada por jakarta persistence API
@Table(name = "pedidos") //nombre de la tabla en la base de datos
public class Pedido {

    
    @Id 
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido  _seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @Column(name = "pedd_id") //nombre de la comluna d ela BDD
    private Integer id;

    @Column(name = "pedd_producto")//nombre de la comluna d ela BDD
    private String producto;

    @Column(name = "pedd_precio")//nombre de la comluna d ela BDD
    private Double precio;

    @Column(name = "pedd_fecha")
    private LocalDateTime fecha;

    @Column(name = "pedd_numero")
    private String numero;


    //getters and setters

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    /* 
    public Pedido(Integer id, String producto, Double precio, LocalDateTime fecha) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.fecha = fecha;
    }*/
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", producto=" + producto + ", precio=" + precio + ", fecha=" + fecha + "]";
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
