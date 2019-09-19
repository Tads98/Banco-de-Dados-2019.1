package dao;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ProvedorConexaoPostgre {

	private static Connection conn = null;

	public static Connection getConnection() throws SQLException {
		if (conn == null || conn.isClosed()) {
			conn = criarNovaConexao();
		}
		return conn;
	}
	
	private static Connection criarNovaConexao(){
		
		//ConexaoPostgres
		String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "Google2019@";
        String url = "jdbc:postgresql://localhost:5432/thankunext";
        
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
