package JDBc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {
	
	Connection con=null;
	AddBatch() throws ClassNotFoundException, SQLException
	{
		con=Connection1.getConnection();
	}
	
	void add() throws SQLException
	{
		Statement st=con.createStatement();
		st.addBatch("insert into model values(1006,'RoyalEnfield',3600000)");
		st.addBatch("insert into model values(1007,'Unicorn',4000000)");
		//st.addBatch("update model set cost=35000 where model_no=1003");
		//st.addBatch("delete from model where model_id=1007");
		
		int a[]=st.executeBatch();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ "row affected");
		}
				
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AddBatch a=new AddBatch();
		a.add();

	}

}
