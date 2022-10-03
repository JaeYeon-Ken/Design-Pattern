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
public abstract class Pizza {

  protected String name;
  protected String dough;
  protected String sauce;

  public void prepare() {
    this.name = "pizza";
    this.dough = "dough";
    this.sauce = "sauce";
    System.out.println("prepare - " + name + ", " + dough + ", " + sauce);
  }

  public void bake() {
    System.out.println("Pizza.bake");
  }

  public void cut() {
    System.out.println("Pizza.cut");
  }

  public void box() {
    System.out.println("box - " + name + ", " + dough + ", " + sauce);
  }

}
