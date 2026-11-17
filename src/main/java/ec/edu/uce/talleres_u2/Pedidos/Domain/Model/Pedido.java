package ec.edu.uce.talleres_u2.Pedidos.Domain.Model;

public class Pedido {

    private Integer id;
    private String producto;
    private double precio;

    
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
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

}
