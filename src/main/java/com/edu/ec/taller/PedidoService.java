package com.edu.ec.taller;

import com.edu.ec.taller.Interceptors.Auditoria;
import com.edu.ec.taller.Interceptors.MedirTiempo;
import com.edu.ec.taller.Interceptors.NotificacionMail;
import com.edu.ec.taller.Interceptors.NotificacionSMS;

import jakarta.enterprise.context.ApplicationScoped;

 
@ApplicationScoped  
public class PedidoService {



    @Auditoria
    @MedirTiempo 
    @NotificacionMail 
    @NotificacionSMS  
    public String realizar(Pedido pedido, String valor1){

      

        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total : " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
 
        System.out.println("Pedido realizado con exito");
 

        /*no necesariamente tendremos un solo interceptor
        se puede necesitar n interceptores, 
        cada interceptor tiene que tener su tarea bien definidia
        es decir, necesito un interceptor para auditar, otro para loguear, otro para validar, etc



         */
        return "Pedido realizado con exito";
    }
 
}