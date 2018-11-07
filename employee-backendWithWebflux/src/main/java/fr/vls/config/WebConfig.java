package fr.vls.config;

import fr.vls.model.Employee;
import fr.vls.services.EmployeeHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routeShow(EmployeeHandler employeeHandler) {
        return route(path("/"), req -> ok().build())
                              .andRoute(GET("/employees"), employeeHandler::all)
                              .and(route(POST("/employees"),
                                    request -> {
                                        return employeeHandler.save(request.bodyToMono(Employee.class));
                                    }));
    }

}