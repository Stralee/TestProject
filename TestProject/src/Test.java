
public class Test {
	public static void main(String[] args) {

		int[] ip = new int[]{7,2,1,5,4,3,6,0};//8 to 8
		int[] pc = new int[]{4,2,7,3,5,1};//8 to 6
		int[] pe = new int[]{2,1,0,1,3,2,0,3};//4 to 8
		int[] e6 = new int[]{2,3,2,1,0,3};//4 to 6
		int[] fp = new int[]{4,2,7,5,1,3,0,6};//8 to 8
		int[] pr = new int[]{3,2,1,0};//8 to 4
		int[] pl = new int[]{5,4,6,7};//8 to 4
		
		CryptoStat test = new CryptoStat();
		
        System.out.println("-----------");
		System.out.println("Zadatak 7");
		
		String plaintext="10111000";
		String key="00101011";
		//zadatak6
		
		/*int tempt = Crypto.StringToInt(plaintext);
		int tempk = Crypto.StringToInt(key);
		
		tempt = Crypto.permute(tempt, ip);
		tempk = Crypto.permute(tempk, ip);
		
		tempt = Crypto.xor(tempt, tempk, 8);
		tempt = Crypto.permute(tempt, pc);
		tempt = Crypto.sBox(5, tempt);
		tempt = Crypto.permute(tempt, pe);
		tempt = Crypto.permute(tempt, fp);
		*/
		//zadatak7
		/*int leftt = Crypto.StringToInt(plaintext);
		int rightt = Crypto.StringToInt(plaintext);
		int leftk = Crypto.StringToInt(key);
		int rightk = Crypto.StringToInt(key);
		
		leftt = Crypto.permute(leftt,pl);
		rightt = Crypto.permute(rightt,pr);
		leftk = Crypto.permute(leftk,pl);
		rightk = Crypto.permute(rightk,pr);

		

		leftt = Crypto.permute(leftt,e6);
		leftt = Crypto.sBox(6,leftt);
		leftt = Crypto.permute(leftt,pe);

	 System.out.println(Crypto.intToString(leftt,8));

	 rightt = Crypto.xor(rightt,leftk,4);
	 rightt = Crypto.permute(rightt,pe);

	System.out.println(Crypto.intToString(rightt,8));

	 String result = Crypto.intToString(rightt,8);
	 
	 if(test.stat4()) {
		 System.out.println("Prosao je statisticki test 4");
		  }
	 else {
			 System.out.println("Prosao je statisticki test 4");
	 } 

	 rightk = Crypto.permute(rightk,pe);
	 System.out.println(Crypto.intToString(rightk,8));
	 }*/
		
		// zadatak8
		/*int leftt = Crypto.StringToInt(plaintext);
		int rightt = Crypto.StringToInt(plaintext);
		int leftk = Crypto.StringToInt(key);
		int rightk = Crypto.StringToInt(key);
		
		leftt = Crypto.permute(leftt, pe);
		
		System.out.println(Crypto.intToString(leftt,8));
		
		rightt = Crypto.xor(rightt,rightk,4);
		rightt = Crypto.permute(rightt, pe);
		
		System.out.println(Crypto.intToString(rightt,8));
		test.setBinary(Crypto.intToString(rightt,8));
		*/
	
		
	
		/*leftk = Crypto.permute(leftk,e6);
		leftk = Crypto.sBox(2, leftk);
		leftk = Crypto.permute(leftk, pe);
		*/
		//zadatak9
		int leftt = Crypto.StringToInt(plaintext);
		int rightt = Crypto.StringToInt(plaintext);
		int leftk = Crypto.StringToInt(key);
		int rightk = Crypto.StringToInt(key);
		
		leftt = Crypto.permute(leftt,pl);
		rightt = Crypto.permute(rightt,pr);
		leftk = Crypto.permute(leftk,pl);
		rightk = Crypto.permute(rightk,pr);
		
		leftt = Crypto.permute(leftt, e6);
		
		rightk = Crypto.permute(rightk, e6);
		leftt = Crypto.xor(leftt, rightk, 4);
		leftt = Crypto.sBox(6, leftt);
		leftt = Crypto.permute(leftt, pe);
		//desni ispis
		System.out.println(Crypto.intToString(leftt,8));
		
		rightt = Crypto.xor(rightt, leftk, 4);
		rightt = Crypto.permute(rightt, pe);
		rightt = Crypto.permute(rightt, pc);
		rightt = Crypto.sBox(2, rightt);
		rightt = Crypto.permute(rightt, pe);
		//levi ispis
		System.out.println(Crypto.intToString(rightt,8));
		// sredina dole
		leftt = Crypto.xor(leftt, rightt, 4);
		 String result = Crypto.intToString(leftt,8);

		
		if(test.stat2()) {
			 System.out.println("Prosao je statisticki test 2");
			  }
		 else {
				 System.out.println("Prosao je statisticki test 2");
		 } 
		rightt = Crypto.permute(rightt, fp);
		System.out.println(Crypto.intToString(rightt,8));
		
		leftt = Crypto.permute(leftt, fp);
		System.out.println(Crypto.intToString(leftt,8));

			

	
	}
		

}
