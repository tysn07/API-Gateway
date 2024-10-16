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
                .route("products", r -> r.path("/products/**")
                        .uri("http://3.39.43.179:8083"))
                .route("user", r -> r.path("/users/**")
                        .uri("http://15.165.174.43:8081"))
                .route("order", r -> r.path("/order/**")
                        .uri("http://15.165.174.43:8082"))
                .route("payment", r -> r.path("/payment/**")
                        .uri("http://3.39.43.179:8084"))
                .build();
    }
}
