package by.jb29.mod1.les05;

import java.util.Scanner;

//import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
двух натуральных чисел:
 */

public class Task02 {

	public static void main(String[] args) {
		
		int nok;
		
	    Scanner vvod = new Scanner(System.in);
	    
	    System.out.print("Введите первое число >>> ");
	    int a = vvod.nextInt();
	    
	    
	    System.out.println();
	    
	    System.out.print("Введите второе число >>> ");
	    int b = vvod.nextInt();
	        
		
	    int nod = findNod(a,b);
		
		nok = (a * b) / nod;
		
		System.out.println("----------------------");
		
		System.out.println("Первое число: " + a);
		System.out.println("Второе число: " + b);
	    System.out.println("НОД = " + nod);
	    System.out.println("НОК = " + nok);
		
	    }
	
/////////////////////////////////////////////////////////////
	
	
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