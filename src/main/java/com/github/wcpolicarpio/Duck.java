package com.github.wcpolicarpio;

/**
 * @author wpolicarpio
 * @package com.github.wcpolicarpio
 * @project duckbehavior
 * @date 1/23/2018
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void  performFly(){
        flyBehavior.fly();
    }

    public void  performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
