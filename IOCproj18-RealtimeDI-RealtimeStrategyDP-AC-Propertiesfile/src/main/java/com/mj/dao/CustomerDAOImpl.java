package com.mj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mj.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	private String osname;
	private String osversion;
	private String username;
	private String pathdata;
	
	//setter methods for setter injection
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPathdata(String pathdata) {
		this.pathdata = pathdata;
	}
	//alt+shift+s,o
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl 1-param constructor");
		this.ds = ds;
	}
	@Override
	public int insert(CustomerBO bo) throws Exception {
		System.out.println("===============================");
		System.out.println(osname+" "+osversion+" "+username+" "+pathdata);
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try
		{
			//get pooled jdbc connection obj
			con=ds.getConnection();
			//create PreparedStatement object with pre-compiled sql query
			ps=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			//set query param values
			ps.setString(1, bo.getCustName());
			ps.setString(2, bo.getCustAddrs());
			ps.setFloat(3, bo.getPamt());
			ps.setFloat(4, bo.getRate());
			ps.setFloat(5, bo.getTime());
			ps.setFloat(6, bo.getIntrestAmount());
			count=ps.executeUpdate();

		}
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc objects
			try {
				if(ps!=null)
				{
					ps.close();
				}
			} catch (SQLException se) {
				throw se;//Exception rethrowing
			}
			try {
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException se) {
				throw se;//Exception rethrowing
			}
		}
		return count;
	}

}
