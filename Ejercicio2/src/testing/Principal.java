package testing;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

import modelo.dao.Autor;
import modelo.dao.Libro;

public class Principal {

	public static void main(String[] args) {
		Autor autor1=new Autor("Luca", "Su vida ha sido complicada", "Deportivo");
		Libro libro=new Libro(1,"Croacia", 32.24,222,autor1);
		
		
		//To string libro
		System.out.println(libro);
		//Cambiar biografia
		libro.getAutor().setBiografía("Campeon de Liga 2024");
	//Llamar a autor de dos formas distintas	
		System.out.println(autor1);
		System.out.println(libro.getAutor());
	
	//modificar genero y invocar to string
		autor1.setGenero("Fantasia");
		System.out.println(autor1);
	
	
	
	}
	
}
