package hello_files;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.Random;

//import com.skjegstad.utils.BloomFilter;

public class HelloWorld {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("hello world:  sample program....");
		 * BloomFilter<Integer> bf = new BloomFilter<Integer>(0.01, 10); int a[]
		 * = {1,2,3,4,5,6,7,8,9,10}; for(int i=0;i<10 ;i++) bf.add(a[i]);
		 * 
		 * 
		 * 
		 * System.out.println("the answer of checking 2 in the list="+bf.contains
		 * (100));
		 * 
		 * System.out.println(bf.expectedFalsePositiveProbability());
		 */
		
		/*MessageDigest cryptHash = MessageDigest.getInstance("MD5");
		cryptHash.update("google".getBytes());
		
		System.out.println("digest use case=" + cryptHash.digest("google".getBytes()));
		byte[] digest = new byte[0];
		
		
		
		digest=cryptHash.digest("google".getBytes());
		
		BitSet hashed = BitSet.valueOf(digest);
		
		System.out.println("bit set use cse="+ hashed);
		
		int m=1000;
		
		int filterSize = 32 - Integer.numberOfLeadingZeros(m);
		
		System.out.println("filtersize="+filterSize);
		
		 int hashBits = digest.length * 8;
		 
		 System.out.println("hashbits use case= " + hashBits);
		 
		 
		 */
	
		/*
	int[] arr=update(1,2);
	
	for(int i=0;i<2;i++)
		System.out.println(arr[i]);
	*/
	
		
		
		
		
	}

	private static int[] update(int i, int j) {
		// TODO Auto-generated method stub
		int[] arr=new int[j];
		
		for(int k=0;k<j;k++)
			arr[k]=k;
		
		return arr;
			
		
	}

}
