package com.stefjen07.abstractfactory.iron;

import com.stefjen07.abstractfactory.Enemy;
import com.stefjen07.abstractfactory.Sword;

public class IronSword implements Sword {
    @Override
    public void hit(Enemy enemy) {
        enemy.health -= 25;
    }
}
