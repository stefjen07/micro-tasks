package com.stefjen07.abstractfactory.wooden;

import com.stefjen07.abstractfactory.Door;

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
