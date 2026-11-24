package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Categoria;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.CategoriaRepository;

@ApplicationScoped
@Transactional
public class CategoriaService {

    @Inject
    private CategoriaRepository cr;

    public void guardar(Categoria categoria) {
        this.cr.crear(categoria);
    }

    public Categoria buscarPorId(Integer id) {
        return this.cr.read(id);
    }

    public void actualizar(Categoria categoria) {
        this.cr.update(categoria);
    }

    public void eliminar(Integer id) {
        this.cr.delete(id);
    }
}
