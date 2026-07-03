package Dominio;

public class Peliculas {

	private String nombre;
	private String genero;
	private float precio;
	private boolean disponible;

	public Peliculas(String nombre, String genero, float precio, boolean disponible) {
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + ", disponible="
				+ disponible + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
