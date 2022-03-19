import selenium.Test4;

public class Test3 {
static Test3 t3 = new Test3();
static Test1 t1 = new Test1();
static Test4 t4 = new Test4();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW();
		t3.Audi();
		Test1.ScanMe();
		t1.TestMe();
		t4.square();
		Test4.ciccle();

	}
	
	public static void BMW() {
		System.out.println("BMW");
	}

	public void Audi() {
		System.out.println("Audi");
	}
}
