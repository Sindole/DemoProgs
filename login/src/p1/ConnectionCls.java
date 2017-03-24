package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionCls {
	private String user,pass;
	private String dbuser,dbpass;
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	int x;
	public ConnectionCls(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	private Connection createConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/s19", "sa", null);
		return con;
	}
	
	public int checkData() throws ClassNotFoundException, SQLException
	{
		createConnection();
		ps=con.prepareStatement("select userid,password from user where userid=? and password=?");
		ps.setString(1, user);
		ps.setString(2, pass);
		rs=ps.executeQuery();
		while(rs.next())
		{
			dbuser=rs.getString(1);
			dbpass=rs.getString(2);
		}
		if(user.equals(dbuser)&&pass.equals(dbpass))
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	public int storeData(String id,String pass,String name,String add) throws ClassNotFoundException, SQLException
	{
		createConnection();
		ps=con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1, id);
		ps.setString(2, pass);
		ps.setString(3, name);
		ps.setString(4, add);
		int x=ps.executeUpdate();
		return x;
			
		
	}
	public ConnectionCls() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}








