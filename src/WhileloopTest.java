
public class WhileloopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while(i<=100) {
			
			System.out.println(i);
			
			if(i==15) {
				break;
			}
			i++;
		}
		
		System.out.println("After loop");
	}

}
