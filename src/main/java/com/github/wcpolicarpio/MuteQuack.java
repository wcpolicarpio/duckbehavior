package com.github.wcpolicarpio;

/**
 * @author wpolicarpio
 * @package com.github.wcpolicarpio
 * @project duckbehavior
 * @date 1/23/2018
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
