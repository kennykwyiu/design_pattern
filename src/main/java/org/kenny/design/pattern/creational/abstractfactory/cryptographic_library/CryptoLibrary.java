package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public class CryptoLibrary {
    private CryptoFactory cryptoFactory;

    public CryptoLibrary(CryptoFactory cryptoFactory) {
        this.cryptoFactory = cryptoFactory;
    }

    public void useCryptoComponents() {
        EncryptionAlgorithm encryptionAlgorithm = cryptoFactory.createEncryptionAlgorithm();
        KeyManagementStrategy keyManagementStrategy = cryptoFactory.createKeyManagementStrategy();
        SecureProtocol secureProtocol = cryptoFactory.createSecureProtocol();

        // Use the created components
//        encryptionAlgorithm.encrypt();
//        keyManagementStrategy.generateKeys();
        secureProtocol.establishSecureConnection();
    }

    public static void main(String[] args) {
        CryptoLibrary aesLibrary = new CryptoLibrary(new AESCryptoFactory());
        aesLibrary.useCryptoComponents();

        CryptoLibrary rsaLibrary = new CryptoLibrary(new RSACryptoFactory());
        rsaLibrary.useCryptoComponents();
    }
}
