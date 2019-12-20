package rsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class rsa {
    
    private PrivateKey privateKey;
    private PublicKey publicKey;
    static String plainText;
    
    public static Object[] uret() throws NoSuchAlgorithmException{
        Object[] keys = new Object[2];
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(4096);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        keys[0] = privateKey;
        keys[1] = publicKey;
        return keys;
    }
    
    public rsa() throws NoSuchAlgorithmException, Exception {    
    }
    
    public static byte[] sifrele(String plainText,PublicKey publicKey) throws Exception {
        byte[] cipherTextArray = encrypt(plainText, publicKey);
        return cipherTextArray;
    }
    
    public static String sifreAc(byte[] cipherText, PrivateKey privateKey) throws Exception {
        String decryptedText = decrypt(cipherText, privateKey);
        return decryptedText;
    }
    
 
    
    public static byte[] encrypt (String plainText,PublicKey publicKey) throws Exception
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        
        byte[] cipherText = cipher.doFinal(plainText.getBytes()) ;

        return cipherText;
    }
    
    public static String decrypt (byte[] cipherTextArray, PrivateKey privateKey) throws Exception
    {
        
        
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        
        byte[] decryptedTextArray = cipher.doFinal(cipherTextArray);
        
        return new String(decryptedTextArray);
    }
    
    
}