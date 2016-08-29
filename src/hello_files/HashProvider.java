package hello_files;


import java.math.BigInteger;
import java.security.*;

public class HashProvider {
	
	public static String hash(String str, String hashfn) throws NoSuchAlgorithmException{
		String hexcode;
		
		
		if(hashfn== "MD5")
			hexcode= MD5(str);
		
		else if(hashfn== "SHA1")
			hexcode= SHA1(str);
		
		else
			hexcode= MURMUR3(str);
		
		
		
		return hexcode;
		
			
		
	}

	private static String MURMUR3(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String SHA1(String input) throws NoSuchAlgorithmException {
		
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

	private static String MD5(String input) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		 MessageDigest m=MessageDigest.getInstance("MD5");
	       
	        m.update(input.getBytes(),0,input.length());
	        
	        String strHashCode=new BigInteger(1,m.digest()).toString(16);
	        
	        return strHashCode;
	}
}
