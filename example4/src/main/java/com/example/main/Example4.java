package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Vehicle veh1 = context.getBean(Vehicle.class);
    System.out.println("Vehicle name from spring Context is: " + veh1.getName());
  }
}
