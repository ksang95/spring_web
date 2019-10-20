package test;

public class AnnotationTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyContextContainer container=new MyContextContainer();
		MyObject obj=container.invokeAnnotation(new MyObject());
		obj.print();
	}

}
