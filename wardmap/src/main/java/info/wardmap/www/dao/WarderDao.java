package info.wardmap.www.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import info.wardmap.www.util.DBUtil;
import info.wardmap.www.vo.Warder;

public class WarderDao {
	public ArrayList<Warder> getWader(Connection conn){
		ArrayList<Warder> list = new ArrayList<Warder>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from warder";
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("start3");
			while(rs.next()) {
				System.out.println("in");
				Warder warder = new Warder(rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5));
				list.add(warder);
			}
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
