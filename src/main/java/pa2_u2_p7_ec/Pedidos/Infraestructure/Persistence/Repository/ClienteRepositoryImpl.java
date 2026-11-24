package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Cliente;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ClienteRepository;

@ApplicationScoped
public class ClienteRepositoryImpl implements ClienteRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Cliente cliente) {
        this.entityManager.persist(cliente);
    }

    @Override
    public Cliente read(Integer id) {
        return this.entityManager.find(Cliente.class, id);
    }

    @Override
    public void update(Cliente cliente) {
        this.entityManager.merge(cliente);
    }

    @Override
    public void delete(Integer id) {
        Cliente cliente = this.read(id);
        this.entityManager.remove(cliente);
    }
}
