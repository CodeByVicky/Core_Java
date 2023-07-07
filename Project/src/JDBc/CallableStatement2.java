package JDBc;

import java.util.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement2 {

	Connection con = null;
	CallableStatement cs = null;
	Scanner sc = new Scanner(System.in);

	CallableStatement2() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();

	}

	void callProcedure() throws SQLException {
		cs = con.prepareCall("{call bike_para(?)}");

		System.out.println("Enter rating number");
		int id = sc.nextInt();
		// System.out.println("Enter model id");
		// int m_id=sc.nextInt();
		cs.setInt(1, id);
		// cs.setInt(2, m_id);
		// .executeUpdate()
		boolean b = cs.execute();

		if (true) {

		}
		ResultSet rs = cs.getResultSet();
		while (rs.next()) {

			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getInt(3) + "   " + rs.getInt(4) + "   "
					+ rs.getInt(5) + "   " + rs.getInt(6) + "   " + rs.getInt(7));
		}

		boolean b1 = cs.getMoreResults();
		System.out.println("------");
		if (true) {
			ResultSet rs1 = cs.getResultSet();
			while (rs1.next()) {

				System.out.println(rs1.getInt(1) + "   " + rs1.getString(2) + "   " + rs1.getInt(3) + "   " + rs1.getInt(4) + "   "
						+ rs1.getInt(5) + "   " + rs1.getInt(6) + "   " + rs1.getInt(7));
			}
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatement2 cs = new CallableStatement2();
		cs.callProcedure();

	}

}
