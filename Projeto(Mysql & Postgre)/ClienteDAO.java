package dao;
import java.util.List;

import ControleFila.*;

public interface ClienteDAO {
	public List<Cliente> listarTodosCliente();
	public void verCliente(Cliente cliente);
	public void salvarCliente(Cliente cliente); 
	public void deletarCliente(Cliente cliente);
	public void atualizarCliente(int idc, String nomec,int idade,int tel,String hora, String dia);
}
