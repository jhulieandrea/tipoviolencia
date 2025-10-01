package com.shoutit.tipoviolencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de arranque para la aplicación Tipoviolencia.
 * 
 * La anotación @SpringBootApplication combina tres anotaciones clave:
 *   - @Configuration: indica que esta clase puede contener configuración de Spring.
 *   - @EnableAutoConfiguration: permite que Spring Boot configure automáticamente
 *     los componentes necesarios (JPA, REST, seguridad, etc.) según las dependencias.
 *   - @ComponentScan: habilita la detección automática de beans (controladores,
 *     servicios, repositorios, etc.) dentro del paquete base y sus subpaquetes.
 */
@SpringBootApplication
public class TipoviolenciaApplication {

    /**
     * Método principal que arranca la aplicación Spring Boot.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Llama al método run de SpringApplication, que inicializa
        // el contexto de Spring y levanta el servidor embebido (por defecto Tomcat).
        SpringApplication.run(TipoviolenciaApplication.class, args);
    }
}
