package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Producto;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ProductoRepository;

@ApplicationScoped
@Transactional
public class ProductoService {

    @Inject
    private ProductoRepository pr;

    public void guardar(Producto producto) {
        this.pr.crear(producto);
    }

    public Producto buscarPorId(Integer id) {
        return this.pr.read(id);
    }

    public void actualizar(Producto producto) {
        this.pr.update(producto);
    }

    public void eliminar(Integer id) {
        this.pr.delete(id);
    }
}