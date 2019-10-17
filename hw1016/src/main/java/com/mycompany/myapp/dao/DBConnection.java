package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycompany.myapp.contr.HomeController;

/**
 * 
 * @author user jdbc connection
 * 
 */
public class DBConnection {
	private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);
	public final static DBConnection dbCon;
	private static Connection conn;
	private PreparedStatement pStmt;

	private DBConnection() { // singleton->DB 연결 한번만 하고 공유해서 사용
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521", "SCOTT", "TIGER");
			logger.info("DB Connection success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Connection Fail ==> " + e.getMessage());
		}
	}

	static { // dbCon이 위에서 선언할때 초기화안됐지만 이 static 메소드 통해 final 값 정해짐. singleton
		dbCon = new DBConnection();
	}

	public static DBConnection getDbConnection() {
		// dbCon이 final이라 변경못하고 public해서 외부에서 사용가능하므로 굳이 이 메소드를 통해 얻을 필요없음
		return dbCon;
	}

	public static Connection getConnection() {
		// conn이 final이 아니므로 변경 못하게 private 처리했고 이 메소드를 통해 얻어야함
		return conn;
	}

	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		pStmt = conn.prepareStatement(sql);
		return pStmt;
	}

	@Override
	protected void finalize() throws Throwable {
		if (conn != null) {
			if (!conn.isClosed())
				conn.close();
			conn = null;
		}
		super.finalize();
	}
}
