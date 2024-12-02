package com.gca.Models;

import java.util.Base64;

public class Tools {

    private String query = null;



    public static String encryptPassword(String password) {
        Base64.Encoder encoder = Base64.getEncoder();
        String originalString = password;
        String encodedString = encoder.encodeToString(originalString.getBytes());
//        System.out.println("Encrypted Value :: " + encodedString);
        return encodedString;
    }

    public static String decryptPassword(String Password) {
        System.out.println("Password " + Password);
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(Password);
//        System.out.println("Decrypted Value :: " +new String(bytes));
        return new String(bytes);
    }
}
