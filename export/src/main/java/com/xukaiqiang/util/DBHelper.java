package com.xukaiqiang.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xukaiqiang.bean.Column;
import com.xukaiqiang.bean.DataDTO;

/**
 * @ClassName: DBHelper
 * @Description: 操作数据库
 * @author xukaiqiang
 * @date 2016年12月10日 下午4:32:12
 * @modifier
 * @modify-date 2016年12月10日 下午4:32:12
 * @version 1.0
 */

public class DBHelper {

	public String queryNameByColumn(String column){
		String sql="select name from z_column_name where columns='"+column+"'";
		String  name = "";
		try {
			Connection conn = getConn();
			ResultSet rs = createQuery(conn, sql);
			if (rs.next()) {
				name=rs.getString(1);
			}
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}
	/**
	 * Class Name: DBHelper.java
	 * 
	 * @Description:获取数据库连接
	 * @author xukaiqiang
	 * @date 2016年12月10日 下午4:36:26
	 * @modifier
	 * @modify-date 2016年12月10日 下午4:36:26
	 * @version 1.0
	 * @return
	 */
	public Connection getConn() {
		String url = PropertyUtils.getValue("url", "db.properties");
		String userName = PropertyUtils.getValue("username", "db.properties");
		String passWord = PropertyUtils.getValue("password", "db.properties");
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	/**
	 * Class Name: DBHelper.java
	 * 
	 * @Description: 创建查询
	 * @author xukaiqiang
	 * @date 2016年12月10日 下午4:52:23
	 * @modifier
	 * @modify-date 2016年12月10日 下午4:52:23
	 * @version 1.0
	 * @param conn
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public ResultSet createQuery(Connection conn, String sql) throws SQLException {
		return conn.createStatement().executeQuery(sql);
	}
	public List<String> queryAllTables() {
		List<String> tableNames = new ArrayList<String>();
		String sql = "select tablename from (select tablename from pg_tables where schemaname='public') c where c.tablename like 'cb_%';";
		try {
			Connection conn = getConn();
			ResultSet rs = createQuery(conn, sql);
			while (rs.next()) {
				tableNames.add(rs.getString(1));
			}
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tableNames;
	}

	/**
	 * Class Name: DBHelper.java
	 * 
	 * @Description:关闭数据库连接
	 * @author xukaiqiang
	 * @date 2016年12月10日 下午4:38:32
	 * @modifier
	 * @modify-date 2016年12月10日 下午4:38:32
	 * @version 1.0
	 * @param connection
	 * @return
	 */

	public void closeConn(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String name = new DBHelper().queryNameByColumn("thisNodeCaption");
		System.out.println(name);
	}
}
