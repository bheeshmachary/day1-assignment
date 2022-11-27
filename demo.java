
public class demo {

	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo d = new demo();
int a=10;
System.out.println(a);
System.out.println(d.b);
System.out.println("demo\tprogram");
d.show();
	}
public static void demo() {
	demo d = new demo();
	System.out.println(d.b);
}
public void show() {
	System.out.println(b);
}
}
