package pa2_u2_p7_ec.Pedidos.Infraestructure.Persistence.Repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Categoria;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.CategoriaRepository;

@ApplicationScoped
public class CategoriaRepositoryImpl implements CategoriaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void crear(Categoria categoria) {
        this.entityManager.persist(categoria);
    }

    @Override
    public Categoria read(Integer id) {
        return this.entityManager.find(Categoria.class, id);
    }

    @Override
    public void update(Categoria categoria) {
        this.entityManager.merge(categoria);
    }

    @Override
    public void delete(Integer id) {
        Categoria categoria = this.read(id);
        this.entityManager.remove(categoria);
    }


    
}
