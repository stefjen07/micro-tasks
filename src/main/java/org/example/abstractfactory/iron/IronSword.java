package org.example.abstractfactory.iron;

import org.example.abstractfactory.Enemy;
import org.example.abstractfactory.Sword;

public class IronSword implements Sword {
    @Override
    public void hit(Enemy enemy) {
        enemy.health -= 25;
    }
}
