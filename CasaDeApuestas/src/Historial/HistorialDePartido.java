package Historial;

public class HistorialDePartido {

	private String oponenteUno;
	private String oponenteDos;
	
	public HistorialDePartido(String oponenteUno,String oponenteDos){
		
		this.setOponenteUno(oponenteUno);
		this.setOponenteDos(oponenteDos);
		
	}

	private void setOponenteDos(String oponenteDos2) {
	 
		this.oponenteDos= oponenteDos2;
		
	}

	private void setOponenteUno(String oponenteUno1) {
		
		this.oponenteUno= oponenteUno1;
	}
}
