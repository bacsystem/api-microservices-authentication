package com.bacsystem.authentication.microservice.router;

import com.bacsystem.authentication.microservice.router.handler.HelloWorld;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

/**
 * <b>ApplicationRouterFunction</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationRouterFunction} component,
 * developed in accordance with the development standards established by christian.
 * Collaboration is encouraged for the enhancement and expansion of the api-microservices-authentication.
 * </p>
 * <p>
 * <b>Description:</b>
 * </p>Here!</p>
 *
 * @author christian
 * @author dbacilio88@outlook.es
 * @since 26/05/2025
 */

@Log4j2
@Configuration
@AllArgsConstructor
public class ApplicationRouterFunction {

    private final HelloWorld helloWorld;

    @Bean
    public RouterFunction<ServerResponse> getHelloWorld() {
        return RouterFunctions.route(
                RequestPredicates.GET("/hello-world"), helloWorld::helloWorld);
    }
}
