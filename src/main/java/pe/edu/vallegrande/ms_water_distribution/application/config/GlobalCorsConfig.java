package pe.edu.vallegrande.ms_water_distribution.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration config = new CorsConfiguration();
        
        // ¡Esta es la clave! addAllowedOriginPattern (no addAllowedOrigin)
        config.addAllowedOriginPattern("*"); // ← 👈 Esto permite CORS desde cualquier dominio
        config.addAllowedMethod("*");        // GET, POST, PUT, DELETE, etc.
        config.addAllowedHeader("*");        // Todos los headers permitidos
        config.setAllowCredentials(false);   // O true si usas cookies/autenticación

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }
}
