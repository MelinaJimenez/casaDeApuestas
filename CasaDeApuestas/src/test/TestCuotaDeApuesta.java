package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Historial.HistorialDePartido;
import deporte.Deporte;
import partido.Partido;


public class TestCuotaDeApuesta {

	@Test
	public void testDadoUnPartidoDeFutbolEntreBocaYRiverGuardoEnSuHistorialQueGanoBoca() {
		
		Deporte futbol     = new Deporte("futbol");
		HistorialDePartido historial = new HistorialDePartido("Boca","River");
		historial.ganoOponenteUno(1);
		Partido partido1    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		ArrayList<Partido> partidosJugados = new ArrayList<Partido>();
		partidosJugados.add(partido1);
		historial.seJugoPartido(partidosJugados);
		//["Boca","River"]
		assertEquals(historial.getGanoOponenteUno(),new Integer(1));
		assertEquals(historial.getPartidosJugados(),new Integer(1));
	}
	
	@Test
	public void testDadoUnHistorialDe10PartidosEntreBocaYRiverGuardoEnElHistorialQueGanoBoca6Veces() {
		
	 	Deporte futbol     = new Deporte("futbol");
		HistorialDePartido historial = new HistorialDePartido("Boca","River");
		historial.ganoOponenteUno(6);
		Partido partido1    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido2    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido3    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido4    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido5    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido6    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido7    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido8    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido9    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido10    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		//["Boca","River"]
		ArrayList<Partido> partidosJugados = new ArrayList<Partido>();
		partidosJugados.add(partido1);
		partidosJugados.add(partido2);
		partidosJugados.add(partido3);
		partidosJugados.add(partido4);
		partidosJugados.add(partido5);
		partidosJugados.add(partido6);
		partidosJugados.add(partido7);
		partidosJugados.add(partido8);
		partidosJugados.add(partido9);
		partidosJugados.add(partido10);
		historial.seJugoPartido(partidosJugados);
		assertEquals(historial.getGanoOponenteUno(),new Integer(6));
		assertEquals(historial.getPartidosJugados(),new Integer(10));
	}
	
	@Test
	public void testDadoUnHistorialDe10PartidosEntreBocaYRiverGuardoEnElHistorialQueGanoBoca6VecesYRiver2Veces() {
		
		Deporte futbol     = new Deporte("futbol");
		HistorialDePartido historial = new HistorialDePartido("Boca","River");
		historial.ganoOponenteUno(6);
		historial.ganoOponenteDos(2);
		Partido partido1    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido2    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido3    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido4    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoRiver");
		Partido partido5    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido6    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoRiver");
		Partido partido7    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido8    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido9    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido10    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		//["Boca","River"]
		ArrayList<Partido> partidosJugados = new ArrayList<Partido>();
		partidosJugados.add(partido1);
		partidosJugados.add(partido2);
		partidosJugados.add(partido3);
		partidosJugados.add(partido4);
		partidosJugados.add(partido5);
		partidosJugados.add(partido6);
		partidosJugados.add(partido7);
		partidosJugados.add(partido8);
		partidosJugados.add(partido9);
		partidosJugados.add(partido10);
		historial.seJugoPartido(partidosJugados);
		assertEquals(historial.getGanoOponenteUno(),new Integer(6));
		assertEquals(historial.getGanoOponenteDos(),new Integer(2));
		assertEquals(historial.getPartidosJugados(),new Integer(10));
	
	}

	@Test
	public void testDadoUnHistorialDe10PartidosEntreBocaYRiverGuardoEnElHistorialQueGanoBoca6VecesRiver2VecesYElRestoEmpate() {
		
		Deporte futbol     = new Deporte("futbol");
		HistorialDePartido historial = new HistorialDePartido("Boca","River");
		historial.ganoOponenteUno(6);
		historial.ganoOponenteDos(2);
		historial.empate(2);
		Partido partido1    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido2    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido3    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido4    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoRiver");
		Partido partido5    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido6    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoRiver");
		Partido partido7    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido8    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido9    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		Partido partido10    = new Partido(futbol,"21:00,14mayo","Nuñez","ganoBoca");
		//["Boca","River"]
		ArrayList<Partido> partidosJugados = new ArrayList<Partido>();
		partidosJugados.add(partido1);
		partidosJugados.add(partido2);
		partidosJugados.add(partido3);
		partidosJugados.add(partido4);
		partidosJugados.add(partido5);
		partidosJugados.add(partido6);
		partidosJugados.add(partido7);
		partidosJugados.add(partido8);
		partidosJugados.add(partido9);
		partidosJugados.add(partido10);
		historial.seJugoPartido(partidosJugados);
		//["Boca","River"]
		assertEquals(historial.getGanoOponenteUno(),new Integer(6));
		assertEquals(historial.getGanoOponenteDos(),new Integer(2));
		assertEquals(historial.getEmpate(),new Integer(2));
		assertEquals(historial.getPartidosJugados(),new Integer(10));
	}


}
