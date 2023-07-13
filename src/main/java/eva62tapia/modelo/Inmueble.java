package eva62tapia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inmueble {
	
	@Id
	private int id;
	private String nombre;
	private String tipo;
	private String direccion;
	private float precio;
	private float aream2;
	
	public Inmueble() {
		
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getAream2() {
		return aream2;
	}

	public void setAream2(float aream2) {
		this.aream2 = aream2;
	}
	
	
	
	
	
}
