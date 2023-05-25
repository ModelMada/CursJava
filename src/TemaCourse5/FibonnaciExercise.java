package TemaCourse5;

public class FibonnaciExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=9;i++) {
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		System.out.println("------------------------");
		
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
		System.out.println(y);
		int j =1;
		while (j<=9) {
			z = x+y;
			x=y;
			y=z;
			System.out.println(z);
			j++;
		}

	}

}
