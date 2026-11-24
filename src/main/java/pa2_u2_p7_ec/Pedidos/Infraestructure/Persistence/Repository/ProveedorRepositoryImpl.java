package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pa2_u2_p7_ec.Pedidos.Application.Proveedor;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ProveedorRepository;

@ApplicationScoped
public class ProveedorRepositoryImpl implements ProveedorRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Proveedor proveedor) {
        this.entityManager.persist(proveedor);
    }

    @Override
    public Proveedor read(Integer id) {
        return this.entityManager.find(Proveedor.class, id);
    }

    @Override
    public void update(Proveedor proveedor) {
        this.entityManager.merge(proveedor);
    }

    @Override
    public void delete(Integer id) {
        Proveedor proveedor = this.read(id);
        this.entityManager.remove(proveedor);
    }
}