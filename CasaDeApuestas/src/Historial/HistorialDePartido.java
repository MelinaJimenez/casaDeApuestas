package Historial;

import java.util.ArrayList;
import java.util.List;

import partido.Partido;

public class HistorialDePartido {

	private String oponenteUno;
	private String oponenteDos;
	private Integer partidosGanadosOponenteUno;
	private Integer partidosGanadosOponenteDos;
	private Integer empate;
	//private Integer partidosPerdidosOponenteUno;
	//private Integer partidosPerdidosOponenteDos;
	protected List<Partido> partidosJugados;
	
	public HistorialDePartido(String oponenteUno,String oponenteDos){
		
		this.setOponenteUno(oponenteUno);
		this.setOponenteDos(oponenteDos);
		this.partidosGanadosOponenteUno=0;
		this.partidosGanadosOponenteDos=0;
		this.empate=0;
		//this.partidosPerdidosOponenteUno=0;
		//this.partidosPerdidosOponenteDos=0;
		partidosJugados = new ArrayList<Partido>();
		this.setPartidosJugados(partidosJugados);
	}

	private void setPartidosJugados(List<Partido> partidosJugados2) {
		
		this.partidosJugados= partidosJugados2;
	}

	public void setOponenteDos(String oponenteDos2) {
	 
		this.oponenteDos= oponenteDos2;
		
	}

	public void setOponenteUno(String oponenteUno1) {
		
		this.oponenteUno= oponenteUno1;
	}
	
	public void ganoOponenteUno(Integer num){
		
		this.partidosGanadosOponenteUno= partidosGanadosOponenteUno + num;
		
	}

	public Integer getGanoOponenteUno() {
		
		return partidosGanadosOponenteUno;
	}

	public Integer getPartidosJugados() {
			
		return partidosJugados.size();
	}

	public void seJugoPartido(List<Partido> partidosJugados1) {
		
		this.setPartidosJugados(partidosJugados1);
		
	}

	public void ganoOponenteDos(Integer partidosGanados) {
		
		this.partidosGanadosOponenteDos =partidosGanadosOponenteDos + partidosGanados;
	}

	public Integer getGanoOponenteDos() {
		// TODO Auto-generated method stub
		return partidosGanadosOponenteDos;
	}

	public void empate(int num) {
		
		this.empate= empate + num;
	}

	public Integer getEmpate() {
		
		return empate;
	}
}
