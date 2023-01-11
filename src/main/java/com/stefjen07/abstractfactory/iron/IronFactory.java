package com.stefjen07.abstractfactory.iron;

import com.stefjen07.abstractfactory.AbstractFactory;
import com.stefjen07.abstractfactory.Door;
import com.stefjen07.abstractfactory.Sword;

public class IronFactory implements AbstractFactory {
    @Override
    public Door createDoor() {
        return new IronDoor();
    }

    @Override
    public Sword createSword() {
        return new IronSword();
    }
}
