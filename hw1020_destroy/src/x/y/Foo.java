package x.y;

public class Foo {
	private Bar bar;
	private Baz baz;
	public Foo(Bar bar, Baz baz) {
		this.bar=bar;
		this.baz=baz;
	}
	
	public void start() {
		System.out.println("start");
	}
	
	public void stop() {
		System.out.println("stop");
	}
	public String getBarAndBazStr() {
		return bar.getStr()+"/"+baz.getStr();
	}
}
