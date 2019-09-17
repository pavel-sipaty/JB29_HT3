package by.jb29.mod1.les05;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.


public class Task03 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {35, 70, 1, 2};
		
		int grandNod = mas[0];
		
		for(int i = 0; i < mas.length; i++) {
			
			
			grandNod = findNod(grandNod, mas[i]);
			System.out.println(grandNod);
		}
		
		System.out.println("НОД четырех чисел = " + grandNod);
		

	}
	
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

}
