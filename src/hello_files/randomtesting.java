package hello_files;

import java.nio.ByteBuffer;

public class randomtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * this is the class made for testing the git hub from terminal only....
		 */
		
		MurmurHash3 mh=new MurmurHash3();
		
		String str="42";
		int x=42;
		/*byte[] bytes=ByteBuffer.allocate(4).putInt(x).array();
		System.out.println("bytes of 42="+bytes);
		int hashcode=mh.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
		
		System.out.println("hashcode for x="+hashcode);
		
		*/
		
		int key=hash32shift(x);
		
		System.out.println("hsh code for int 42="+key);
	}
	
	
	public static int hash32shift(int key)
	{
	  key = ~key + (key << 15); // key = (key << 15) - key - 1;
	  key = key ^ (key >>> 12);
	  key = key + (key << 2);
	  key = key ^ (key >>> 4);
	  key = key * 2057; // key = (key + (key << 3)) + (key << 11);
	  key = key ^ (key >>> 16);
	  return key;
	}


	public static int hash(int x) {
	    x = ((x >>> 16) ^ x) * 0x45d9f3b;
	    x = ((x >>> 16) ^ x) * 0x45d9f3b;
	    x = (x >>> 16) ^ x;
	    return x;
	}
}




