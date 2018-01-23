package com.github.wcpolicarpio;

/**
 * @author wpolicarpio
 * @package com.github.wcpolicarpio
 * @project duckbehavior
 * @date 1/23/2018
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
