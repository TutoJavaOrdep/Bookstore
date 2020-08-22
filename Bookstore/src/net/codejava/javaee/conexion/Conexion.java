package net.codejava.javaee.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private static Connection conn;

	static Conexion conexionInner;

	private Conexion() {
		this.jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		this.jdbcUsername = "ADMINEXAm";
		this.jdbcPassword = "12345678";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection connect() throws SQLException {

		if (conn == null || conn.isClosed()) {
			conexionInner = new Conexion();
			conn = conexionInner.conn;

		}
		return conn;
	}

	public static void disconnect() throws SQLException {
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
	}

}
