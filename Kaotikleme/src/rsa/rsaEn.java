package rsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class rsaEn {
    
    static String plainText;
    private PublicKey pubKey;
    private String text;

    public rsaEn(String _plaintext, PublicKey _pubKey) throws NoSuchAlgorithmException, Exception {
        plainText = _plaintext;
        pubKey = _pubKey;
        System.out.println("Original Text  : "+plainText);
        byte[] cipherTextArray = encrypt(plainText, pubKey);
        String encryptedText = Base64.getEncoder().encodeToString(cipherTextArray);
        System.out.println("Encrypted Text : "+encryptedText);
        text = encryptedText;
    }
    
    public String ret(){
        return text;
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
