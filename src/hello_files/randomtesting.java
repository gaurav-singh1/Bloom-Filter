package hello_files;

import hello_files.MurmurHash3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.Random;

public class randomtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * this is the class made for testing the git hub from terminal only....
		 */
		
	MurmurHash3 mh=new MurmurHash3();
		
		String str="abcdef";
		
		
		/*byte[] bytes=ByteBuffer.allocate(4).putInt(x).array();
		System.out.println("bytes of 42="+bytes);
		int hashcode=mh.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
		
		System.out.println("hashcode for x="+hashcode);
		
		*/
		
	int num=129;
	int m=128;
	System.out.println(num & (m-1));
		
	}
	
	public static String toHexString(int decimal)
	{
	    String codes = "0123456789ABCDEF";

	    StringBuilder builder = new StringBuilder(8);

	    builder.setLength(8);

	    for (int i = 7; i >= 0; i--) {
	        builder.setCharAt(i, codes.charAt(decimal & 0xF));
	        decimal >>= 4;
	    }

	    return builder.toString();
	}
	
	
	
	
}




