package pa2_u2_p7_ec.Pedidos.Domain.Repository;

import java.util.List;
import java.util.Optional;

import pa2_u2_p7_ec.Pedidos.Domain.Model.Pedido;

public interface PedidoRepository {
    
    //cread
    public void crear(Pedido pedido);

    //read por id
    public Pedido read(Integer id);

    public Optional<Pedido> readByNumero(String numero);

    public List<Pedido> readAll();


    //update
    public void update(Pedido pedido);

    //delete
    public void delete(Integer id);

    public Object read(String id);


}
