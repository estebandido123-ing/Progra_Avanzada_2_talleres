package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import pa2_u2_p7_ec.Pedidos.Domain.Model.Factura;

public interface FacturaRepository {

    public void crear(Factura factura);

    public Factura read(Integer id);

    public void update(Factura factura);

    public void delete(Integer id);
}
