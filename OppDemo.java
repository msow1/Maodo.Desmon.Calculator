import java.util.Scanner;

 public class OppDemo {
		
		static double result;
	    static double x;
		static double y;
		static Scanner sc = new Scanner(System.in);
		
		public double getX() {
		System.out.println("Please enter the first number ");
		x = sc.nextDouble(); 
			return x;
		}
		public static void setX(double x) {
			OppDemo.x = x;
		}


		public double getY() {
			System.out.println("Please enter the second number ");
			y = sc.nextDouble();
			
			return y;
		}
		public static void setY(double y) {
			OppDemo.y = y;
		}


		
		public double add(double x, double y) {
			return result = x+y;
		}
		
		public double subs(double x, double y) {
			return result = x-y;
		}
		
		public double div(double x, double y) {
			
			return result = x/y;
		}
		
		public double multi(double x, double y) {
			return result = x*y;
		}
		
		
}

