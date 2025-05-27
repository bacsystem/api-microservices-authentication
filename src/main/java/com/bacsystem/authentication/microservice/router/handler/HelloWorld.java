package com.bacsystem.authentication.microservice.router.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * <b>HelloWorld</b>
 * <p>
 * This class specifies the requirements for the {@link HelloWorld} component,
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
@Component
public class HelloWorld {


    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        request.attributes().forEach((s, o) -> log.info("key [{}] - value [{}]", s, o));
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(List.of("Hola")), List.class);
    }
}
