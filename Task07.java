package by.jb29.mod1.les05;

import java.util.Random;

/*
 *  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */



public class Task07 {

	public static void main(String[] args) {
		
	int n = 10;	
	int[] coord = new int[n];
	
	Random rand = new Random();
	
	for(int i = 0; i < coord.length; i++) {
		coord[i] = rand.nextInt(50);
	}
	
	System.out.println("Массив:");
	for(int i = 0; i < coord.length; i++) {
		System.out.println(coord[i]);
	}
	
		
	double maxDis = dis(coord[0], coord[1], coord[2], coord[3]);
	int xP1 = 0;
	int xP2 = 0;
	int yP1 = 0;
	int yP2 = 0;
	
	/*int x1;
	int y1;
	int x2;
	int y2;*/
	
	System.out.println("---------------------------");
	System.out.println("Расстояния между точками:");
	
	for(int i = 0; i < coord.length - 1; i = i + 2) {
		
		for(int j = i + 2; j < coord.length - 1; j = j + 2) {
			
			double currentDis = dis(coord[i], coord[i+1], coord[j], coord[j+1]);
			
			System.out.printf("%.2f", currentDis);
			System.out.println();
			
			if(maxDis < currentDis) {
				maxDis = currentDis;
				xP1 = coord[i];
				xP2 = coord[j];
				yP1 = coord[i+1];
				yP2 = coord[j+1];
			}
		}
		
				
	}
	
	System.out.printf("Максимальное расстояние между точками: %.2f ", maxDis);
	System.out.println();
	System.out.println("Точки с координатами: x1 = " + xP1 + " , y1 = " + yP1 + " и x2 = " + xP2 + ", y2 = " + yP2);
	
	
	
	
	}
	
///////////////////////////////////////////////////////////////
	
	public static double dis(int x1, int y1, int x2, int y2) {
		
		double dis;
		
		dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
		
		return dis; 
		
	}

}
