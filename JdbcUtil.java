package designAndAnalyze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	// 定义4大常量
	// url
	private static String url = "jdbc:mysql://localhost:3306/gra";
	// 驱动名称
	private static String driverName = "com.mysql.jdbc.Driver";
	// 账号
	private static String userName = "root";
	// 密码
	private static String password = "123456";

	// 定义连接数据库需要的对象
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet rs = null;

	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 获取连接
	static {
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	// 查询数据
	public static ResultSet getRs(String sql) {
		try {
			System.out.println(33);
			statement =connection.createStatement();
	        rs=statement.executeQuery(sql);				        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	
}
