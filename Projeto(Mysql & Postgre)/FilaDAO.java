package dao;
import java.util.List;

import ControleFila.*;

public interface FilaDAO {
	public List<Fila> listarTodosFila();
	public void verFila(Fila fila);
	public void salvarFila(Fila fila);
	public void deletarFila(Fila Fila);
	public void atualizarFila(int idf, String nomef, String dia, String hora);
}