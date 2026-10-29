package com.edu.ec.taller.Interceptors;

import java.lang.reflect.Parameter;

import com.edu.ec.taller.AuditoriaService;
import com.edu.ec.taller.Pedido;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria 
@Interceptor 
public class AuditoriaInterceptor {

    @Inject 
    private AuditoriaService auditoriaService;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {
        System.out.println("Interceptando el metodo: " + context.getMethod().getName());
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor antes de ejecutar el metodo");
        
        Parameter[] parametros = context.getMethod().getParameters(); 
        
        for(Parameter parametro : parametros) {
            System.out.println("Parametro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];

        String cliente = pedido.getCliente();
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();

        this.auditoriaService.guardarEnLaBaseDeDatos(cliente, total, correo);

        Object resultado = context.proceed(); //ejecuta el metodo interceptado
        System.out.println("Mensaje luego de ejecutar el metodo: " + resultado);
        System.out.println("Retornando el resultado del metodo interceptado"+ resultado);
        
        return resultado;
    }
    

}
