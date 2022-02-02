package mysqlservice;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConServiceable {
	Connection getCon(String url, String root, String pass) throws SQLException;
	void getUpdate(Connection con, String id, double salary) throws SQLException, IdNotFoundException;
	

}
