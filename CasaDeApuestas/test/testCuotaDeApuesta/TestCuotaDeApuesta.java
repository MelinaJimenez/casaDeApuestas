import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuotaEventoDeportivo {

	@Test
	public void testDadoUnPartidoDeFutbolEntreBocaYRiverGuardoEnSuHistorialQueGanoBoca() {
		
		Deporte futbol     = new Deporte("futbol");
		HistorialDePartido historial = new Historial("Boca","River");
		historial.ganoOponenteUno();
		Partido partido    = new Partido(futbol,["Boca","River"],"21:00,14mayo","Nuñez","ganoBoca");
		
		assertEquals(historial.getGanoOponenteUno(),1);
	}

	
}
