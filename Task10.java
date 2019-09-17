package by.jb29.mod1.les05;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9


public class Task10 {

	public static void main(String[] args) {

	
	int [] mas = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	int factorial = factorNechetSum(mas);
		
	System.out.println("Сумма факториалов нечетных чисел от 1 до 9: " + factorial);
		
	}
		
		

	
///////////////////////////////////////////////////////////
	
	public static int factorNechetSum(int[] mas) {
		
		int proizved = 1;
		int sum = 0;
		
		for(int i = 0; i < mas.length; i++) {
			
			proizved = proizved * mas[i];
			System.out.println("Факториал " + mas[i] + " = " + proizved);
			
			if(mas[i] % 2 != 0) {
				sum = sum + proizved;
				
			}
			
			
			
		}
		
	return sum;		
		
	}

	
}