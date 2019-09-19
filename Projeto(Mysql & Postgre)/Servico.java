package ControleFila;

public class Servico {
	private int idServico;
	private String nomeServico;
	private String tempoServico;
	private String diaServico;
	private String profissionalServico;
	
	public Servico(int idServico, String nomeServico, String tempoServico, String diaServico,
			String profissionalServico) {
		super();
		this.idServico = idServico;
		this.nomeServico = nomeServico;
		this.tempoServico = tempoServico;
		this.diaServico = diaServico;
		this.profissionalServico = profissionalServico;
	}

	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(String tempoServico) {
		this.tempoServico = tempoServico;
	}

	public String getDiaServico() {
		return diaServico;
	}

	public void setDiaServico(String diaServico) {
		this.diaServico = diaServico;
	}

	public String getProfissionalServico() {
		return profissionalServico;
	}

	public void setProfissionalServico(String profissionalServico) {
		this.profissionalServico = profissionalServico;
	}

	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", nomeServico=" + nomeServico + ", tempoServico=" + tempoServico
				+ ", diaServico=" + diaServico + ", profissionalServico=" + profissionalServico + "]";
	}				
}
