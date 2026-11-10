package com.edu.ec.taller.extensiones;

public interface NotificacionExtensiones {
    
    void enviar(String destinatario, String mensaje);
    int getCantidad();
    void setCantidad(int cantidad);
    String getNombre();

}
