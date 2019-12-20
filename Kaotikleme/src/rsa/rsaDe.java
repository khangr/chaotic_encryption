package rsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class rsaDe {
    
    static String plainText;
    private PublicKey pubKey;
    private String text;
    private PrivateKey priKey;

    public rsaDe(String _plaintext, PrivateKey _priKey) throws NoSuchAlgorithmException, Exception {
        plainText = _plaintext;
        priKey = _priKey;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(4096);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("Original Text  : "+plainText);
        byte[] cipherTextArray = encrypt(plainText, pubKey);
        String encryptedText = Base64.getEncoder().encodeToString(cipherTextArray);
        System.out.println("Encrypted Text : "+encryptedText);
        text = encryptedText;
    }
    
    public String ret(){
        return text;
    }
    
    public PublicKey retPub() {
        return pubKey;
    }
    
    public PrivateKey retPri() {
        return priKey;
    }
 
    private static byte[] encrypt (String plainText,PublicKey publicKey ) throws Exception
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        
        byte[] cipherText = cipher.doFinal(plainText.getBytes()) ;

        return cipherText;
    }
    
    private static String decrypt (byte[] cipherTextArray, PrivateKey privateKey) throws Exception
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        
        byte[] decryptedTextArray = cipher.doFinal(cipherTextArray);
        
        return new String(decryptedTextArray);
    }
}