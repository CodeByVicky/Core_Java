package JDBc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class RollbackCommit {

	Statement st;
	Savepoint sav;
	Connection con = null;

	RollbackCommit() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void commited() throws SQLException {
		con.setAutoCommit(false);
		st = con.createStatement();
		String s = "insert into model values(10008,'XXX',4000000)";
		st.executeUpdate(s);
		sav = con.setSavepoint();
		String s1 = "insert into model values(10009,'YYY',40000000)";
		st.executeUpdate(s1);

	}

	void rollback() throws SQLException {
		con.rollback(sav);
	}

	void show() throws SQLException {
		System.out.println("-------------------");
		ResultSet rs = st.executeQuery("select * from model");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " ");
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		RollbackCommit c = new RollbackCommit();
		c.commited();
		c.show();
		c.rollback();
		c.show();

	}

}
