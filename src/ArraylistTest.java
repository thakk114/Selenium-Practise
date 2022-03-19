import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tools = new ArrayList<String>();
		tools.add("Selenium");
		tools.add("QTP");
		tools.add("JUnit");
		tools.add("TestNG");
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		System.out.println(tools);
		tools.remove(2);
		System.out.println("two: .."+tools.get(2));
		
		for(int i=0;i<tools.size();i++) {
			System.out.println(tools.get(i));
		}
		
		
	}

}
