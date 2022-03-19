
public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();
		sum(2,3);
		sum(5,7,8);
		
		
	}

	
	public static void sum() {
		int a =4+5;
		System.out.println(a);
	}
	
	
	public static void sum(int x, int y) {
		int b =x+y;
		System.out.println(b);
	}
	
	
	public static void sum(int p, int q, int r) {
		int b =p+q+r;
		System.out.println(b);
	}
	
}
