package pa2_u2_p7_ec.Pedidos.Application;

import java.util.stream.Gatherer.Integrator;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

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

}