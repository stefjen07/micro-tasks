package com.stefjen07.abstractfactory.wooden;

import com.stefjen07.abstractfactory.AbstractFactory;
import com.stefjen07.abstractfactory.Door;
import com.stefjen07.abstractfactory.Sword;

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
