package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public byte[] encrypt(byte[] data, Key key) {

        try {
            SecretKey secretKey = new SecretKeySpec(key.getKeyBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(data);
        } catch (NoSuchAlgorithmException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException |
                 NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] decrypt(byte[] encryptedData, Key key) {

        try {
        SecretKey secretKey = new SecretKeySpec(key.getKeyBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return cipher.doFinal(encryptedData);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException |
                 InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
