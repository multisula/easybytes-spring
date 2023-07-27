package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {
  @Bean
  public Vehicle vehicle1() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Audi");
    return vehicle;
  }

  @Qualifier("veh2")
  @Bean
  public Vehicle vehicle2() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Honda");
    return vehicle;
  }

  @Primary
  @Bean
  public Vehicle vehicle3() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Ferrari");
    return vehicle;
  }
}
