package deporte;

import java.util.ArrayList;
import java.util.List;

import deportista.Deportista;

public class Deporte {

	protected String nombre;
	protected List<Deportista> deportistas;
	
	public Deporte(String nombre){
		this.setNombre(nombre);
		//deportistas= new ArrayList<Deportista>();
	//	this.setDeportistas(deportistas);
	}
	
	private void setDeportistas(List<Deportista> deportistas2) {
		
		this.deportistas= deportistas2;
	}

	public String getNombre(){
		return nombre;
		
	//public "" resultado(){} 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
