package dao;
import java.util.List;

import ControleFila.*;

public interface EstabelecimentoDAO {
	public List<Estabelecimento> listarTodosEstabelecimento();
	public void verEstabelecimento(Estabelecimento estabelecimento);
	public void salvarEstabelecimento(Estabelecimento estabelecimento);
	public void deletarEstabelecimento(Estabelecimento estabelecimento);
	public void atualizarEstabelecimento(int ide,String nomee, String cnpj, String ini,String fin);
}
