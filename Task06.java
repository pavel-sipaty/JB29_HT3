package by.jb29.mod1.les05;


/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */


public class Task06 {

	public static void main(String[] args) {
		
		int a;
		int kolTreug;
		double squareMnogoug;
				
		a = 4;
		kolTreug = 6;
		
		
		squareMnogoug = squareTreug(a) * kolTreug;
		
		System.out.printf("Площадь правильного шестиугольника: %.2f", squareMnogoug);
		
		
		

	}
	
////////////////////////////////////////////////////
	
	public static double squareTreug(int a) {
		
		double s;
		
		s = (Math.sqrt(3) / 4) * Math.pow(a, 2);
		
		return s;
		
	}

}
