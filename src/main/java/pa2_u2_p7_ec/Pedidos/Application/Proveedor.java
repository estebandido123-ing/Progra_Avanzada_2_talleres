package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @SequenceGenerator(name = "proveedor_seq", sequenceName = "proveedor_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_seq")
    @Column(name = "prov_id")
    private Integer id;

    @Column(name = "prov_empresa")
    private String empresa;

    @Column(name = "prov_ruc")
    private String ruc;

    @Column(name = "prov_ciudad")
    private String ciudad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
