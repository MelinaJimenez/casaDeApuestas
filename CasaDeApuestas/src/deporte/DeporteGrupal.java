package deporte;

public class DeporteGrupal extends Deporte{//cambiar nombre en uml
	
	public DeporteGrupal(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	protected String nombreEquipo;

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	//falta resultado()
}
