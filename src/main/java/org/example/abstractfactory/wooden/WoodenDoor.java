package org.example.abstractfactory.wooden;

import org.example.abstractfactory.Door;

public class WoodenDoor implements Door {
    @Override
    public boolean open() {
        return true;
    }

    @Override
    public boolean forceOpen() {
        return true;
    }

    @Override
    public void lock() {

    }
}
