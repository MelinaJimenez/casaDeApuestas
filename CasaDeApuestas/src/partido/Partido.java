package partido;

import java.util.ArrayList;
import java.util.List;

import deporte.Deporte;

public class Partido {
	
	private Deporte deporte;
	private List<String> oponentes;
	private String fechaYHora;
	private String lugar;
	private String resultado;
	
	public Partido(Deporte deporte, String fechaYHora, String lugar, String resultado){
		
		this.setDeporte(deporte);
		this.setFechaYHora(fechaYHora);
		this.setLugar(lugar);
		oponentes = new ArrayList<String> ();
		this.setOponentes(oponentes);
		this.setResultado(resultado);
		
	}

	private void setResultado(String resultado2) {
		// Despues borrar
		
		this.resultado= resultado2;
		
	}

	private void setOponentes(List<String> oponentes2) {
		
		this.oponentes= oponentes2;
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
