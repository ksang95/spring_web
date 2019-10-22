package com.bit.gangnam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.dao.EmpMapper;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpMapper empMapper;
	@Override
	public List<Emp> getEmpList() {
		return empMapper.getEmpList();
	}
	@Override
	public int updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.updateEmp(emp);
	}
	@Override
	public Emp getEmp(int empno) {
		// TODO Auto-generated method stub
		return empMapper.getEmp(empno);
	}
	@Override
	public int insertEmp(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.insertEmp(emp);
	}

}
