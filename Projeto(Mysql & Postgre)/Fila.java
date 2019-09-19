package ControleFila;

public class Fila {
	private int idFila;
	private String nomeFila;
	private String diaFila;
	private String horaFila;
	
	public Fila(int idFila, String nomeFila, String diaFila, String horaFila) {
		super();
		this.idFila = idFila;
		this.nomeFila = nomeFila;
		this.diaFila = diaFila;
		this.horaFila = horaFila;
	}

	public Fila() {
		// TODO Auto-generated constructor stub
	}

	public int getIdFila() {
		return idFila;
	}

	public void setIdFila(int idFila) {
		this.idFila = idFila;
	}

	public String getNomeFila() {
		return nomeFila;
	}

	public void setNomeFila(String nomeFila) {
		this.nomeFila = nomeFila;
	}

	public String getDiaFila() {
		return diaFila;
	}

	public void setDiaFila(String diaFila) {
		this.diaFila = diaFila;
	}

	public String getHoraFila() {
		return horaFila;
	}

	public void setHoraFila(String horaFila) {
		this.horaFila = horaFila;
	}

	@Override
	public String toString() {
		return "Fila [idFila=" + idFila + ", nomeFila=" + nomeFila + ", diaFila=" + diaFila + ", horaFila=" + horaFila
				+ "]";
	}
			
}
