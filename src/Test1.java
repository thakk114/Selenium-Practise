
public class Test1 {

	public static void main(String[] args) {

		System.out.println("I am in main method");
		printme();
		System.out.println("after printme");
		ScanMe();
		Test1 t1 = new Test1();
		t1.TestMe();
		Test2.red();
		Test2.blue();
	}
	
	public static void printme() {
		System.out.println("Printme");
	}

	public static void ScanMe() {
		System.out.println("Scanme");
	}

	public void TestMe() {
		System.out.println("TestMe");
	}

}
