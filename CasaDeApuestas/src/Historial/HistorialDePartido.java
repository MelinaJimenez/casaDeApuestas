package Historial;

public class HistorialDePartido {

	private String oponenteUno;
	private String oponenteDos;
	private Integer partidosGanadosOponenteUno;
	private Integer partidosGanadosOponenteDos;
	
	public HistorialDePartido(String oponenteUno,String oponenteDos){
		
		this.setOponenteUno(oponenteUno);
		this.setOponenteDos(oponenteDos);
		
	}

	public void setOponenteDos(String oponenteDos2) {
	 
		this.oponenteDos= oponenteDos2;
		
	}

	public void setOponenteUno(String oponenteUno1) {
		
		this.oponenteUno= oponenteUno1;
	}
	
	public void ganoOponenteUno(){
		
		this.partidosGanadosOponenteUno= partidosGanadosOponenteUno + 1;
		
	}
}
