package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Cliente;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.ClienteRepository;

@ApplicationScoped
@Transactional
public class ClienteService {

    @Inject
    private ClienteRepository cr;

    public void guardar(Cliente cliente) {
        this.cr.crear(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return this.cr.read(id);
    }

    public void actualizar(Cliente cliente) {
        this.cr.update(cliente);
    }

    public void eliminar(Integer id) {
        this.cr.delete(id);
    }
}
