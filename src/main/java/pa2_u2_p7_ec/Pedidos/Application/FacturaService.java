package pa2_u2_p7_ec.Pedidos.Application;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Factura;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.FacturaRepository;

@ApplicationScoped
@Transactional
public class FacturaService {

    @Inject
    private FacturaRepository fr;

    public void guardar(Factura factura) {
        this.fr.crear(factura);
    }

    public Factura buscarPorId(Integer id) {
        return this.fr.read(id);
    }

    public void actualizar(Factura factura) {
        this.fr.update(factura);
    }

    public void eliminar(Integer id) {
        this.fr.delete(id);
    }
}