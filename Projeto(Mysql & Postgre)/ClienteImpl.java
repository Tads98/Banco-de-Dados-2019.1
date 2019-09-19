package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ControleFila.Cliente;
import ControleFila.Estabelecimento;

public class ClienteImpl implements ClienteDAO {
	
	//private static final List<Cliente> Cliente = null;
	
	@Override
	
	public List<Cliente> listarTodosCliente() {
	
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
	
	List<Cliente> cliente = new ArrayList<Cliente>();
	Cliente clienteO; 
	
	try {
		conn = ProvedorConexao.getConnection();
		String selectSQL = "SELECT * FROM cliente";
		preparedStatement = conn.prepareStatement(selectSQL);
		ResultSet rs  = preparedStatement.executeQuery(selectSQL);
		
		while (rs.next()){
			int id = rs.getInt("id");
	        String nomeCliente = rs.getString("nome");
	        int idadeCliente = rs.getInt("idadeCliente");
	        int telefone = rs.getInt("telefone");
	        String horario = rs.getString("horario");
	        String dia = rs.getString("dia");
	        clienteO = new Cliente(id, nomeCliente, idadeCliente, telefone, horario, dia);
//	        System.out.println(clienteO.getNomeCliente());
	        cliente.add(clienteO);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return cliente;
	
	
	}
	
	//Listar pelo PgAdmin
	/*try {
		conn = ProvedorConexaoPostgre.getConnection();
		String selectSQL = "SELECT * FROM cliente";
		preparedStatement = conn.prepareStatement(selectSQL);
		ResultSet rs  = preparedStatement.executeQuery(selectSQL);
		
		while (rs.next()){
			int id = rs.getInt("id");
	        String nomeCliente = rs.getString("nome");
	        int idadeCliente = rs.getInt("idadeCliente");
	        int telefone = rs.getInt("telefone");
	        String horario = rs.getString("horario");
	        String dia = rs.getString("dia");
	        clienteO = new Cliente(id, nomeCliente, idadeCliente, telefone, horario, dia);
//	        System.out.println(clienteO.getNomeCliente());
	        cliente.add(clienteO);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return cliente;
	
}*/
	
	@Override
	public void verCliente(Cliente cliente){
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "SELECT FROM cliente WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "SELECT FROM cliente WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
	}

	@Override
	public void salvarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "INSERT INTO cliente"
					+ "(id, nome, idadeCliente, Telefone, Horario, Dia) VALUES"
					+ "(?,?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				preparedStatement.setString(2, cliente.getNome());
				preparedStatement.setInt(3, cliente.getIdadeCliente());
				preparedStatement.setInt(4, cliente.getTelefone());
				preparedStatement.setString(5, cliente.getHorario());
				preparedStatement.setString(6, cliente.getDia());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "INSERT INTO cliente"
					+ "(id, nome, idadeCliente, Telefone, Horario, Dia) VALUES"
					+ "(?,?,?,?,?,?)";
				
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				preparedStatement.setString(2, cliente.getNome());
				preparedStatement.setInt(3, cliente.getIdadeCliente());
				preparedStatement.setInt(4, cliente.getTelefone());
				preparedStatement.setString(5, cliente.getHorario());
				preparedStatement.setString(6, cliente.getDia());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletarCliente(Cliente cliente){
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "DELETE FROM cliente WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "DELETE FROM cliente WHERE id =?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				preparedStatement.setInt(1, cliente.getId());
				int resultado = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void atualizarCliente(int idc, String nomec, int idade,int tel, String hora, String dia) {		
		PreparedStatement preparedStatement;
		Statement stm;
		Connection conn;
		System.out.println(idc+" "+nomec+" "+idade+" "+tel+" "+hora+" "+dia);
		try {
			conn = ProvedorConexao.getConnection();
			String insertTableSQL = "UPDATE cliente SET nome = ?, idadeCliente= ?, telefone= ?, horario= ?, dia= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,idc);
				preparedStatement.setString(1,nomec);
				preparedStatement.setInt(2,idade);
				preparedStatement.setInt(3,tel);
				preparedStatement.setString(4,hora);
				preparedStatement.setString(5,dia);
				preparedStatement.setInt(6,idc);
				int resultado = preparedStatement.executeUpdate();
				System.out.print(resultado+" \n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = ProvedorConexaoPostgre.getConnection();
			String insertTableSQL = "UPDATE cliente SET nome = ?, idadeCliente= ?, telefone= ?, horario= ?, dia= ? WHERE id= ?";
									
				preparedStatement = conn.prepareStatement(insertTableSQL);
				//preparedStatement.setInt(1,idc);
				preparedStatement.setString(1,nomec);
				preparedStatement.setInt(2,idade);
				preparedStatement.setInt(3,tel);
				preparedStatement.setString(4,hora);
				preparedStatement.setString(5,dia);
				preparedStatement.setInt(6,idc);
				int resultado = preparedStatement.executeUpdate();
				System.out.print(resultado+" \n");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
