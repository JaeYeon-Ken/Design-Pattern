package com.example.javadesignpattern;

import com.example.javadesignpattern.simplefactory.PizzaStore;
import com.example.javadesignpattern.simplefactory.SimplePizzaFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaDesignPatternApplicationTests {
  @Test
  void contextLoads() {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

    pizzaStore.orderPizza("cheese");

    System.out.println("====================================");

    pizzaStore.orderPizza("veggie");
  }

}
