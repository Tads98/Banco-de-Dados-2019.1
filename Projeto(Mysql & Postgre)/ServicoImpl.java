package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ControleFila.Estabelecimento;
import ControleFila.Fila;
import ControleFila.Servico;

public class ServicoImpl implements ServicoDAO {

	@Override
	public List<Servico> listarTodosServico() {
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		
		List<Servico> servico = new ArrayList<Servico>();
		Servico servicoO; 
		
		try {
			conn = ProvedorConexao.getConnection();
			String selectSQL = "SELECT * FROM servico";
			preparedStatement = conn.prepareStatement(selectSQL);
			ResultSet rs  = preparedStatement.executeQuery(selectSQL);
			
			while (rs.next()){
				int id = rs.getInt("id");
		        String nomeServico = rs.getString("nome");
		        String tempo = rs.getString("tempo");
		        String dia = rs.getString("dia");
		        String profissional = rs.getString("profissional");
		        servicoO = new Servico(id, nomeServico, tempo, dia, profissional);
//		        System.out.println(ServicoO.getNomeServico());
		        servico.add(servicoO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return servico;
	}
	
	/*try {
		conn = ProvedorConexao.getConnection();
		String selectSQL = "SELECT * FROM servico";
		preparedStatement = conn.prepareStatement(selectSQL);
		ResultSet rs  = preparedStatement.executeQuery(selectSQL);
		
		while (rs.next()){
			int id = rs.getInt("id");
	        String nomeServico = rs.getString("nome");
	        String tempo = rs.getString("tempo");
	        String dia = rs.getString("dia");
	        String profissional = rs.getString("profissional");
	        servicoO = new Servico(id, nomeServico, tempo, dia, profissional);
//	        System.out.println(ServicoO.getNomeServico());
	        servico.add(servicoO);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return servico;
}*/

	@Override
	public void verServico(Servico servico){
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "SELECT FROM servico WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "SELECT FROM servico WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void salvarServico(Servico servico) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "INSERT INTO servico"
					+ "(id, nome, tempo, dia, profissional) VALUES"
					+ "(?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				preparedStatement.setString(2, servico.getNomeServico());				
				preparedStatement.setString(3,servico.getTempoServico());
				preparedStatement.setString(4,servico.getDiaServico());
				preparedStatement.setString(5,servico.getProfissionalServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "INSERT INTO servico"
					+ "(id, nome, tempo, dia, profissional) VALUES"
					+ "(?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				preparedStatement.setString(2, servico.getNomeServico());				
				preparedStatement.setString(3,servico.getTempoServico());
				preparedStatement.setString(4,servico.getDiaServico());
				preparedStatement.setString(5,servico.getProfissionalServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletarServico(Servico servico) {
		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "DELETE FROM servico WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "DELETE FROM servico WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, servico.getIdServico());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

	@Override
	public void atualizarServico(int ids,String nomes,String tempo, String dia,String profi) {		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "UPDATE servico SET nome = ?, tempo = ?, dia= ?, profissional= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,ids);
				preparedStatement.setString(1,nomes);
				preparedStatement.setString(2,tempo);
				preparedStatement.setString(3,dia);
				preparedStatement.setString(4,profi);
				preparedStatement.setInt(5,ids);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "UPDATE servico SET nome = ?, tempo = ?, dia= ?, profissional= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,ids);
				preparedStatement.setString(1,nomes);
				preparedStatement.setString(2,tempo);
				preparedStatement.setString(3,dia);
				preparedStatement.setString(4,profi);
				preparedStatement.setInt(5,ids);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
}

	/*@Override
	public void atualizarServico(Servico servico) {
		// TODO Auto-generated method stub
		
	}*/


