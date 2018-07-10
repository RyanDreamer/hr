package com.hr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
* 用来做数据的一个基础连接、关闭、增删改查
* @author zhouy
*
*/


public class BaseDao {
	//属性
	//getBundle读取配置文件，getString根据键取数据
	private String driver = ResourceBundle.getBundle("jdbc").getString("driver");
	private String username = ResourceBundle.getBundle("jdbc").getString("username");
	private String url = ResourceBundle.getBundle("jdbc").getString("url");
	private String password = ResourceBundle.getBundle("jdbc").getString("password");
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	
	
	/**
	 * 数据库连接
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName(driver);
			if (conn == null || conn.isClosed()) {//数据库为空或关闭则连接
				conn = DriverManager.getConnection(url, username, password);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
	
	/**
	 * 通用查询方法
	 * @param sql
	 * @param params
	 * @return rs查询结果集
	 */
	public ResultSet executeQuery(String sql, List<Object> params) {
		//获取连接
		if (getConnection() == null) {
			return null;
		}
		
		try {
			//创建prepareStatement对象
			ps = conn.prepareStatement(sql);
			//如果条件查询，需要给SQL语句进行参数绑定
			//如果没有条件查询，则直接运行rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//循环查询参数集合，因为不确定集合对象中每个字段的类型，因此采用ps.setObject进行查询参数绑定
				for (int i=0; i<params.size(); i++) {
					
					ps.setObject(i+1, params.get(i));//ps的参数是从开始的
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	/**
	 * 通用增删改
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeUpdate(String sql, List<Object> params) {
		int result = 0;
		//获取连接
		if (getConnection() == null) {
			return -1;
		}
		try {
			//创建prepareStatement对象
			ps = conn.prepareStatement(sql);
			//如果条件查询，需要给SQL语句进行参数绑定
			//如果没有条件查询，则直接运行rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//循环查询参数集合，因为不确定集合对象中每个字段的类型，因此采用ps.setObject进行查询参数绑定
				for (int i=0; i<params.size(); i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//关闭数据库连接
			this.closeConnection();
		}
		return result;
	}
	
	
	/**
	 * 数据库关闭连接
	 */
	public void closeConnection(){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(ps!=null){
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


	
