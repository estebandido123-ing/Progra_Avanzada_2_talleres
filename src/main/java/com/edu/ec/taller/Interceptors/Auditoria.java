package com.edu.ec.taller.Interceptors;

import java.lang.annotation.Retention;
import java.lang.annotation.Target; 
import jakarta.interceptor.InterceptorBinding;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@InterceptorBinding
@Retention (RetentionPolicy.RUNTIME)
@Target ({ElementType.METHOD, ElementType.TYPE})

public @interface Auditoria {

}





/*Las extensiones son una forma de agregar funcionalidad a un 
programa sin modificar el código fuente original. En este caso, 
se está utilizando la anotación @InterceptorBinding para crear una 
extensión que se puede 
aplicar a métodos o clases para interceptar su ejecución y 
realizar acciones adicionales antes o después de la ejecución del método.


las extensiones dicho de otra manera perminten ampliar las capacidades de mi framework 
o aplicación sin tener que modificar el código fuente original. Esto es útil para 
agregar funcionalidades como seguridad, registro de eventos, manejo de transacciones, 
entre otros, sin tener que cambiar el código existente. /personalizar mis funcionalidades 
sin tener que modificar el código fuente original.
se desarrolla con codigo modular, para ir moldeando o perfeccionando 
sin tener que modificar el código fuente original o logica principal de la aplicación.
para implementarlos, se utilizan las interfaces

 */