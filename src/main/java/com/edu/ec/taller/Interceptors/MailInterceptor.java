package com.edu.ec.taller.Interceptors;

import com.edu.ec.taller.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@NotificacionMail
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 4) 
public class MailInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        System.out.println("[Mail Interceptor] Preparando servidor de correos...");
        long init= System.currentTimeMillis();
        System.out.println();
        System.out.println("");
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución Mail: " + (end - init) + " ms");
        Object resultado = context.proceed();
        
        Object[] valores = context.getParameters();
        if (valores.length > 0 && valores[0] instanceof Pedido) {
            Pedido pedido = (Pedido) valores[0];
            System.out.println("[Mail Interceptor] Enviando comprobante por correo a: " + pedido.getCorreo());
        }
        
        return resultado;
    }
}
