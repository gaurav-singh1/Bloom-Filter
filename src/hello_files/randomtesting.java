package hello_files;

import hello_files.MurmurHash3;

import java.nio.ByteBuffer;

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
		
		
		System.out.println(str.getBytes());
		
		int hashcode;
		
		System.out.println("Producing different hash codes using different seeds....");
		for(int i=1;i<=10;i++){
			hashcode=mh.murmurhash3_x86_32(str, 0, str.length() , i);
			System.out.println(hashcode & 1035);
		}
		
		
		
		/*
		
		
		int x=12335;
		
		System.out.println(128 >>> 2);
		
		System.out.println("$$$$$$$$$$$$$$$$");
		int z= 1838383 & 1838383;
		
		System.out.println(z);
		
		*/
		System.out.println("$$$$$$$$$$$$$$$$");
		System.out.println( 0x6ddd &  0x7fffffff);
		
	}
	
	
	
	
	
}




