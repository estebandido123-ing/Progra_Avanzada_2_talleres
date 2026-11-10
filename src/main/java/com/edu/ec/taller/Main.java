package com.edu.ec.taller;

import com.edu.ec.taller.extensiones.NotificacionExtensionMail;
import com.edu.ec.taller.extensiones.NotificacionExtensionSMS;
import com.edu.ec.taller.extensiones.NotificacionExtensionWSP;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication{
 
    @Inject
    private CompraService CompraService;

    @Inject 
    private NotificacionExtensionMail notificacionExtensionMail;
    @Inject
    private NotificacionExtensionSMS notificacionExtensionSMS;
    @Inject 
    private NotificacionExtensionWSP notificacionExtensionWSP;

 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) {        
        System.out.println("Iniciando Aplicacion quarkus");
 
        Compra compra =  new Compra("Juan Peres", "laptop",150, "juansdsd" );
        compra.setTelefono("0999999999");
        this.CompraService.realizar(compra, this.notificacionExtensionMail);

        Compra compra2 =  new Compra("Maria Perez", "celular",250, compra.getCorreo() );
        compra2.setTelefono("0999999999");
        this.CompraService.realizar(compra2, this.notificacionExtensionSMS);
        
        Compra compra3 =  new Compra("Ana Gomez", "smartwatch",450, compra.getCorreo() );
        compra3.setTelefono("0999999999");
        this.CompraService.realizar(compra3, this.notificacionExtensionWSP);

        return 0;
    }
 
}