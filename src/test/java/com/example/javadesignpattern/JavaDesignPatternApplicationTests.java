package com.example.javadesignpattern;

import com.example.javadesignpattern.abstractfactorymethod.store.KRPizzaStore;
import com.example.javadesignpattern.abstractfactorymethod.store.NYPizzaStore;
import com.example.javadesignpattern.abstractfactorymethod.store.PizzaStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaDesignPatternApplicationTests {
  @Test
  void contextLoads() {
    PizzaStore krPizzaStore = new KRPizzaStore();
    PizzaStore nyPizzaStore = new NYPizzaStore();

    krPizzaStore.orderPizza("cheese");

    System.out.println("====================================");

    nyPizzaStore.orderPizza("cheese");

  }

}
