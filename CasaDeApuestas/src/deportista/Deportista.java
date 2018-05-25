package deportista;

import java.util.Date;

public class Deportista {

	private String nombreDeportista;//cambiar nombre en el uml
	private String apellido;
	private Date fechaNac;
	private String lugarNac;
	
	public Deportista(String nombreDeportista, String apellido,Date fechaNac,String lugarNac){
		
		this.nombreDeportista=nombreDeportista;
		this.apellido= apellido;
		this.fechaNac= fechaNac;
		this.lugarNac= lugarNac;
	}

	public String getNombreDeportista() {
		return nombreDeportista;
	}

	public void setNombreDeportista(String nombreDeportista) {
		this.nombreDeportista = nombreDeportista;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getLugarNac() {
		return lugarNac;
	}

	public void setLugarNac(String lugarNac) {
		this.lugarNac = lugarNac;
	}
}
