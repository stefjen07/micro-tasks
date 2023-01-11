package org.example.abstractfactory.iron;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.Door;
import org.example.abstractfactory.Sword;

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
