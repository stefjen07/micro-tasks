package com.stefjen07.decorator;

public class DataSourceDecorator implements DataSource {
    DataSource dataSource;

    DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(byte[] data) {
        dataSource.writeData(data);
    }

    @Override
    public byte[] readData() {
        return dataSource.readData();
    }
}
