package com.edu.ec.taller.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionWSP implements NotificacionExtensiones {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando notificación por WhatsApp a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }

    @Override
    public int getCantidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidad'");
    }

    @Override
    public void setCantidad(int cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCantidad'");
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }



}
