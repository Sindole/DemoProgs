package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServelet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("check");
		PrintWriter out= response.getWriter();
		String str1=request.getParameter("txtuser");
		String str2=request.getParameter("txtpass");
		ConnectionCls c1= new ConnectionCls(str1,str2);
		try {
			int i=c1.checkData();
			if(i>0)
			{
				out.println("Login Succesful");
			}
			else
			{
				out.print("Re-enter proper data");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
