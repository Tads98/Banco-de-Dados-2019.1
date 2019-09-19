package ControleFila;

public class Estabelecimento {
	private int idEstabelecimento;
	private String nomeEstabelecimento;
	private String cnpj;
	private String ini;
	private String fin;
	
	public Estabelecimento() {

	}
	
	public Estabelecimento(int idEstabelecimento, String nomeEstabelecimento, String cnpj, String ini, String fin) {
		super();
		this.idEstabelecimento = idEstabelecimento;
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.cnpj = cnpj;
		this.ini = ini;
		this.fin = fin;
	}

	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIni() {
		return ini;
	}

	public void setIni(String ini) {
		this.ini = ini;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	@Override
	public String toString() {
		return "Estabelecimento [id=" + idEstabelecimento + ", nome=" + nomeEstabelecimento + ", cnpj=" + cnpj + ", ini=" + ini + ", fin=" + fin + "]";
	}	
}
