package by.jb29.mod1.les05;

import java.util.Scanner;

//import java.util.Scanner;

/*
 * �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ ��������
���� ����������� �����:
 */

public class Task02 {

	public static void main(String[] args) {
		
		int nok;
		
	    Scanner vvod = new Scanner(System.in);
	    
	    System.out.print("������� ������ ����� >>> ");
	    int a = vvod.nextInt();
	    
	    
	    System.out.println();
	    
	    System.out.print("������� ������ ����� >>> ");
	    int b = vvod.nextInt();
	        
		
	    int nod = findNod(a,b);
		
		nok = (a * b) / nod;
		
		System.out.println("----------------------");
		
		System.out.println("������ �����: " + a);
		System.out.println("������ �����: " + b);
	    System.out.println("��� = " + nod);
	    System.out.println("��� = " + nok);
		
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