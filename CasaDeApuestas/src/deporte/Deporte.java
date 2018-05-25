package deporte;

import java.util.ArrayList;
import java.util.List;

import deportista.Deportista;

public class Deporte {

	protected String nombre;
	protected List<Deportista> deportistas;
	
	public Deporte(String nombre){//me falta inicializar  la lista
		this.setNombre(nombre);
		deportistas= new ArrayList<Deportista>();
	}
	
	public String getNombre(){
		return nombre;
		
	//public "" resultado(){} 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
