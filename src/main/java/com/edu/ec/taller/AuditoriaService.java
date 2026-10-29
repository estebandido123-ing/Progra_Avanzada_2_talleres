package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped
public class AuditoriaService {

    public void guardarEnLaBaseDeDatos(String cliente, double total, String correo) {
        System.out.println("Guardando en la base de datos: " + cliente + ", " + total + ", " + correo);
        System.out.println("Con la fecha y hora actual: " + java.time.LocalDateTime.now());
    }

}
