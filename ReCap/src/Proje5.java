
public class Proje5 {

	public static void main(String[] args) {
		// say� bulma
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Say� mevcuttur");
		}else {
			System.out.println("Say� mevcut de�ildir.");
		}
	}

}
