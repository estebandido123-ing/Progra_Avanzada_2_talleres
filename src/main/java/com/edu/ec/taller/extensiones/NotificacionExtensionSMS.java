package com.edu.ec.taller.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionSMS implements NotificacionExtensiones {


    public void enviar(String destinatario, String mensaje) {
        
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        System.out.println("se ha Enviado SMS ");

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
