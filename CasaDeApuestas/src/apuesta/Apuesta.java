package apuesta;

public class Apuesta {

	public Apuesta(int gananciaBruta, int gananciaNeta) {
		super();
		this.gananciaBruta = gananciaBruta;
		this.gananciaNeta = gananciaNeta;
	}
	protected int gananciaBruta;
	protected int gananciaNeta;
	
	public int getGananciaBruta() {
		return gananciaBruta;
	}
	public void setGananciaBruta(int gananciaBruta) {
		this.gananciaBruta = gananciaBruta;
	}
	public int getGananciaNeta() {
		return gananciaNeta;
	}
	public void setGananciaNeta(int gananciaNeta) {
		this.gananciaNeta = gananciaNeta;
	}
	
	
}
