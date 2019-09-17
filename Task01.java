package by.jb29.mod1.les05;

//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.


public class Task01 {

	public static void main(String[] args) {
		
		int a1, b1;
		int a2, b2;
		int a3, b3;
		
		a1 = 2;
		b1 = -8;
		
		a2 = 4;
		b2 = 7;
		
		a3 = 0;
		b3 = 3;
		
		double ploscha;
		
		ploscha = square(a1, b1, a2, b2, a3, b3);
		
		System.out.println("Площадь треугльника равна: " + ploscha);
			

	}
	
	public static double square(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		double square;
		
				
		square = (1.0 / 2) * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
		
		return square;
				
		
	}

}
