package edu.tfzr.cryptostat;


public class CryptoStat {
	String binary="";
	
	
	
	public CryptoStat(String binary) {
		super();
		this.binary = binary;
	}

	
	public CryptoStat() {
		super();
	}


	public boolean stat1() {
		System.out.println("STAT1");
		int nof0=0;
		int nof1=0;
		for (int i=0;i<binary.length();i++){
			if (binary.charAt(i)=='0') nof0++; else nof1++;
		}
		System.out.println("Broj nula: "+nof0);
		System.out.println("Broj jedinica: "+nof1);
		System.out.println(10*Math.sqrt(binary.length()));
		if (Math.abs(nof0-nof1)<=10*Math.sqrt(binary.length())) return true; else return false;
	}

	public boolean stat2() {
		System.out.println("STAT2");
		int nof00=0;
		for (int i=0;i<binary.length()-1;i++){
			if (binary.charAt(i)=='0' && binary.charAt(i+1)=='0'){
				nof00++;
			}
		}
		System.out.println("Broj dvostrukih nula je "+nof00);
		if (Math.abs(nof00-binary.length()/4)<=10*binary.length()/4) return true;else return false;
	}

	public boolean stat3() {
		System.out.println("STAT3");
		
		int nof11=0;
		for (int i=0;i<binary.length()-1;i++){
			if (binary.charAt(i)=='1' && binary.charAt(i+1)=='1'){
				nof11++;
			}
		}
		System.out.println("Broj dvostrukih jedinica je "+nof11);
		if (Math.abs(nof11-binary.length()/4)<=10*binary.length()/4) return true;else return false;
	}

	public boolean stat4() {
		System.out.println("STAT4");
		
		int count=0;
		int maxCount=0;
		boolean counting=false;
		for (int i=0;i<binary.length();i++){
			if (binary.charAt(i)=='0'){
				counting=true;
				count++;
			}
			if (binary.charAt(i)=='1'){
				counting=false;
				if (count>maxCount)maxCount=count;
				count=0;
			}
		}
		
		System.out.println("Najduži niz nula je "+maxCount);
		if (maxCount<=10*CryptoOperations.log2(binary.length()))
			return true; else return false;
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

}
