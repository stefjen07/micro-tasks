package com.stefjen07.decorator;

public interface DataSource {
    void writeData(byte[] data);
    byte[] readData();
}
