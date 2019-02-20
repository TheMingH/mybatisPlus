package org.child.webApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableCaching
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.child"})
@MapperScan("org.child.mapper")
public class start {
      public static void main(String[] args) {
    	  ConfigurableApplicationContext  context=SpringApplication.run(start.class, args);
      }
      
}
