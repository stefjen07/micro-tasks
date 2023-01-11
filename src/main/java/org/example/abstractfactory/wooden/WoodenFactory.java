package org.example.abstractfactory.wooden;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.Door;
import org.example.abstractfactory.Sword;

public class WoodenFactory implements AbstractFactory {
    @Override
    public Sword createSword() {
        return new WoodenSword();
    }

    @Override
    public Door createDoor() {
        return new WoodenDoor();
    }
}
