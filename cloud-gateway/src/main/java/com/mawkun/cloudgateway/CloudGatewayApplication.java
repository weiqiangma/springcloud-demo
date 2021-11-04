package com.mawkun.cloudgateway;

import com.mawkun.cloudgateway.filter.ElapsedFilter;
import com.mawkun.cloudgateway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        // @formatter:off
        return builder.routes()
                .route(r -> r.path("/gateway/customer/**")
                        .filters(f -> f.stripPrefix(2)
                                .filter(new ElapsedFilter())
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("lb://EUREKA-FEIGN")
                        .order(0)
                        .id("gateway_customer_service")
                )
                .build();
        // @formatter:on
    }

}
