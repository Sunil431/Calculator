
public class Calculation {
	
	//Method
	
	public static int Addition(int a , int b ) {
		int c = a+b;
		return c;
	}	
	
	public static int Addition(int a, int b, int c ) {
		return a+b+c;
		
	}
		public static void wish() {
			System.out.println("My method says Hello GoodMorning");
		}
		public static float perc(float x, float y) {
		return x+y;
		
		
	}
	public static void main(String[] args) {
      System.out.println(Addition(1,2));
      System.out.println(Addition(2,3,4));

		wish();
		
	}

}
