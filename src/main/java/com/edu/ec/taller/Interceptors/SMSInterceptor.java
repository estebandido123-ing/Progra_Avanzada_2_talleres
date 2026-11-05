package com.edu.ec.taller.Interceptors;

import com.edu.ec.taller.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@NotificacionSMS
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 3) 
public class SMSInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        System.out.println("[SMS Interceptor] Verificando datos para envío de SMS...");
        long init= System.currentTimeMillis();
        System.out.println();
        System.out.println("");
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución SMS: " + (end - init) + " ms");
        Object resultado = context.proceed(); 
        
        Object[] valores = context.getParameters();
        if (valores.length > 0 && valores[0] instanceof Pedido) {
            Pedido pedido = (Pedido) valores[0];
            System.out.println("[SMS Interceptor] Enviando SMS de confirmación al número: " + pedido.getTelefono());
        }
        
        return resultado;
    }
}