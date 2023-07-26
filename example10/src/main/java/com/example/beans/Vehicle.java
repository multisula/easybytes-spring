package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
  public Vehicle() {
    System.out.println("Person bean created by Spring");
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printHello() {
    System.out.println(
        "Printing Hello from component Vehicle Bean");
  }

  @Override
  public String toString() {
    return "Vehicle name is - " + name;
  }
}
