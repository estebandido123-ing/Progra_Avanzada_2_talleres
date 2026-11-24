package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import pa2_u2_p7_ec.Pedidos.Domain.Model.Cliente;

public interface ClienteRepository {

    public void crear(Cliente cliente);

    public Cliente read(Integer id);

    public void update(Cliente cliente);

    public void delete(Integer id);
}
