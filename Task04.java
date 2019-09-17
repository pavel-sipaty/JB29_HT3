package by.jb29.mod1.les05;

/*
 * Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */


public class Task04 {

	public static void main(String[] args) {
	
		int a;
		int b;
		int c;
		
		a = 2;
		b = 4;
		c = 8;
		
		int nokAB = findNok(a, b);
		
		int nokABC = findNok(nokAB, c);
		
		System.out.println("НОК трех чисел: " + nokABC);
			
		
	}	
///////////////////////////////////////////////////////
	
	
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
	

///////////////////////////////////////////////////////
	
	public static int findNok(int a, int b) {
		
		int nok;
		
		int nod = findNod(a, b);
		
		nok = a * b / nod;
		
		return nok;	
		
	}
		
		
		
		
	
	
	
	

}
