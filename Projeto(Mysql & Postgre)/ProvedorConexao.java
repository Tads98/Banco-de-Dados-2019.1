package dao;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ProvedorConexao {

	private static Connection conn = null;

	public static Connection getConnection() throws SQLException {
		if (conn == null || conn.isClosed()) {
			conn = criarNovaConexao();
		}
		return conn;
	}
	
	private static Connection criarNovaConexao(){
      
		//ConexaoMySql
		String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Google2019@";
		String url = "jdbc:mysql://localhost:3306/thankunext?serverTimezone=" + TimeZone.getDefault().getID();
			
			try {
				Class.forName(driver);
				Connection conn = (Connection) DriverManager.getConnection(url, user, senha);
				return conn;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;		
	}
	
	
}
