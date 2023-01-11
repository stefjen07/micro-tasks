package com.stefjen07.abstractfactory.wooden;

import com.stefjen07.abstractfactory.Enemy;
import com.stefjen07.abstractfactory.Sword;

public class WoodenSword implements Sword {
    @Override
    public void hit(Enemy enemy) {
        enemy.health -= 10;
    }
}
