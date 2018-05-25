package testEventoDeportivo;

import static org.junit.Assert.*;

import org.junit.Test;

import eventoDeportivo.EventoDeportivo;

public class TestEventoDeportivo {

	@Test
	public void testDadoUnEventoDeportivoDeFutbolDondeElHistorialDePartidosEntreEllosConstaDe20PartidosElCualBocaGano14PartidosYRiver4EntoncesLaProbabilididadQueGaneBocaEsDe0.7() {
		
		Partido futbol = new Partido(futbol,"21:00,14mayo","Nuñez")
		EventoDeportivo eventoDeportivo= new EventoDeportivo(futbol,bocaRiver);
	}

}
