import java.util.ArrayList;

//Como su nombre lo dice, la clase Prueba servirá para crear objetos d ela clase Alumno y utilizar 
//expresiones lambda para obtener información.
public class Prueba {

	public static void main(String[] args) {
		// Creamos objetos (alumnos) de la clase Alumno y los colocamos en una lista de alumnos.
		ArrayList<Alumno> listaAlumnos = new ArrayList();
		 
		listaAlumnos.add(new Alumno(1, "1717213183", "Mario Ivan", "Montes Vidal", "ADSI", 8, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Ariel Andrés", "Montes Vidal", "Algoritmos", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sergio Luis", "Segura Vidal", "algoritmos", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Pablo", "Chacón Mendoza", "Estructuras", 10, 13));
		listaAlumnos.add(new Alumno(7, "1102156732", "Marco Antonio", "Murillo González", "Algoritmos", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Vazquez Velazquez", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Emilio", "Monsivais Guitierrez", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Sara", "Zúñiga Murillo", "C++", 10, 18));
		
		//Ahora probaremos las expresiones lambda para obtener información de dichos alumnos.
		//Sabemos que mediante getters y setters podemos obtener toda la información de los alumnos, pero mediante las
		//funciones lambda podemos estandarizar dichas búsquedas poara cualquier objeto.
		
		//Obtener los alumnos con las notas mayores o igales a 9 en el curso de PHP.
		System.out.println("\nAlumnos con nota mayor a 9 y que sean del curso PHP:");
		// Creamos un Stream (buscador con dirección de entrad ala lista de alumnos).
		listaAlumnos.stream().
		//Se filtran las notas d elos alumnos utilizando la función lamda.
		filter(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP"))//Expresión lambda: alumno -> Nota del alumno
				.forEach(p -> System.out.println(p));
		
		//Obtener todos los alumnos de la lista
		System.out.println("\nAlumnos:");
		listaAlumnos.stream().forEach(a->System.out.println(a));
		


	}

}
