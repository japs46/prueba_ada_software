package app.prueba.ada;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Prueba Ada")
				.version("1.0")
				.description("Documentación del Crud de la prueba de Ada"));
	}

}
