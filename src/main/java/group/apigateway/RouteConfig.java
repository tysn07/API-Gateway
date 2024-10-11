package group.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator ms1Route(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("product", r -> r.path("/products/**")
                        .uri("http://localhost:8083"))
                .route("user", r -> r.path("/users/**")
                        .uri("http://localhost:8081"))
                .route("user", r -> r.path("/order/**")
                        .uri("http://localhost:8082"))
                .build();
    }
}
