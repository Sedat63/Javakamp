package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.Hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculatorBase gameBase = new WomanGameCalculator();

	}

}
