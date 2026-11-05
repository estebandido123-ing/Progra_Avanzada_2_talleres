package com.edu.ec.taller.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 1)
public class MedirTiempoInterceptor {


    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {
        long init= System.currentTimeMillis();
        Object resultado = context.proceed(); //ejecuta el metodo interceptado
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución MedirTiempo: " + (end - init) + " ms");
        return resultado;
    }

    //vamos a implementar dos interceptores, con prioridad application, un SMS y Mail
    //que es un directorio reativo?

}
