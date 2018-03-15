import java.util.stream.Stream;

//Esta clase servirá para probar streams utilizando objetos d ela clase Libro.
public class Prueba {

	public static void main(String[] args) {
		
		//Creamos tres objetos de la clase libros.
		Libro l1= new Libro ("El señor de los anillos",1000);
		Libro l2= new Libro ("La fundacion",500);
		Libro l3= new Libro ("El caliz de fuego",600);
		
		Stream<Libro> st = Stream.of(l1, l2, l3);//Creamos un Stream (lector) con los objetos creados anteriormente.
		st.forEach((l) -> System.out.println(l.getTitulo()));//Utilizando el stream imprimimos el titulo de cada libro.
		//Como podemos ver, los Streams van de la mano con las expresiones lambda; uno como lector de datos y el otro como filtro de los mismos.
		
	}

}
