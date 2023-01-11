package com.stefjen07.abstractfactory.iron;

import com.stefjen07.abstractfactory.Door;

public class IronDoor implements Door {
    boolean isLocked;
    int hp = 3;

    @Override
    public boolean open() {
        return !isLocked;
    }

    @Override
    public boolean forceOpen() {
        hp -= 1;
        return !isLocked || hp < 0;
    }

    @Override
    public void lock() {
        isLocked = !isLocked;
    }
}
