
public class Prueba {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Persona p = new Persona();
		p.setNombre("Mario");
		p.setNombre("Carlos");
		
		caretaker.agregarMemento(p.respaldoMemento());
		p.setNombre("Rodrigo");
		
		caretaker.agregarMemento(p.respaldoMemento());
		p.setNombre("Paco");
		
		Memento m1 = caretaker.getMemento(0);
		Memento m2 = caretaker.getMemento(1);
		
		System.out.println(m1.getSavedState());
		System.out.println(m2.getSavedState());

	}

}
