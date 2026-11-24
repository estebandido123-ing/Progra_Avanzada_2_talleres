package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Producto;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ProductoRepository;

@ApplicationScoped
public class ProductoRepositoryImpl implements ProductoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Producto producto) {
        this.entityManager.persist(producto);
    }

    @Override
    public Producto read(Integer id) {
        return this.entityManager.find(Producto.class, id);
    }

    @Override
    public void update(Producto producto) {
        this.entityManager.merge(producto);
    }

    @Override
    public void delete(Integer id) {
        Producto producto = this.read(id);
        this.entityManager.remove(producto);
    }
}
