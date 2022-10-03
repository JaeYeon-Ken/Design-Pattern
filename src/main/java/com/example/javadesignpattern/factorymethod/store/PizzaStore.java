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
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    /**
     * before
     */
//    Pizza pizza = simplePizzaFactory.createPizza(type);

    /**
     * after
     */
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  /**
   * 팩토리 메서드 (타입에 따른 pizza 인스턴스를 설정하는 메서드)를 추상 메서드로 선언
   *
   * 간단한 팩토리에선 팩토리가 PizzaStore 안에 포함되는 별개의 객체였지만, 팩토리 메서드 패턴은
   * createPizza 가 어떤 피자를 만들 지 각 지점(NYPizzaStore, KRPizzaStore)에서 결정하므로
   * 더 유연함. -> 이건 그냥 depth 가 하나 더 생긴 차이 아닌가 ??
   *
   */
  public abstract Pizza createPizza(String type);
}
