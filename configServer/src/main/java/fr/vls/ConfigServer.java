package fr.vls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Keep the Properties file centralized and shared by all Microservices
 *  manages all microservices properties files and how those files are versioned controlled
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServer.class, args);
    }
}
