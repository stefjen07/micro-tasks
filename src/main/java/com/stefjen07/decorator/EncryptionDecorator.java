package com.stefjen07.decorator;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionDecorator extends DataSourceDecorator {
    Cipher encryptor;
    Cipher decryptor;

    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);

        try {
            var key = new SecretKeySpec("some_key".getBytes(), "AES");

            encryptor = Cipher.getInstance("AES");
            encryptor.init(Cipher.ENCRYPT_MODE, key);

            decryptor = Cipher.getInstance("AES");
            decryptor.init(Cipher.DECRYPT_MODE, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeData(byte[] data) {
        try {
            var encryptedData = encryptor.doFinal(data);
            super.writeData(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] readData() {
        var encryptedData = super.readData();
        try {
            return decryptor.doFinal(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new byte[0];
    }
}
