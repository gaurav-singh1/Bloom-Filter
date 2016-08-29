package hello_files;

import java.math.BigInteger;
import java.security.*;
 
public class SHA1 {
    public static String GenerateHash(String input) throws NoSuchAlgorithmException {
    	
        MessageDigest objSHA = MessageDigest.getInstance("SHA-1");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(16);
		
        // pad with 0 if the hexa digits are less then 40.
        while (strHashCode.length() < 40) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }
    
    
    public static void main(String args[]) throws NoSuchAlgorithmException{
    	
    	
   String hash =	SHA1.GenerateHash("google");
    	
    System.out.println(hash);
    	
   /* 	String str="google";
    	
    	System.out.println(str.getBytes());
    	
    	byte[] x=str.getBytes();
    	
    	/*
    	
    	String password = "123456";

        MessageDigest md = MessageDigest.getInstance("MD5");
        System.out.println(password.getBytes());
    
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        
        System.out.println("Digest(in hex format):: " + sb.toString());
        
        
        */
    	
    	
    	
    }
}

