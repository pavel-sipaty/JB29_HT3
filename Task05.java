package by.jb29.mod1.les05;

// Ќаписать метод(методы) дл€ нахождени€ суммы большего и меньшего из трех чисел


public class Task05 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a = 5;
		b = 4;
		c = 7;
		
		int sum;
		
		sum = sravniSum(a, b, c);
		
		System.out.println(sum);
		

	}
	
	
	public static int sravniSum(int a, int b, int c) {
		
		int sum = 0;
		
		if(a > b & a > c & b < c) {
			sum = a + b;
			
			
		}else if(a > b & a > c & c < b) {
			sum = a + c;
			

		}else if(b > a & b > c & a < c) {
			sum = b + a;
			
			
		}else if(b > a & b > c & c < a) {
			sum = b + c;
			
			
		}else if(c > a & c > b & a < b) {
			sum = c + a;
			
			
		}else if(c > a & c > b & b < a) {
			sum = c + b;
			
			
		}else {
			System.out.println("—реди трех чисел нет одного наименьшего и одного наибольшего.");
		}
		
		return sum;
		
	}

}
