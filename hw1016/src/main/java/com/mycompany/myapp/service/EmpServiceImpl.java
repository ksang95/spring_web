package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

/**
 * 
 * @author user
 *	emp table에서 emp 자료를 처리할 클래스
 */
public class EmpServiceImpl implements EmpService{	
	private static final Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	private PreparedStatement pStmt;
	private String sql;
	@Override
	public List<Emp> getEmpList() {
		// TODO Auto-generated method stub
		sql="select empno,ename,job,mgr from emp";
		ResultSet rs=null;
		try {
			pStmt=DBConnection.dbCon.getPreparedStatement(sql);
			rs=pStmt.executeQuery();
			List<Emp> list=new ArrayList<Emp>();
			while(rs.next()) {
				Emp tempEmp=new Emp();
				tempEmp.setEmpno(rs.getInt(1));
				tempEmp.setEname(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
				list.add(tempEmp);
			}
			return list;
		} catch (SQLException e) {
			logger.error("getEmpList() "+e.getSQLState());
		} catch(Exception e) {
			logger.error("getEmpList() "+e.getMessage());
		}
		
		
		return null;
	}
	@Override
	public Emp getEmp(int empno) {
		sql="select empno,ename,job,mgr from emp where empno=?";
		ResultSet rs=null;
		try {
			pStmt=DBConnection.dbCon.getPreparedStatement(sql);
			pStmt.setInt(1, empno);
			rs=pStmt.executeQuery();	
			Emp tempEmp=null;
			if(rs.next()) {
				tempEmp=new Emp();
				tempEmp.setEmpno(rs.getInt(1));
				tempEmp.setEname(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
			}
			return tempEmp;
		} catch (SQLException e) {
			logger.error("getEmpList() "+e.getSQLState());
		} catch(Exception e) {
			logger.error("getEmpList() "+e.getMessage());
		}
		
		return null;
	}

}
