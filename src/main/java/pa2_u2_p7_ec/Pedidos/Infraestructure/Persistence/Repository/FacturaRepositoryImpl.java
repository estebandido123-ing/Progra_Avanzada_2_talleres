package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Factura;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.FacturaRepository;

@ApplicationScoped
public class FacturaRepositoryImpl implements FacturaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Factura factura) {
        this.entityManager.persist(factura);
    }

    @Override
    public Factura read(Integer id) {
        return this.entityManager.find(Factura.class, id);
    }

    @Override
    public void update(Factura factura) {
        this.entityManager.merge(factura);
    }

    @Override
    public void delete(Integer id) {
        Factura factura = this.read(id);
        this.entityManager.remove(factura);
    }
}
