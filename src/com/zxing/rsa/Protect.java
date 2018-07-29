package com.zxing.rsa;

public class Protect {
    public Protect(){

        byte[] decBytes = RSAAlgorithm.decrypt(RSAAlgorithm.privateKey, RSAAlgorithm.resultBytes);
        String dec = new String(decBytes);
        
        //System.out.println("DEC:" + dec);
    }
}