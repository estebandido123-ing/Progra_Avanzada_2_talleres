package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ProveedorRepository;

@ApplicationScoped
@Transactional
public class ProveedorService {

    @Inject
    private ProveedorRepository pr;

    public void guardar(Proveedor proveedor) {
        this.pr.crear(proveedor);
    }

    public Proveedor buscarPorId(Integer id) {
        return this.pr.read(id);
    }

    public void actualizar(Proveedor proveedor) {
        this.pr.update(proveedor);
    }

    public void eliminar(Integer id) {
        this.pr.delete(id);
    }
}
