package com.edu.ec.taller;

import com.edu.ec.taller.Interceptors.Auditoria;

import jakarta.enterprise.context.ApplicationScoped;

 
@ApplicationScoped  
public class PedidoService {

    @Auditoria 
    public String realizar(Pedido pedido, String valor1){

        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total : " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
 
        System.out.println("Pedido realizado con exito");
 
        return "Pedido realizado con exito";
    }
 
}