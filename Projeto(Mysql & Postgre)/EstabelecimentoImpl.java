package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ControleFila.Cliente;
import ControleFila.Estabelecimento;

public class EstabelecimentoImpl implements EstabelecimentoDAO {

	private static final List<Estabelecimento> Estabelecimento = null;

	@Override
	public List<Estabelecimento> listarTodosEstabelecimento() {
		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		
		List<Estabelecimento> estabelecimento = new ArrayList<Estabelecimento>();
		Estabelecimento estabelecimentoO; 
		
		try {
			conn = ProvedorConexao.getConnection();
			String selectSQL = "SELECT * FROM estabelecimento";
			preparedStatement = conn.prepareStatement(selectSQL);
			ResultSet rs  = preparedStatement.executeQuery(selectSQL);
			
			while (rs.next()){
				int id = rs.getInt("idEstabelecimento");
		        String nomeEstabelecimento = rs.getString("nomeEstabelecimento");
		        String cnpj = rs.getString("cnpj");
		        String ini = rs.getString("ini");
		        String fin = rs.getString("fin");
		        estabelecimentoO = new Estabelecimento(id, nomeEstabelecimento, cnpj, ini, fin);
//		        System.out.println(estabelecimentoO.getNomeEstabelecimento());
		        estabelecimento.add(estabelecimentoO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return estabelecimento;
	}
	
	/*try {
		conn = ProvedorConexaoPostgre.getConnection();
		String selectSQL = "SELECT * FROM estabelecimento";
		preparedStatement = conn.prepareStatement(selectSQL);
		ResultSet rs  = preparedStatement.executeQuery(selectSQL);
		
		while (rs.next()){
			int id = rs.getInt("idEstabelecimento");
	        String nomeEstabelecimento = rs.getString("nomeEstabelecimento");
	        String cnpj = rs.getString("cnpj");
	        String ini = rs.getString("ini");
	        String fin = rs.getString("fin");
	        estabelecimentoO = new Estabelecimento(id, nomeEstabelecimento, cnpj, ini, fin);
//	        System.out.println(estabelecimentoO.getNomeEstabelecimento());
	        estabelecimento.add(estabelecimentoO);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return estabelecimento;
}*/

	@Override
	public void verEstabelecimento(Estabelecimento estabelecimento){
	//TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "SELECT FROM estabelecimento WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "SELECT FROM estabelecimento WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
	}

	@Override
	public void salvarEstabelecimento(Estabelecimento estabelecimento) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "INSERT INTO estabelecimento"
					+ "(idEstabelecimento, nomeEstabelecimento, cnpj, ini, fin) VALUES"
					+ "(?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				preparedStatement.setString(2, estabelecimento.getNomeEstabelecimento());
				preparedStatement.setString(3, estabelecimento.getCnpj());
				preparedStatement.setString(4, estabelecimento.getIni());
				preparedStatement.setString(5, estabelecimento.getFin());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "INSERT INTO estabelecimento"
					+ "(idEstabelecimento, nomeEstabelecimento, cnpj, ini, fin) VALUES"
					+ "(?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				preparedStatement.setString(2, estabelecimento.getNomeEstabelecimento());
				preparedStatement.setString(3, estabelecimento.getCnpj());
				preparedStatement.setString(4, estabelecimento.getIni());
				preparedStatement.setString(5, estabelecimento.getFin());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deletarEstabelecimento(Estabelecimento estabelecimento) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "DELETE FROM estabelecimento WHERE idEstabelecimento =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "DELETE FROM estabelecimento WHERE idEstabelecimento =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, estabelecimento.getIdEstabelecimento());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void atualizarEstabelecimento(int ide,String nomee, String cnpj, String ini,String fin) {		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "UPDATE estabelecimento SET nomeEstabelecimento= ?, cnpj= ?, ini= ?, fin= ? WHERE idEstabelecimento= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,ide);
				preparedStatement.setString(1,nomee);
				preparedStatement.setString(2,cnpj);
				preparedStatement.setString(3,ini);
				preparedStatement.setString(4,fin);
				preparedStatement.setInt(5,ide);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "UPDATE estabelecimento SET nomeEstabelecimento= ?, cnpj= ?, ini= ?, fin= ? WHERE idEstabelecimento= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,ide);
				preparedStatement.setString(1,nomee);
				preparedStatement.setString(2,cnpj);
				preparedStatement.setString(3,ini);
				preparedStatement.setString(4,fin);
				preparedStatement.setInt(5,ide);
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
