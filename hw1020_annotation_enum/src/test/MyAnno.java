package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //annotation 붙일 대상. METHOD -> 메소드 선언시
@Retention(RetentionPolicy.RUNTIME) //annotation 지속기간. RUNTIME -> 런타임에도 참조가능
public @interface MyAnno {
	//기본형+String, enum 사용가능
	String value() default "MyAnno : Default String Value";
}
