package com.hr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
* ���������ݵ�һ���������ӡ��رա���ɾ�Ĳ�
* @author zhouy
*
*/


public class BaseDao {
	//����
	//getBundle��ȡ�����ļ���getString���ݼ�ȡ����
	private String driver = ResourceBundle.getBundle("jdbc").getString("driver");
	private String username = ResourceBundle.getBundle("jdbc").getString("username");
	private String url = ResourceBundle.getBundle("jdbc").getString("url");
	private String password = ResourceBundle.getBundle("jdbc").getString("password");
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	
	
	/**
	 * ���ݿ�����
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName(driver);
			if (conn == null || conn.isClosed()) {//���ݿ�Ϊ�ջ�ر�������
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
	 * ͨ�ò�ѯ����
	 * @param sql
	 * @param params
	 * @return rs��ѯ�����
	 */
	public ResultSet executeQuery(String sql, List<Object> params) {
		//��ȡ����
		if (getConnection() == null) {
			return null;
		}
		
		try {
			//����prepareStatement����
			ps = conn.prepareStatement(sql);
			//���������ѯ����Ҫ��SQL�����в�����
			//���û��������ѯ����ֱ������rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶε����ͣ���˲���ps.setObject���в�ѯ������
				for (int i=0; i<params.size(); i++) {
					
					ps.setObject(i+1, params.get(i));//ps�Ĳ����Ǵӿ�ʼ��
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
	 * ͨ����ɾ��
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeUpdate(String sql, List<Object> params) {
		int result = 0;
		//��ȡ����
		if (getConnection() == null) {
			return -1;
		}
		try {
			//����prepareStatement����
			ps = conn.prepareStatement(sql);
			//���������ѯ����Ҫ��SQL�����в�����
			//���û��������ѯ����ֱ������rs = ps.executeQuery();
			if (params != null && params.size()>0) {
				//ѭ����ѯ�������ϣ���Ϊ��ȷ�����϶�����ÿ���ֶε����ͣ���˲���ps.setObject���в�ѯ������
				for (int i=0; i<params.size(); i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//�ر����ݿ�����
			this.closeConnection();
		}
		return result;
	}
	
	
	/**
	 * ���ݿ�ر�����
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


	
