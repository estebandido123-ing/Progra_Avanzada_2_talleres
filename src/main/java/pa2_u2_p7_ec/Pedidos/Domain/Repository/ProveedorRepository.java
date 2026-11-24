package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import pa2_u2_p7_ec.Pedidos.Application.Proveedor;

public interface ProveedorRepository {

    public void crear(Proveedor proveedor);

    public Proveedor read(Integer id);

    public void update(Proveedor proveedor);

    public void delete(Integer id);
}
