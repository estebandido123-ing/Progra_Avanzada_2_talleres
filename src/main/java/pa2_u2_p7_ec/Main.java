package pa2_u2_p7_ec;
import java.time.LocalDateTime;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pa2_u2_p7_ec.Pedidos.Application.CategoriaService;
import pa2_u2_p7_ec.Pedidos.Application.ClienteService;
import pa2_u2_p7_ec.Pedidos.Application.FacturaService;
import pa2_u2_p7_ec.Pedidos.Application.PedidoService;
import pa2_u2_p7_ec.Pedidos.Application.ProductoService;
import pa2_u2_p7_ec.Pedidos.Application.Proveedor;
import pa2_u2_p7_ec.Pedidos.Application.ProveedorService;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Categoria;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Cliente;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Factura;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Pedido;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Producto;

@QuarkusMain 
public class Main implements QuarkusApplication{

    
    @Inject
    private PedidoService pedidoService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private ProductoService productoService;

    @Inject
    private CategoriaService categoriaService;

    @Inject
    private ProveedorService proveedorService;

    @Inject
    private FacturaService facturaService;


    public static void main(String[] args){
        Quarkus.run(Main.class,args);
    }


    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello Quarkus!");
        // 1. Pedido (Original)
        Pedido p1 = new Pedido();
        p1.setProducto("Producto de prueba");
        p1.setPrecio(1.1);
        p1.setFecha(LocalDateTime.now());
        this.pedidoService.guaradar(p1);

        // 2. Cliente
        Cliente c1 = new Cliente();
        c1.setNombre("Juan Perez");
        c1.setCorreo("juan@correo.com");
        c1.setTelefono("0991234567");
        this.clienteService.guardar(c1);

        // 3. Producto
        Producto prod1 = new Producto();
        prod1.setNombre("Laptop Asus");
        prod1.setPrecio(850.50);
        prod1.setStock(15);
        this.productoService.guardar(prod1);

        // 4. Categoria
        Categoria cat1 = new Categoria();
        cat1.setNombre("Tecnologia");
        cat1.setDescripcion("Equipos de computo y accesorios");
        this.categoriaService.guardar(cat1);

        // 5. Proveedor
        Proveedor prov1 = new Proveedor();
        prov1.setEmpresa("Importadora Tech S.A.");
        prov1.setRuc("1790012345001");
        prov1.setCiudad("Quito");
        this.proveedorService.guardar(prov1);

        // 6. Factura
        Factura f1 = new Factura();
        f1.setNumero("001-001-000001");
        f1.setTotal(850.50);
        f1.setFecha(LocalDateTime.now());
        this.facturaService.guardar(f1);

        System.out.println("Todos los registros se guardaron correctamente.");

       return 0;
    }

}