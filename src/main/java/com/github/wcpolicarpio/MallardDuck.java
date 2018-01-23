package com.github.wcpolicarpio;

/**
 * @author wpolicarpio
 * @package com.github.wcpolicarpio
 * @project duckbehavior
 * @date 1/23/2018
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
