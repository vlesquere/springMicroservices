package fr.vls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.ipc.netty.http.server.HttpServer;

import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BackendWebflux
{

    public static void main( String[] args )
    {
        SpringApplication.run(BackendWebflux.class, args);
    }



}
