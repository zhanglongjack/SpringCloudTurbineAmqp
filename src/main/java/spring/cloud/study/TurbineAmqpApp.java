package spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineAmqpApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(TurbineAmqpApp.class,args) ;
    }
}
