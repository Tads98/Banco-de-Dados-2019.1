package ControleFila;

public class Cliente {
	private int id;
	private String nome;
	private int idadeCliente;
	private int telefone;
	private String horario;
	private String dia;
	
	public Cliente(int id, String nome, int idadeCliente, int telefone, String horario, String dia) {
		super();
		this.id = id;
		this.nome = nome;
		this.idadeCliente = idadeCliente;
		this.telefone = telefone;
		this.horario = horario;
		this.dia = dia;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idadeCliente=" + idadeCliente + ", telefone=" + telefone
				+ ", horario=" + horario + ", dia=" + dia + "]";
	}
}
