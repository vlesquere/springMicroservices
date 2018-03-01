package fr.vls;

import fr.vls.filter.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class EmployeeGateway
{
    public static void main( String[] args )
    {
       SpringApplication.run(EmployeeGateway.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
