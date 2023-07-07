package JDBc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallbleStatement2WithFunction {
	Connection con = null;

	CallbleStatement2WithFunction() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void show_data(int salary) throws ClassNotFoundException, SQLException {

		String sql = "{?=call salary_incre(?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.setInt(2, salary);

		cs.execute();

		String temp = cs.getString(1);
		System.out.println(temp);
	}

	void show_data2(String first, String second) throws ClassNotFoundException, SQLException {

		String sql = "{?=call Add_twoS(first_name,Gender) as\"concat\" from customer(?,?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.setString(2, first);
		cs.setString(3, second);

		cs.execute();

		String temp = cs.getString(1);
		System.out.println(temp);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallbleStatement2WithFunction cs = new CallbleStatement2WithFunction();
		cs.show_data(678800);
		cs.show_data2("pooja", "sharma");

	}

}
