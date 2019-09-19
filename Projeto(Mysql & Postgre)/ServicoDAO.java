package dao;
import java.util.List;

import ControleFila.*;

public interface ServicoDAO {
	public List<Servico> listarTodosServico();
	public void verServico(Servico servico);
	public void salvarServico(Servico servico);
	public void deletarServico(Servico servico);
	public void atualizarServico(int ids,String nomes,String tempo, String dia,String profi);
}