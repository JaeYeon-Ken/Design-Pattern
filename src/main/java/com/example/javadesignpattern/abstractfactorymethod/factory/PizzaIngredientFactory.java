/*
 * Created by Jaeyeon Kim on 2022/10/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <jaeyeon_kim@bigin.io>, 2022/10/03
 */

package com.example.javadesignpattern.abstractfactorymethod.factory;

import com.example.javadesignpattern.abstractfactorymethod.pizza.ingredient.Dough;
import com.example.javadesignpattern.abstractfactorymethod.pizza.ingredient.Sauce;

/**
 * create on 2022/10/03. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Jaeyeon Kim
 * @version 1.0
 * @since 1.0
 */
public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
}
