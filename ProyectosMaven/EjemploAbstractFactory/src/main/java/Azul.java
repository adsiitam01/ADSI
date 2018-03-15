
public class Azul extends Color {
	private boolean esPrimario;

	public void colorea(TV tv) {
		System.out.println("Pintando de azul el " + tv.getDescripcion());
	}
	
	public boolean esPrimario() {
		return esPrimario;
	}
	
	public void setPrimario(boolean esPrimario) {
		this.esPrimario = esPrimario;
	}
	
}
