/*
 * Created by Jaeyeon Kim on 2022/10/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <jaeyeon_kim@bigin.io>, 2022/10/03
 */

package com.example.javadesignpattern.abstractfactorymethod.store;

import com.example.javadesignpattern.abstractfactorymethod.factory.NYPizzaIngredientFactory;
import com.example.javadesignpattern.abstractfactorymethod.factory.PizzaIngredientFactory;
import com.example.javadesignpattern.abstractfactorymethod.pizza.CheesePizza;
import com.example.javadesignpattern.abstractfactorymethod.pizza.PepperoniPizza;
import com.example.javadesignpattern.abstractfactorymethod.pizza.Pizza;
import com.example.javadesignpattern.abstractfactorymethod.pizza.VeggiePizza;

/**
 * create on 2022/10/03. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Jaeyeon Kim
 * @version 1.0
 * @since 1.0
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    if (type.equals("cheese")) {
      pizza = new CheesePizza(pizzaIngredientFactory);
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza(pizzaIngredientFactory);
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(pizzaIngredientFactory);
    }

    return pizza;
  }
}
