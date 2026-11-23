package pa2_u2_p7_ec;
import java.time.LocalDateTime;

import ec.edu.uce.pa.grupo.u2.pedidos.aplication.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;    


    public static void main(String[] args){
        Quarkus.run(Main.class,args);
    }


    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello Quarkus! ");

        Pedido p1 = new Pedido();

        p1.setProducto("Prodcuto d eprueba");
        p1.setPrecio(1.1);
        p1.setFecha(LocalDateTime.now());

        this.pedidoService.guaradar(p1);


       return 0;
    }

}