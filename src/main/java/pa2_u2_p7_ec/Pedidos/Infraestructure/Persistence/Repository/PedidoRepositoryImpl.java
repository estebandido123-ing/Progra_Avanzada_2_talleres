package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject 
    private EntityManager entityManager;//interfaz que permitrira interactuar desde la base 

    @Override
    public void crear(Pedido pedido) {
       this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
       return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
       this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {   
        Pedido pedido = this.read(id);
        this.entityManager.remove(pedido);
    }

}