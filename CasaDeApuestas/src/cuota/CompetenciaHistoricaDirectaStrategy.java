package cuota;

public class CompetenciaHistoricaDirectaStrategy implements CuotaStrategy {
	
	//@Override
	public float calcularProbabilidadDeGanar(HistorialDelPartido historial){
		
	return historial.getGanoOponenteUno / historial.getPartidosJugados();
	}

}
