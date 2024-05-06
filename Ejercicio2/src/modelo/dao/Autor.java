package modelo.dao;

public class Autor {
 private String nombre;
 private String biografía;
 private String genero;

 public Autor() {
	super();
}

public Autor(String nombre, String biografía, String genero) {
	super();
	this.nombre = nombre;
	this.biografía = biografía;
	this.genero = genero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getBiografía() {
	return biografía;
}

public void setBiografía(String biografía) {
	this.biografía = biografía;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

@Override
public String toString() {
	return "Autor [nombre=" + nombre + ", biografía=" + biografía + ", genero=" + genero + "]";
}

 
}
