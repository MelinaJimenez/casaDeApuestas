package eventoDeportivo;

import partido.Partido;

public class EventoDeportivo {

	public EventoDeportivo(Partido partido, String nombreEventoDeportivo) {
		super();
		
		this.partido = partido;
		this.nombreEventoDeportivo = nombreEventoDeportivo;
	}
	
	private  Partido partido;
	private String nombreEventoDeportivo;
	
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public String getNombreEventoDeportivo() {
		return nombreEventoDeportivo;
	}
	public void setNombreEventoDeportivo(String nombreEventoDeportivo) {
		this.nombreEventoDeportivo = nombreEventoDeportivo;
	}
	
	public int calcularCuota(){
		return 0;
	}
	
}
