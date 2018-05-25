package partido;

import java.sql.Date;

import deporte.Deporte;

public class Partido {
	
	private Deporte deporte;
	private List<> oponentes;
	private String fechaYHora;
	private String lugar;
	//private resultado
	
	public Partido(Deporte deporte, String fechaYHora, String lugar){
		
		this.setDeporte(deporte);
		this.setFechaYHora(fechaYHora);
		this.setLugar(lugar);
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public String getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
