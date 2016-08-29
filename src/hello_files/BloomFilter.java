package hello_files;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

public class BloomFilter {

	private double falseprobability;
	private long n;
	private int m;
	private int k;
	private BitSet bloomfilter;
	
	
	public BloomFilter(long n, double p){
		
		this.n=n;
		
		falseprobability=p;
		
		m= optimalM(n, p);
		
		k= optimalK(n, m);
		
		bloomfilter= new BitSet(m);
		
		
		
		
	}
	
	
	public int optimalM(long n, double p) {
		return (int) Math.ceil(-1 * (n * Math.log(p))
				/ Math.pow(Math.log(2), 2));
	}

	public int optimalK(long n, long m) {
		return (int) Math.ceil((Math.log(2) * m) / n);
	}

	public void add(String str) throws NoSuchAlgorithmException{
		
		
		String hex1= HashProvider.hash(str, "MD5");
		
		String hex2= HashProvider.hash(str,"SHA1");
		
		
		
		BigInteger decicode1= hextodecimal(hex1);									//new BigInteger(hash1,16);
		BigInteger decicode2= hextodecimal(hex2);									//new BigInteger(hash2,16);
		
		
		
		int[] position= caculatehashposition(decicode1,decicode2, this.k); 				//h_i= h_1 + h_2 * k_i
		
		
		
		
		/**
		 * element added : bit set to true at position[k] in the BitSet bloomfilter
		 */
		for(int i=0;i<k;i++)
			this.bloomfilter.set(position[i]);
		
		
		
		
		
	}
	
	
	
	
	
	private int[] caculatehashposition(BigInteger decicode1,
			BigInteger decicode2, int k2) {
		// TODO Auto-generated method stub
		int[] position=new int[k2];
		BigInteger index;
		BigInteger decicode_k;
		BigInteger k;
		
		for(int i=0;i<k2;i++){
		
		k=BigInteger.valueOf(k2);
		
		decicode_k= decicode1.add(decicode2.multiply(k));
		index=decicode_k.mod(BigInteger.valueOf(this.m));
		position[i]= index.intValue();
		}
		
		return position ;
	}


	private BigInteger hextodecimal(String hex) {
		// TODO Auto-generated method stub
		return new BigInteger(hex,16);
	}
	
	
	
	private boolean contains(String str) throws NoSuchAlgorithmException{
		boolean result = true;
		
		String hex1= HashProvider.hash(str, "MD5");
		String hex2= HashProvider.hash(str,"SHA1");
		
		BigInteger decicode1= hextodecimal(hex1);									//new BigInteger(hash1,16);
		BigInteger decicode2= hextodecimal(hex2);									//new BigInteger(hash2,16);
		
		
		
		int[] position= caculatehashposition(decicode1,decicode2, this.k); 
		
		for(int i=0;i<this.k;i++){
			if(!this.bloomfilter.get(position[i]))
				return false;
		}
		
		return result;
		
	}


	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		
		
		BloomFilter bf= new BloomFilter(100000, 0.01);
		
		System.out.println("n="+bf.n);
		System.out.println("p= "+bf.falseprobability);
		System.out.println(" m="+bf.m);
		System.out.println(" k="+ bf.k);
		
		
	
		
		for(int i=0;i<100000;i++)
			bf.add("element"+i);
		
		
		//checking the elements::
		
		for(int j=0;j<100000;j++)
			if(!bf.contains("element"+j))
				System.out.println("false");
		
		
		final long startTime = System.nanoTime();

		
		System.out.println("if the bloom filter contains the element 455;; ans is true="+bf.contains("element455"));
		final long duration = System.nanoTime() - startTime;
		//long totalTime = endTime - startTime;
		System.out.println("total time for get operation="+duration);
		
		
		
		
		
	
	}

}
