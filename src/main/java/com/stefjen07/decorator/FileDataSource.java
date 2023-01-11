package com.stefjen07.decorator;

import java.io.*;

public class FileDataSource implements DataSource{
    File file;

    FileDataSource(File file) {
        this.file = file;
    }

    @Override
    public void writeData(byte[] data) {
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(data);
            outputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public byte[] readData() {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] result = inputStream.readAllBytes();
            inputStream.close();

            return result;
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return new byte[0];
    }
}
