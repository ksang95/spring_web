package test;

import java.lang.reflect.Method;

public class MyContextContainer {
	//타켓에 붙은 MyAnno annotation 읽는 클래스
	
	public <T> T invokeAnnotation(T instance) {
		Method[] methods = instance.getClass().getDeclaredMethods(); //instance의 모든 메소드들
		
		for (Method method : methods) {
			MyAnno anno = method.getAnnotation(MyAnno.class); //메소드에 MyAnno Annotation 있으면 value 출력
			if (anno != null)
				System.out.println("annotation invoked == "+anno.value());
		}
		return instance;
	}
	
}
