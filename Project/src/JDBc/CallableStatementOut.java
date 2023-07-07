package JDBc;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.SQLException;

import java.sql.Types;




public class CallableStatementOut {
	Connection con=null;

	
	CallableStatementOut() throws ClassNotFoundException, SQLException
	{
		 con=	Connection1.getConnection();
	}
	void show_data(String gender) throws ClassNotFoundException, SQLException
	{
	
	String sql="{call pro5(?,?)}";
	CallableStatement cs=con.prepareCall(sql);
	cs.setString(1,gender);
	cs.registerOutParameter(2,Types.INTEGER);
	
	boolean b=cs.execute();
	if(b==false)
	System.out.println(cs.getInt(2));
	}
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatementOut  cs=new CallableStatementOut ();
		cs.show_data("male");

	}

}
