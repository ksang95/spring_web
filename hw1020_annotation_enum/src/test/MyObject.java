package test;

public class MyObject {

	@MyAnno
	public void print() {
		System.out.println("Hello");
	}
	@MyAnno(value="updated anno")
	public void print2() {
		System.out.println("Hello");
	}
}
