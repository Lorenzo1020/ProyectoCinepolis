package Main;

import Dominio.Peliculas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Coleccion de objetos
		Peliculas pelicula = new Peliculas("La era de hielo", "Aventura", 450, true);
		Peliculas pelicula2 = new Peliculas("Rapidos y furiosos 2", "Accion", 670, true);

		// Realizar la instancia de clase
		LogicaMetodos imp = new LogicaMetodos();

		// Metodos

		// guardar
		imp.guardar(pelicula);
		imp.guardar(pelicula2);

		// mostrar
		System.out.println(imp.mostrar());

		// Reserva de espacio en memoria
		Peliculas peliculaEnc = null;

		// Buscar
		peliculaEnc = imp.buscar(0);
		System.out.println("Se encontro el registro " + peliculaEnc);

		// para editar primero hay que buscar
		peliculaEnc.setPrecio(500);
		peliculaEnc.setDisponible(false);

		imp.editar(0, peliculaEnc);

		// mostrar
		System.out.println(imp.mostrar());

		// Eliminar
		imp.eliminar(1);

		// mostrar
		System.out.println(imp.mostrar());
		
		
		System.out.println("Hola mundo excelente dia");
		
		System.out.println("Excelente fin de semana");

	}

}
