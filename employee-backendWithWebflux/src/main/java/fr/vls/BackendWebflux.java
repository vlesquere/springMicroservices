package fr.vls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
