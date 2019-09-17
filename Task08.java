package by.jb29.mod1.les05;

import java.util.Random;
/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
число, которое меньше максимального элемента массива, но больше всех других элементов).
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
		
		System.out.println("Массив:");
		
		for(int i = 0; i < mas.length; i++) {
			
			System.out.println(mas[i]);
		}
		
		
		secondMax = secondMaxEl(mas);
		
		
		System.out.println("Второй максимальный элемент: " + secondMax);

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
