package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.example.implementation", "com.example.services"})
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class, com.example.beans.Person.class})
public class ProjectConfig {

}
