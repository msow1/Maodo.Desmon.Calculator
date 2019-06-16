import java.util.Scanner;

	public class MainAppCalc1 extends OppDemo {
		
		public static int choice;
	
		public static void main(String[] args) {
			
			OppDemo R = new OppDemo();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please choose the operation type");
			
			System.out.print(" \n1: Addition. \n2: Substraction. \n3: Division. \n4: Multiplication. \n5: Exit. ");
			
			choice = sc.nextInt();
				
				switch (choice) {

				case 1 :
					
					R.getX();
					R.getY();
					R.add(x, y);
					System.out.println("The result is " + result);
					break;

				case 2:
					R.getX();
					R.getY();
					R.subs(x, y);
					System.out.println("The result is " + result);
					break;

				case 3:
					R.getX();
		
					R.getY(); 
					 if (R.y== 0) {
						 
					throw new ArithmeticException("Divisor cannot be equal to 0 ");
			
					}
					R.div(x, y);
					System.out.println("The result is " + result);
					break;

				case 4:
					
					R.getX();
					R.getY();
					R.multi(x, y);
					System.out.println("The result is " + result);
					break;
					
				case 5:
					
					System.out.println("Bye Bye");
					break;
					
				default:
					System.out.println("Unvalid entry");
					break;
				}
				
				sc.close();
		}

}

