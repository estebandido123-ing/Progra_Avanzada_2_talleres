package com.edu.ec.taller;

import com.edu.ec.taller.extensiones.NotificacionExtensiones;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped 
public class CompraService {

   

  

     public void realizar(Compra compra, NotificacionExtensiones notificacionExtension) {

        System.out.println("Pedido realizado paa el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total : " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());

        //aqui voy a programar el envio de notificacion por correo y sms

        notificacionExtension.enviar(compra.getCorreo(), "Su pedido ha sido realizado con éxito. Estimado: " + compra.getCliente());
        

      
        
       }


}
