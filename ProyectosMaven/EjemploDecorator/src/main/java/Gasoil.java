
public class Gasoil extends AutoDecorator {
	
	public Gasoil(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + " Gasoil";
	}

	public int getprecio() {
		return getVendible().getprecio() + 1200;
	}
}
