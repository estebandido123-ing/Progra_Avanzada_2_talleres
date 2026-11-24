package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import pa2_u2_p7_ec.Pedidos.Domain.Model.Producto;

public interface ProductoRepository {

    public void crear(Producto producto);

    public Producto read(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);
}