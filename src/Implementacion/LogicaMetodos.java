package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Peliculas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos{
	
	private List<Peliculas> lista = new ArrayList<Peliculas>();

	//Polimorfismo de sobreescritura
	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		lista.add(pelicula);
		
	}

	@Override
	public List<Peliculas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Peliculas buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Peliculas pelicula) {
		// TODO Auto-generated method stub
		lista.set(indice, pelicula);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
