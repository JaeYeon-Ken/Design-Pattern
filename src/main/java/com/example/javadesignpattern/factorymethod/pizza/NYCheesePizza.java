/*
 * Created by Jaeyeon Kim on 2022/10/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <jaeyeon_kim@bigin.io>, 2022/10/03
 */

package com.example.javadesignpattern.factorymethod.pizza;

/**
 * create on 2022/10/03. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Jaeyeon Kim
 * @version 1.0
 * @since 1.0
 */
public class NYCheesePizza extends Pizza {
  @Override
  public void prepare() {
    // 재료만 다르고 나머지 bake, cut, box 과정은 동일하다고 가정
    super.name = "NY cheesePizza";
    super.dough = "NY cheeseDough";
    super.sauce = "NY cheeseSauce";
    System.out.println("prepare - " + super.name + ", " + super.dough + ", " + super.sauce);
  }

}
