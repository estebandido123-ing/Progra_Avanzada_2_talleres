package pa2_u2_p7_ec.Pedidos.Application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Pedido;
import pa2_u2_p7_ec.Pedidos.Domain.Repository.PedidoRepository;

@ApplicationScoped 
@Transactional 
public class PedidoService {

    @Inject 
    private PedidoRepository pr;

    public void guaradar(Pedido pedido){
        this.pr.crear(pedido);
    }
    
    public Pedido buscarPorId(Integer id){
        return this.pr.read(id);
    }

    public void actualizar(Pedido pedido){
        this.pr.update(pedido);
    }

    public void  eliminar(Integer id){
        this.pr.delete(id);
    }

    public Optional<Pedido> buscarPorNumero(String id){
        return Optional.empty();
    }

}