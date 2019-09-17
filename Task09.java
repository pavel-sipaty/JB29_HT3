package by.jb29.mod1.les05;

/*
 *  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */


public class Task09 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {3, 6, 9};
		
		prost(mas);
		
			

	}
	
////////////////////////////////////////////////////
	
	public static int findNod(int a, int b) {
		
		int nod;
		
		if(a < b) {
			nod = a ;
		} else {
			nod = b;
		}
		
		while(a % nod != 0 || b % nod != 0) {
			nod--;
		}
		return nod;
		
	}
	
	
///////////////////////////////////////////////////
	
	public static void prost(int[] mas) {
		
		int nod = mas[0];
		
		for(int i = 0; i < mas.length; i++) {
			
			nod = findNod(nod, mas[i]);
					
		}
		
		
		if(nod == 1) {
			System.out.println("Числа взаимнопростые");
		}else {
			System.out.println("Числа не взаимнопростые");
		}
		System.out.println("НОД равен " + nod);
		
		
		
	}
	
	
}
