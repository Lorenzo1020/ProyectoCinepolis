package Interface;

import java.util.List;

import Dominio.Peliculas;

//interface es una plantilla para declarar metodos vacios(abstractos)
public interface Metodos {
	
	//Metodos:
	//1--Procedimientos --- no tienen valor de retorno
		//Sintaxis: modificadorAcceso void(vacio) nombreProced(parametros, argumentos, valores entrada);
		
	//2--Funciones --- siempre tienen valor de retorno
		//Sintaxis: modificadorAcceso tipoRetorno(valorSalida) nombreFuncion(parametros, argumentos, valores entrada);
	
	
	public void guardar(Peliculas pelicula);
	
	public List<Peliculas> mostrar();
	
	public Peliculas buscar(int indice);
	
	public void editar(int indice, Peliculas pelicula);
	
	public void eliminar(int indice);

}
