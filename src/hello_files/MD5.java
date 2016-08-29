


package hello_files;

import java.security.*;
import java.util.BitSet;
import java.util.Random;
import java.math.*;

public class MD5 {
    public static void main(String args[]) throws Exception{
    	
    	
    	
        String s="google";
        MessageDigest m=MessageDigest.getInstance("MD5");
       
        m.update(s.getBytes(),0,s.length());
        System.out.println(new BigInteger(1,m.digest()).toString(16));
        
        
      
        
       
       
      
       
       Integer outputDecimal = Integer.parseInt("fffffffffffffffffffffffffffffff", 16);
		System.out.println("Decimal Equivalent : "+outputDecimal);
       
       
       //declare string containing hexadecimal number
    //   String strHexNumber = "c822c1b63853ed273b89687ac505f9fa";
       
      
      
       
       
        
        
     
       }
       
       
      
       
       
       //System.out.println("ans ishex code for 16 bit ===" + Integer.parseInt("c822c1b63853ed273b89687ac505f9fa", 16));
       
      /**
       * 
       * 
       206
       914
       920
       731
       800
       477
       956
       604
       367
       792
       
        */

       
       //System.out.println(toBytes("hello"));
       
       
       
        
    }



