
public class Demo1 {

	public static void main(String[] args) {
		int sayi1=260;
		int sayi2=25;
		int sayi3=2;
		
		int enBuyuk=sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		} else if(enBuyuk<sayi3){
			enBuyuk=sayi3;
		}
		
		System.out.println("En b�y�k = " +enBuyuk);

	}

}
