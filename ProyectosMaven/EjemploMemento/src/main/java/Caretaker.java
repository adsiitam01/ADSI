import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> estados = new ArrayList<Memento>();
	
	public void agregarMemento(Memento m) {
		estados.add(m);
	}
	public Memento getMemento(int indice) {
		return estados.get(indice);
	}
}
