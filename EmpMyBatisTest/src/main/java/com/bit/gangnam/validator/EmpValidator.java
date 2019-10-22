package com.bit.gangnam.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bit.gangnam.beans.Emp;


public class EmpValidator implements Validator{

	private Emp emp;
	@Override
	public boolean supports(Class<?> clazz) { //객체의 클래스가 이 Validator가 검증할 수 있는 클래스인지를 판단
		// TODO Auto-generated method stub
		return Emp.class.isAssignableFrom(clazz); //Emp와 인자로 넘어온 객체 클래스 비교
	}

	@Override
	public void validate(Object target, Errors errors) {  //실제 검증 로직이 이루어지는 메소드
		// TODO Auto-generated method stub
		emp=(Emp) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"empno","required","Field is required."); 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"ename","required","Field is required."); 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"job","required","Field is required."); 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"mgr","required","Field is required.");
		//필드가 비어있거나 공백일 경우에는 errors에 에러 정보 담는다
		if(!isValidEname(emp.getEname())) { //추가적으로 유효성 검사
			errors.rejectValue("ename", "required","이름이 너무 깁니다."); //필드에 대한 에러코드 추가
		}
	}
	
	private boolean isValidEname(String ename) {
		if(ename.length()<=10)
			return true;
		else
			return false;
	}

	

}
