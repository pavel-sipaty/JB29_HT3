package by.jb29.mod1.les05;

import java.util.Random;
/*
 * ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� (������� �� ������
�����, ������� ������ ������������� �������� �������, �� ������ ���� ������ ���������).
 */

public class Task08 {

	public static void main(String[] args) {
		
		int secondMax;
		
		int n = 10;
		
		int[] mas = new int[n];
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			mas[i] = rand.nextInt(1000);
		}
		
		System.out.println("������:");
		
		for(int i = 0; i < mas.length; i++) {
			
			System.out.println(mas[i]);
		}
		
		
		secondMax = secondMaxEl(mas);
		
		
		System.out.println("������ ������������ �������: " + secondMax);

	}
	
////////////////////////////////
	
public static int secondMaxEl(int[] mas) {
	
	int max = 0;
	int secondMax = 0;
	
	for(int i = 0; i < mas.length-1; i++) {
		
		if(mas[i] > max) {
			
			max = mas[i];
			secondMax = max;
			
		}else if(mas[i] > secondMax && mas[i] != max) {
			
			secondMax = mas[i];
			
		}
		
	}
	
	return secondMax;
	
}
	
}
