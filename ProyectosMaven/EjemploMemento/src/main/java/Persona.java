
public class Persona {
	private String nombre;
	
	public Memento respaldoMemento() {
		System.out.println("Guardando en Memento...");
		return new Memento(nombre);
	}
	public void recuperarMemento(Memento m) {
		nombre = m.getSavedState();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
