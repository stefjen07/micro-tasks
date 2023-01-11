package org.example.abstractfactory.wooden;

import org.example.abstractfactory.Enemy;
import org.example.abstractfactory.Sword;

public class WoodenSword implements Sword {
    @Override
    public void hit(Enemy enemy) {
        enemy.health -= 10;
    }
}
