package JDBc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class PreParedStatement {

	Connection con = null;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);

	PreParedStatement() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();

	}

	void insert() throws SQLException {
		ps = con.prepareStatement("insert into customer values (?,?,?,?,?)");
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		System.out.println("Enter customer name");
		String name = sc.next();
		System.out.println("Enter customer mobile no");
		String mob = sc.next();
		System.out.println("Enter customer gender");
		String gen = sc.next();
		System.out.println("Enter customer email");
		String email = sc.next();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, mob);
		ps.setString(4, gen);
		ps.setString(5, email);
		int a = ps.executeUpdate();
		System.out.println(a + " row inserted");
	}

	void show() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
		}
	}

	void delete() throws SQLException {
		ps = con.prepareStatement("delete from customer where cust_id=?");
		Statement st = con.createStatement();

		System.out.println("enter id for delete");
		int num = sc.nextInt();
		ps.setInt(1, num);

		int rs = ps.executeUpdate();
//		ResultSet rs1 = st.executeQuery("select * from customer");
//
//		while (rs1.next()) {
//			System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getString(3) + " " + rs1.getString(4)
//					+ " " + rs1.getString(5));
//		}
		System.out.println("delete sucessful.......");

	}

	void update() throws SQLException {
		ps = con.prepareStatement("update customer set moble_no=? where Cust_id= ?");
		// Statement st=con.createStatement();
		// int rs = st.executeUpdate("update customer set moble_no=88889999 where
		// Cust_id= 1");

		System.out.println("enter Update id");
		int id = sc.nextInt();
		System.out.println("enter update mobile number");
		String no = sc.next();
		// System.out.println(id+" "+no);
		ps.setString(1, no);
		ps.setInt(2, id);
		int cs = ps.executeUpdate();
		System.out.println("update sucessful.....");
	}

	void sharch() throws SQLException {
		Statement st = con.createStatement();
		ps = con.prepareStatement("select * from customer where Cust_id=?");
		System.out.println("enter sharch id");
		int id = sc.nextInt();
		// ps.setInt(1, id);
		// ResultSet cs=ps.executeQuery();
		// ResultSet rs = st.executeQuery("select * from customer where Cust_id=?");
		ps.setInt(1, id);
		ResultSet cs = ps.executeQuery();

		while (cs.next()) {
			System.out.println(cs.getInt(1) + " " + cs.getString(2) + " " + cs.getString(3) + " " + cs.getString(4)
					+ " " + cs.getString(5));
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreParedStatement p = new PreParedStatement();
		Scanner can = new Scanner(System.in);
		String y = "";

		do {
			System.out.println("Enter Operation\n1-Insert\n2-Delete\n3-Update\n4-Show\n5-Search");
			int find = can.nextInt();

			switch (find) {
			case 1:
				p.insert();
				System.out.println("------------------------");
				break;

			case 2:
				p.delete();
				System.out.println("------------------------");
				break;

			case 3:
				p.update();
				System.out.println("------------------------");
				break;

			case 4:
				p.show();
				System.out.println("------------------------");
				break;

			case 5:
				p.sharch();
				System.out.println("------------------------");
				break;

			default:
				System.out.println("enter correct option");
			}

			System.out.println("Continue press yes Exit for any key");
			y = can.next();
		} while (y.endsWith("yes"));
//		p.insert();

		// p.delete();

		// p.update();
		// p.show();
//		p.sharch();

	}

}
