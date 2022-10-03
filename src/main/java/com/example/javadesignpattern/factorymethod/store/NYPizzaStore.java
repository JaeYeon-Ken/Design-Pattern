/*
 * Created by Jaeyeon Kim on 2022/10/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <jaeyeon_kim@bigin.io>, 2022/10/03
 */

package com.example.javadesignpattern.factorymethod.store;

import com.example.javadesignpattern.factorymethod.pizza.NYCheesePizza;
import com.example.javadesignpattern.factorymethod.pizza.NYPepperoniPizza;
import com.example.javadesignpattern.factorymethod.pizza.NYVeggiePizza;
import com.example.javadesignpattern.factorymethod.pizza.Pizza;

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

    if (type.equals("cheese")) {
      pizza = new NYCheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new NYVeggiePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NYPepperoniPizza();
    }

    return pizza;
  }
}
