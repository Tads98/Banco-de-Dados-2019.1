package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ControleFila.Cliente;
import ControleFila.Estabelecimento;
import ControleFila.Fila;

public class FilaImpl implements FilaDAO {

	@Override
	public List<Fila> listarTodosFila() {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		
		List<Fila> fila = new ArrayList<Fila>();
		Fila filaO; 
		
		try {
			conn = ProvedorConexao.getConnection();
			String selectSQL = "SELECT * FROM fila";
			preparedStatement = conn.prepareStatement(selectSQL);
			ResultSet rs  = preparedStatement.executeQuery(selectSQL);
			
			while (rs.next()){
				int id = rs.getInt("id");
		        String nome = rs.getString("nome");
		        String dia = rs.getString("dia");
		        String horario = rs.getString("horario");
		        filaO = new Fila(id, nome, dia, horario);
//		        System.out.println(filaO.getNome());
		        fila.add(filaO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fila;	
}

	/*try {
		conn = ProvedorConexaoPostgre.getConnection();
		String selectSQL = "SELECT * FROM fila";
		preparedStatement = conn.prepareStatement(selectSQL);
		ResultSet rs  = preparedStatement.executeQuery(selectSQL);
		
		while (rs.next()){
			int id = rs.getInt("id");
	        String nome = rs.getString("nome");
	        String dia = rs.getString("dia");
	        String horario = rs.getString("horario");
	        filaO = new Fila(id, nome, dia, horario);
//	        System.out.println(filaO.getNome());
	        fila.add(filaO);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return fila;	
}*/
	
	@Override
	public void verFila(Fila fila){
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "SELECT FROM fila WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "SELECT FROM fila WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void salvarFila(Fila fila) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "INSERT INTO fila"
					+ "(id, nome, dia, horario) VALUES"
					+ "(?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				preparedStatement.setString(2, fila.getNomeFila());
				preparedStatement.setString(3, fila.getDiaFila());
				preparedStatement.setString(4, fila.getHoraFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "INSERT INTO fila"
					+ "(id, nome, dia, horario) VALUES"
					+ "(?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				preparedStatement.setString(2, fila.getNomeFila());
				preparedStatement.setString(3, fila.getDiaFila());
				preparedStatement.setString(4, fila.getHoraFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletarFila(Fila fila) {
		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "DELETE FROM fila WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "DELETE FROM fila WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, fila.getIdFila());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void atualizarFila(int idf, String nomef, String dia, String hora) {		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "UPDATE fila SET nome= ?, dia= ?, horario= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,idf);
				preparedStatement.setString(1,nomef);
				preparedStatement.setString(2,dia);
				preparedStatement.setString(3,hora);
				preparedStatement.setInt(4,idf);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "UPDATE fila SET nome= ?, dia= ?, horario= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,idf);
				preparedStatement.setString(1,nomef);
				preparedStatement.setString(2,dia);
				preparedStatement.setString(3,hora);
				preparedStatement.setInt(4,idf);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
