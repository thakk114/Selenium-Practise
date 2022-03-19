
public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("pass");
		}
		
		else {
			
			System.out.println("fail");
			
		}
	
	String expacted = "Selenium";
	String actual = "selenium";
	
	if(expacted.equalsIgnoreCase(actual)) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
	
	}

}
